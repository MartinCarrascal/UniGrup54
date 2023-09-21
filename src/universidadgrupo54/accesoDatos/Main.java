/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.accesoDatos;

import java.time.LocalDate;
import java.time.Month;
import universidadgrupo54.entidades.AlumnoEntidades;
import universidadgrupo54.entidades.InscripcionEntidades;
import universidadgrupo54.entidades.MateriaEntidades;

/**
 *
 * @author Pablo
 */
public class Main {
    public static void main(String[] args) {
        
        AlumnoData alud = new AlumnoData();
        InscripcionData insD = new InscripcionData();
        MateriaData matD = new MateriaData();
        MateriaEntidades mat = new MateriaEntidades();
        
        AlumnoEntidades marcelo = new AlumnoEntidades(2000, "Carozo", "Fabio", LocalDate.MIN.of(2003, Month.MARCH, 10), true);
        
        
        
        alud.modificarAlumno(marcelo);
//        System.out.println( insD.obtenerMateriasCursadas(2));
//         insD.actualizarNota(8, 1, 10);
//           insD.borrarInscripcionMateriaAlumno(14, 7);

//            for (InscripcionEntidades inscripcion : insD.obtenerInscripcion()) {
//                System.out.println(" id " + inscripcion.getIdInscripto());
//                System.out.println(" apellido " + inscripcion.getAlumno().getApellido());
//                System.out.println(" Materia " + inscripcion.getMateria().getNombre());
//        }

//          for (MateriaEntidades mate : insD.obtenerMateriasNoCursadas(12)) {
//                 System.out.println("nombre " + mate.getNombre() );
        }

    }

