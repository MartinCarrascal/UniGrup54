/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.accesoDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import universidadgrupo54.entidades.Alumno;

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
    
    Alumno alumno = new Alumno();
    AlumnoData alumD = new AlumnoData();
    
    
    
}
