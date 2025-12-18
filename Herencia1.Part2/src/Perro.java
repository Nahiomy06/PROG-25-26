import java.time.LocalDate;

public class Perro extends Mascotas{

    private String Raza;
    private boolean Pulgas;

    public Perro(String nombre, int edad, String estado, LocalDate fecha_Nacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fecha_Nacimiento);
        this.Raza = raza;
        this.Pulgas = pulgas;

    }



    




    @Override
    public String Muestra() {
        return "";
    }

    @Override
    public String Habla() {
        return "";
    }
}
