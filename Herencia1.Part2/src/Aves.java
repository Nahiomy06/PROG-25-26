import java.time.LocalDate;

public abstract class Aves extends Mascotas{

    protected String Pico;
    protected boolean Vuela;


    public Aves(String nombre, int edad, String estado, LocalDate fecha_Nacimiento,
                String pico, boolean vuela) {
        super(nombre, edad, estado, fecha_Nacimiento);

        this.Pico = pico;
        this.Vuela = vuela;

    }

    public abstract String Volar();


    @Override
    public String toString() {
        return "Aves " +
                "Pico='" + Pico + '\'' +
                ", Vuela=" + Vuela +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Estado='" + Estado + '\'' +
                ", Fecha_Nacimiento=" + Fecha_Nacimiento;
    }
}
