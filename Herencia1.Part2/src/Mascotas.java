import java.time.LocalDate;

public abstract class Mascotas {

    protected String Nombre;
    protected int Edad;
    protected String Estado;
    protected LocalDate Fecha_Nacimiento;


    public Mascotas (String nombre, int edad, String estado, LocalDate fecha_Nacimiento){
        this.Nombre = nombre;
        this.Edad = edad;
        this.Estado = estado;
        this.Fecha_Nacimiento = fecha_Nacimiento;

    }








    public abstract String Muestra();


    public String Cumpleanios() {
        String Mensaje = "";
        if (this.Fecha_Nacimiento.getDayOfYear() == LocalDate.now().getDayOfYear()) {
            this.Edad++;
            Mensaje = "Es mi cumple y cumplo " + this.Edad;
        }
        return Mensaje;
    }

    public String Morir() {
        return "Siento dejar este mundo sin probar pipas facundo";

    }

    public abstract String Habla();


    @Override
    public String toString() {
        return "Mascotas " +
                "Name='" + this.Nombre + '\'' +
                ", Edad=" + this.Edad +
                ", Estado='" + this.Estado + '\'' +
                ", Fecha_Nacimiento=" + this.Fecha_Nacimiento;
    }
}