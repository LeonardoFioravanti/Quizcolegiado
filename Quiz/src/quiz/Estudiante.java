package quiz;

public class Estudiante {
    private String nombre;
    private String curso;
    private String profesor;
    private double calificacion;

    public Estudiante(String nombre, String curso, String profesor, double calificacion) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}