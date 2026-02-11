import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Alumno implements Serializable {


    @Serial
    private static final long serialVersionUID = 1309469631694126527L;

    private String nombre;
    private String apellido;
    private int edad;

    private List<Calificacion> calificaciones;


    public  Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.calificaciones = new LinkedList<>();

    }

    public void Calificar(String Asignatura, int Notas) {
        this.calificaciones.add(new Calificacion(Asignatura, Notas));
    }

   public List<Calificacion> getCalificaciones() {
        return calificaciones;
   }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\n' +
                "apellido='" + apellido + '\n' +
                "edad=" + edad + '\n' +
                "calificaciones=" + '\n' +
                calificaciones ;
    }
}
