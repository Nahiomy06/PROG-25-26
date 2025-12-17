import java.time.LocalDate;
import java.util.Arrays;

public class Equipo {

    private String NombreEquipo;
    private String Codigo;
    private LocalDate FechaCreacion = LocalDate.now();
    private Sensei Sensei;
    final private int MaxNinjas = 3;
    private Ninja[] Ninjas = new Ninja[3];


    public Equipo (String NombreEquipo, String Codigo, Sensei Sensei) {

        this.NombreEquipo = NombreEquipo;
        this.Codigo = Codigo;
        this.Sensei = Sensei;

    }


    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        NombreEquipo = nombreEquipo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public Sensei getSensei() {
        return Sensei;
    }

    public int getMaxNinjas() {
        return MaxNinjas;
    }

    public Ninja[] getNinjas() {
        return Ninjas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "NombreEquipo='" + NombreEquipo + '\'' +
                ", Codigo='" + Codigo + '\'' +
                ", FechaCreacion=" + FechaCreacion +
                ", Sensei=" + Sensei +
                ", MaxNinjas=" + MaxNinjas +
                ", Ninjas=" + Ninjas +
                '}';
    }


    public void RegistrarNinja (Ninja Ninja){
        for (int i = 0; i < Ninjas.length; i++) {
            if (i == 3){
                System.out.println("no hay Capacidad en el equipo");

            }
            else {

            }

        }


        System.out.println(Ninja.toString());


    }

//Test
    Ninja Ninja1 = new Ninja("Sasuke", "19999922AA", "su casa","1", Chakra.FUEGO, Rango.CHUNIN, 0100, "Sharingan(?)", 67,76  );











}

