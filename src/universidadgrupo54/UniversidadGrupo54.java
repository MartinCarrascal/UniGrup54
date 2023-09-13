/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54;

import java.time.LocalDate;
import java.time.Month;
import universidadgrupo54.accesoDatos.AlumnoData;
import universidadgrupo54.accesoDatos.MateriaData;
import universidadgrupo54.entidades.Alumno;
import universidadgrupo54.entidades.Materia;

/**
 *
 * @author Pablo
 */
public class UniversidadGrupo54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Alumno martin = new Alumno(4,30496959, "Perez", "Juan martin", LocalDate.of(1996, Month.MARCH, 25), true);
        Alumno dani = new Alumno(2689789, "Conte", "Daniel", LocalDate.of(2020, Month.MARCH, 21),true);
        Materia analisis = new Materia(2,"Analisis matematico 4", 2019, true);
        AlumnoData alumno = new AlumnoData();
        MateriaData materia = new MateriaData();
        
//        alumno.guardarAlumno(dani);
//         System.out.println( alumno.buscarAlumno(4));
//          System.out.println(alumno.buscarAlumnoPorDni(30496959));
//            for (Alumno alu : alumno.listarAlumnos()) {
//                System.out.println(alu);
//            }
//            alumno.modificarAlumno(martin);
//              alumno.eliminarAlumno(8);


//            materia.guardarMateria(analisis);
//            System.out.println(materia.buscarMateria(1));
//              materia.modificarMateria(analisis);
//              materia.eliminarMateria(2);
              for (Materia mat : materia.listarMateria()) {
                  System.out.println(mat);
        }
         
        }
        
        
    }
    

