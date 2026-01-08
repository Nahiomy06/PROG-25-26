import java.time.LocalDate;

public class Gatos extends Mascotas{

    private String Color;
    private boolean Pelo_Largo;

    public Gatos(String nombre, int edad, String estado, LocalDate fecha_Nacimiento,
                 String color, boolean pelo_Largo) {
        super(nombre, edad, estado, fecha_Nacimiento);

        this.Color = color;
        this.Pelo_Largo = pelo_Largo;

    }

    public String getColor() {
        return Color;
    }

    public boolean isPelo_Largo() {
        return Pelo_Largo;
    }

    @Override
    public String Muestra() {
        return "soy un " + this.getClass().getName() + "y me llamo " + super.Nombre;
    }

    @Override
    public String Habla() {
        return "soy un gato y hago miow miow";
    }


    @Override
    public String toString() {
        return "Gatos " +
                "Color='" + Color + '\'' +
                ", Pelo_Largo=" + Pelo_Largo +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Estado='" + Estado + '\'' +
                ", Fecha_Nacimiento=" + Fecha_Nacimiento;
    }
}
