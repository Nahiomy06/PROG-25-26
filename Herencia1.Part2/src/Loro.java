import java.time.LocalDate;

public class Loro extends Aves{

    private String Origen;
    private boolean  Habla;


    public Loro(String nombre, int edad, String estado, LocalDate fecha_Nacimiento, String pico, boolean vuela,
                String origen, boolean habla) {
        super(nombre, edad, estado, fecha_Nacimiento, pico, vuela);
    this.Origen = origen;
    this.Habla = habla;

    }

    public String getOrigen(){
        return this.Origen;
    }

    public boolean isHabla() {
        return Habla;
    }

    public void setHabla(boolean habla) {
        Habla = habla;
    }



    public String Saludar (){
        String Saludo = "No puedo saludar todavia";
        if (this.Habla){
            Saludo = "Holaa";
        }
        return Saludo;
    }

    @Override
    public String Volar() {
        return "soy un Loro, puedo volar";
    }

    @Override
    public String Muestra() {
        return "soy un " + this.getClass().getName() + "y me llamo " + super.Nombre;
    }

    @Override
    public String Habla() {
        return "Grmn Grmmn";
    }


    @Override
    public String toString() {
        return "Loro " +
                "Origen='" + Origen + '\'' +
                ", Habla=" + Habla +
                ", Pico='" + Pico + '\'' +
                ", Vuela=" + Vuela +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Estado='" + Estado + '\'' +
                ", Fecha_Nacimiento=" + Fecha_Nacimiento;
    }
}
