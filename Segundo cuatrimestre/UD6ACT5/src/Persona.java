
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    private String DNI;
    private String Nombre;
    private String Direccion;
    private LocalDate FechaNacimiento;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Persona(String DNI, String Nombre, String Direccion, LocalDate FechaNacimiento ) {
        if (Period.between(LocalDate.now(), FechaNacimiento).getYears() < 18) {
            throw new IllegalArgumentException();
        }
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }


    public String getFechaNacimiento() {
        return FechaNacimiento.format(formatter);
    }


    @Override
    public String toString() {

        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'';
    }










//            LocalDate.now().minusYears(18);





}
