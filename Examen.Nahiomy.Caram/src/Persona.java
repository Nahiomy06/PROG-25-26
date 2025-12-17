import java.time.LocalDate;

public class Persona {
    private String Nombre;
    private LocalDate FechaNacimiento;
    private String Dni;
    private String Direccion;
    private String Ncontratos;




    public Persona(String Nombre, String Dni, String Direccion, String Ncontratos) {


        this.Nombre = Nombre;
        this.FechaNacimiento = LocalDate.EPOCH;
        this.Dni = Dni;
        this.Direccion = Direccion;
        this.Ncontratos = Ncontratos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return Dni;
    }


    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getNcontratos() {
        return Ncontratos;
    }

    public void MostrarPersoan() {
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Fecha de nacimiento: " + this.FechaNacimiento);
        System.out.println("DNI: " + this.Dni);
        System.out.println("Direccion: " + this.Direccion);
        System.out.println("Nº de contrato: " + this.Ncontratos);

    }



}
