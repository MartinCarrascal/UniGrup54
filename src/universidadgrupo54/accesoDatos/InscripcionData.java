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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo54.entidades.AlumnoEntidades;
import universidadgrupo54.entidades.Materia_Entidades;

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
        JOptionPane.showConfirmDialog(null, mensaje);
    }
    
    
    AlumnoData alumD = new AlumnoData();
    MateriaData matD = new MateriaData();
   
    
    public List<Materia_Entidades> obtenerMateriasCursadas(int id) {
        List<Materia_Entidades> materias = new ArrayList<>();
        
        String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion,"
                + "materia WHERE inscripcion.idMateria = materia.idMateria \n "
                + "AND inscripcion.idAlumno =?;";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia_Entidades materia;
            
            while (rs.next()) {                
                materia = new Materia_Entidades();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException e) {
            mensaje("Error al obtener inscripciones " + e.getMessage() );
        }
        return materias;
    }
    
    
    
}
