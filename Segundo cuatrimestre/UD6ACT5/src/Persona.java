public class Persona {

    private String DNI;
    private String Nombre;
    private String Direccion;
//    private LocalDate FechaNacimiento;


    public Persona(String DNI, String Nombre, String Direccion) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }

}
