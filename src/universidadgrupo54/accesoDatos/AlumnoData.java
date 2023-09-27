/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.accesoDatos;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.Date;
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

/**
 *
 * @author Pablo
 */
public class AlumnoData {

    private Connection connection = null;

    public AlumnoData() {
        
        try {
            connection = Conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

       

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void guardarAlumno(AlumnoEntidades alumno) {

        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado()); 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                mensaje("Se agrego el alumno exitosamente");
                ps.close();
            }
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla Alumno" + e.getMessage());
        }

    }

    public AlumnoEntidades buscarAlumno(int id) {

        AlumnoEntidades alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new AlumnoEntidades();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {
                mensaje("No exixte el alumno");
                ps.close();
            }
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla alumno" + e.getMessage());
        }
        //System.out.println(alumno);
        return alumno;
    }

    public AlumnoEntidades buscarAlumnoPorDni(int dni) {

        AlumnoEntidades alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento, estado FROM alumno WHERE dni = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new AlumnoEntidades();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(dni);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                mensaje("No exixte el alumno");
                ps.close();
            }
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla alumno" + e.getMessage());
        }
        return alumno;
    }

    public List<AlumnoEntidades> listarAlumnos() {

        ArrayList<AlumnoEntidades> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno WHERE estado = 1 ";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AlumnoEntidades alumno = new AlumnoEntidades(); 

                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                //System.out.println(alumno);
                alumnos.add(alumno);
            }
            //System.out.println(alumnos);
            ps.close(); 

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla alumno" + e.getMessage());
        }
        return alumnos;
    }

    public void modificarAlumno(AlumnoEntidades alumno) {
        //Para modificar poner en el constructor del main el id y modificas el campo que quieras cambiar
        //despues llamas al metodo y le pasa el alumno que creaste

        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
            PreparedStatement ps = null;
        try  {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                mensaje("El alumno " + alumno.getApellido() + " fue modificado con exito");
            }else {
                mensaje("El alumno no existe");
            }
            ps.close();

        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla alumno " + e.getMessage());
        }
        
    }
    
    public void eliminarAlumno(int id) {
       //Paso el id del alumno que quiero eliminar en el metodo 
        
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
        
        try(PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
           int exito = ps.executeUpdate();
           
            if (exito ==1) {
                mensaje("Se elimino el alumno");
            }else {
                mensaje("El alumno no se pudo eliminar");
            }
            
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla alumno " + e.getMessage());
        }
    }

}
