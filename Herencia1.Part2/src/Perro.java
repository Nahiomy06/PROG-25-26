import java.time.LocalDate;

public class Perro extends Mascotas{

    private String Raza;
    private boolean Pulgas;

    public Perro(String nombre, int edad, String estado, LocalDate fecha_Nacimiento,
                 String raza, boolean pulgas) {
        super(nombre, edad, estado, fecha_Nacimiento);
        this.Raza = raza;
        this.Pulgas = pulgas;

    }


    public boolean isPulgas() {
        return isPulgas();
    }



    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getRaza() {
        return Raza;
    }




    @Override
    public String Muestra() {
        return "soy un " + this.getClass().getName() + "y me llamo " + super.Nombre ;
    }

    @Override
    public String Habla() {
        return "Soy un perro y hago wauff wauff";
    }


    @Override
    public String toString() {
        return "Perro " +
                "Raza='" + this.Raza + '\'' +
                ", Pulgas=" + this.Pulgas +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + this.Edad +
                ", Estado='" + this.Estado + '\'' +
                ", Fecha_Nacimiento=" + this.Fecha_Nacimiento;
    }
}

