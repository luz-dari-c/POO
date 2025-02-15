package Taller1;


public class Estudiante {
    public String nombre;
    public float edad;
    public String curso;

    public Estudiante(){
        nombre = "Daniela";
        edad = 18;
        curso = "Ingles";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Estudiante (String nombre, float edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    public Estudiante (String curso){
        this.curso = curso;
    }

    public  Estudiante (String nombre, float edad, String curso){

        this(curso);
        this.nombre = nombre;
        this.edad = edad;

    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\n Curso: " + curso ;
    }
}
