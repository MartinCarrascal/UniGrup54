/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo54.entidades.AlumnoEntidades;
import universidadgrupo54.entidades.InscripcionEntidades;
import universidadgrupo54.entidades.MateriaEntidades;

/**
 *
 * @author Pablo
 */
public class InscripcionData {

    private Connection connection = null;

    public InscripcionData() {
        try {
            connection = Conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    AlumnoData alumD = new AlumnoData();
    MateriaData matD = new MateriaData();

    public AlumnoEntidades buscarAlumno(int id) {
        AlumnoData newAlu = new AlumnoData();
        AlumnoEntidades mate = new AlumnoEntidades();
        //System.out.println(mate);
        mate = newAlu.buscarAlumno(id);
        return mate;
    }   //FUNCIONA

    public MateriaEntidades buscarMateria(int id) {
        MateriaData newMate = new MateriaData();
        MateriaEntidades mate = new MateriaEntidades();
        //System.out.println(mate);
        mate = newMate.buscarMateria(id);
        return mate;
    }
    
    public InscripcionEntidades buscarInscripcion(int id) {
        InscripcionEntidades curs = null;
        String sql = "SELECT * FROM inscripcion WHERE inscripcion.idInscripto=?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            //System.out.println(id);
            if (rs.next()) {
                //System.out.println(rs.getInt(3));
                curs = new InscripcionEntidades();
                curs.setIdInscripto(rs.getInt(1));
                //System.out.println(id);
                //System.out.println(buscarAlumno(rs.getInt(2)));
                AlumnoEntidades a = buscarAlumno(rs.getInt(3));
                MateriaEntidades m = buscarMateria(rs.getInt(4));
                //System.out.println(a);
                //System.out.println(m);
                curs.setAlumno(a);
                curs.setMateria(m);
                curs.setNota(rs.getDouble(4));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return curs;
    }
    
    public void guardarInscripcion(InscripcionEntidades ins) {

        String sql = "INSERT INTO inscripcion ( nota, idAlumno, idMateria) VALUES (?,?,?);";

        try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setDouble(1, ins.getNota());
            ps.setInt(2, ins.getAlumno().getIdAlumno());
            ps.setInt(3, ins.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ins.setIdInscripto(1);
                mensaje("Inscripcion realizada");
            } else {
                mensaje("Inscripcion fallida");
            }

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla inscripcion " + e.getMessage());
        }
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito = ps.executeUpdate();

            if (exito > 0) {
                mensaje("Inscripcion borrada exitosamente");

            }

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla inscripcion " + e.getMessage());
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota) {

        String sql = " UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
        //System.out.println(idMateria);
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int exito = ps.executeUpdate();
            if (exito > 0) {
                mensaje("Nota actualizada correctamente");

            }

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla inscripcion " + e.getMessage());
        }
    }

    public List<MateriaEntidades> obtenerMateriasCursadas(int id) {
        List<MateriaEntidades> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria IN "
                + "(SELECT idMateria FROM inscripcion WHERE inscripcion.idAlumno = ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            MateriaEntidades materia;

            while (rs.next()) {
                materia = new MateriaEntidades();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getString("anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException e) {
            mensaje("Error al obtener inscripciones " + e.getMessage());
        }
        return materias;
    }
 
    public List<InscripcionEntidades> obtenerInscripcion() {

        ArrayList<InscripcionEntidades> lista = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                InscripcionEntidades insc = new InscripcionEntidades();
                insc.setIdInscripto(rs.getInt("idInscripto"));
                AlumnoEntidades alu = alumD.buscarAlumno(rs.getInt("idAlumno"));
                MateriaEntidades mat = matD.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                lista.add(insc);
            }
            ps.close();
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla inscripcion  " + e.getMessage());
        }
        return lista;
    }

    public List<InscripcionEntidades> obtenerInscripcionPorAlumno(int idAlumno) {

        ArrayList<InscripcionEntidades> lista = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion,materia WHERE idAlumno = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                InscripcionEntidades insc = new InscripcionEntidades();
                insc.setIdInscripto(rs.getInt("idInscripto"));
                AlumnoEntidades alu = alumD.buscarAlumno(rs.getInt("idAlumno"));
                MateriaEntidades mat = matD.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                lista.add(insc);
            }
            ps.close();
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla inscripcion  " + e.getMessage());
        }
        return lista;
    }
    
    public List<InscripcionEntidades> obtenerInscripcionNoRepetida(int idAlumno) {

        ArrayList<InscripcionEntidades> lista = new ArrayList<>();

        String sql = "SELECT DISTINCT inscripcion.*, materia.*\n" +
                        "FROM inscripcion\n" +
                        "INNER JOIN materia ON inscripcion.idMateria = materia.idMateria\n" +
                        "WHERE inscripcion.idAlumno = ?;"; //Esta consulta me permite traer las materias inscriptas por el alumna pero sin repetirse

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                InscripcionEntidades insc = new InscripcionEntidades();
                insc.setIdInscripto(rs.getInt("idInscripto"));
                AlumnoEntidades alu = alumD.buscarAlumno(rs.getInt("idAlumno"));
                MateriaEntidades mat = matD.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                lista.add(insc);
            }
            ps.close();
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla inscripcion  " + e.getMessage());
        }
        return lista;
    }
    

    public List<MateriaEntidades> obtenerMateriasNoCursadas(int idAlumno) {

        List<MateriaEntidades> lista = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN "
                + "(SELECT idMateria FROM inscripcion WHERE inscripcion.idAlumno = ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                MateriaEntidades materia = new MateriaEntidades();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getString("anio"));
                lista.add(materia);
            }
            ps.close();

        } catch (SQLException e) {
            mensaje("Error al obtener inscripciones " + e.getMessage());
        }
            return lista;
    }
    
    public List<AlumnoEntidades> obtenerAlumnosPorMateria( int idMateria) {
        
        List<AlumnoEntidades> lista = new ArrayList<>();
        
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado =1";
        
        try(PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                AlumnoEntidades alumno = new AlumnoEntidades();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                lista.add(alumno);
            }
            
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla Inscripcion " + e.getMessage());
        }
        return lista;
    }
}
