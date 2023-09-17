/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.accesoDatos;

/**
 *
 * @author Pablo
 */
public class Main {
    public static void main(String[] args) {
        
        InscripcionData insD = new InscripcionData();
        
        System.out.println( insD.obtenerMateriasCursadas(2));
    }
}
