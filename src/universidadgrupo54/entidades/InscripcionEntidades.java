/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.entidades;

/**
 *
 * @author Pablo
 */
public class InscripcionEntidades {
    
     
    private int idInscripto;
    private AlumnoEntidades alumno;
    private MateriaEntidades materia;
    private int nota;

    public InscripcionEntidades() {
    }

    public InscripcionEntidades(AlumnoEntidades alumno, MateriaEntidades materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public InscripcionEntidades(int idInscripto, AlumnoEntidades alumno, MateriaEntidades materia, int nota) {
        this.idInscripto = idInscripto;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public AlumnoEntidades getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoEntidades alumno) {
        this.alumno = alumno;
    }

    public MateriaEntidades getMateria() {
        return materia;
    }

    public void setMateria(MateriaEntidades materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String  insc = idInscripto + " " + alumno.getApellido() + " " + alumno.getNombre() + " " + materia.getNombre();
        return insc;
        
    }
    
    
}
