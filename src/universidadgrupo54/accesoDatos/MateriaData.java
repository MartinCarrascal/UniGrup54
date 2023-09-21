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
import universidadgrupo54.entidades.MateriaEntidades;

/**
 *
 * @author Pablo
 */
public class MateriaData {
    
    private Connection connection = null;
    
    public MateriaData() {
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
     
     public void guardarMateria(MateriaEntidades materia) {
         
         String sql = "INSERT INTO materia(nombre, anio, estado) VALUES (?,?,?)";
         
            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(1);
                mensaje("La materia " + materia.getNombre() + " se cargo exitosamente");
            }else{
                mensaje("La materia " + materia.getNombre() + " nose pudo cargar");
            }

        } catch (SQLException e) {
            mensaje("La materia no se pudo cargar " + e.getMessage());
        }
    }
     
     public MateriaEntidades buscarMateria(int id) {
         MateriaEntidades materia = null;
         String sql = "SELECT nombre, anio FROM materia WHERE idMateria = ? AND estado = 1";
         PreparedStatement ps = null;
         try {
             ps = connection.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs = ps.executeQuery();
             
             if (rs.next()) {
                 materia = new MateriaEntidades();
                 materia.setIdMateria(id);
                 materia.setNombre(rs.getNString("nombre"));
                 materia.setAnio(rs.getInt("anio"));
                 materia.setEstado(rs.getBoolean("anio"));
                 
             }else{
                 mensaje("no existe la materia");
             }
         } catch (SQLException e) {
             mensaje("Error al acceder a la tabla materia "+ e.getMessage());
         }
         return materia;
     }
     
    public void modificarMateria(MateriaEntidades materia) {
        //Para modificar agregar al objeto materia el idMateria correspondiente y
        //pasarselo por parametro al metodo
       
        String sql = "UPDATE materia SET  nombre = ?, anio = ? WHERE idMateria = ?";
        
        try(PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                mensaje("La materia " + materia.getNombre() + " fue modificada exitosamente");
            }else{
                mensaje("La materia no exixte");
            }
            
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla materia " + e.getMessage());
        }
    }
    
    public void eliminarMateria(int id) {
        //Para eliminar pasar por parametro en el metodo el id de la materia 
        
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
        
        try(PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                mensaje("La materia se elimino exitosamente" );
            }else {
                mensaje("La materia no se elimino");
            }
        } catch (SQLException e) {
            mensaje("Error al acceder a la tabla materia " + e.getMessage());
        }
    }
    
    public List<MateriaEntidades> listarMateria() {
        
        List<MateriaEntidades> lista = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1 ";
        
        try(PreparedStatement ps = connection.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {  
                MateriaEntidades materia = new MateriaEntidades();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
                lista.add(materia);
            }
            
        } catch (SQLException e) {
            mensaje("Error al cargar la tabla materia " + e.getMessage());
        }
        return lista;
    }
    
    
    public List<MateriaEntidades> listarMateriaConWhere(String where) {
        
        List<MateriaEntidades> lista = new ArrayList<>();
        String sql = "SELECT m.* FROM materia m WHERE  m.estado = 1 "+ where;
       
        try(Statement ps = connection.createStatement(); ResultSet rs = ps.executeQuery(sql)) {
            while (rs.next()) {  
                MateriaEntidades materia = new MateriaEntidades();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
                lista.add(materia);
            }
            
        } catch (SQLException e) {
            mensaje("Error al cargar la tabla materia " + e.getMessage());
        }
        return lista;
    }
}
