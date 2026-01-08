import java.time.LocalDate;

public class Canario extends Aves{

    private String Color;
    private boolean Canta;

    public Canario(String nombre, int edad, String estado, LocalDate fecha_Nacimiento, String pico, boolean vuela,
                   String color, boolean canta) {
        super(nombre, edad, estado, fecha_Nacimiento, pico, vuela);

        this.Color = color;
        this.Canta = canta;
    }

    public String getColor() {
        return this.Color;
    }

    public boolean isCanta() {
        return this.Canta;
    }

    @Override
    public String Volar() {
        return "soy un Canario, puedo volar";
    }

    @Override
    public String Muestra() {
        return "soy un " + this.getClass().getName() + "y me llamo " + super.Nombre;
    }

    @Override
    public String Habla() {
        return "Pio pio";
    }
}
