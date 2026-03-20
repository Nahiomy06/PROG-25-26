import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Persona {

    private String Nombre;
//    private LocalDate FechaNacimiento;
    private String DNI;
    private String Direccion;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



    public Persona(String nombre /*, LocalDate fechaNacimiento */, String dni, String direccion) {
        this.Nombre = nombre;
//        this.FechaNacimiento = fechaNacimiento;
        this.DNI = dni;
        this.Direccion = direccion;


    }

    public String getNombre() {
        return Nombre;
    }

//    public String getFechaNacimientoFormato(){
//        return this.FechaNacimiento.format(formatter);
//    }

    public String getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }


    @Override
    public String toString() {
        return  "Nombre: " + Nombre + '\'' +
//                ", FechaNacimiento: " + FechaNacimiento.format(formatter) +
                ", DNI: " + DNI + '\'' +
                ", Direccion: " + Direccion + '\'' +
                ", formatter: " + formatter ;
    }
}
