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
        
        AlumnoEntidades marcelo = new AlumnoEntidades(26, "Camian", "Fulanito", LocalDate.MIN.of(2001, Month.MARCH, 15), true);
        AlumnoEntidades joni = new AlumnoEntidades(27, 3049858, "Sen", "Carlos", LocalDate.MIN.of(5, Month.MARCH, 10), true);
        
        //AlumnoData
        
//        System.out.println(alud.buscarAlumno(9));
//        System.out.println( alud.buscarAlumnoPorDni(2689789));
//          for (AlumnoEntidades alu : alud.listarAlumnos()) {
//                System.out.println(alu);
//        }
//          alud.guardarAlumno(marcelo);
                
//            alud.modificarAlumno(joni); 
            alud.eliminarAlumno(9);
                     
        
//        System.out.println(insD.obtenerAlumnosPorMateria(1));
        
//        alud.modificarAlumno(marcelo);
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

