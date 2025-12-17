import java.time.LocalDate;

public class Aldea {

    private String NombreAldea;
    private String CodigoAldea;
    private LocalDate FechaCreacionAldea;
    private Sensei Kage;
    final private int MaxEquipos = 10;
    private Equipo [] ArrEquipos;


    public Aldea(String NombreAldea, String CodigoAldea, LocalDate FechaCreacionAldea, Sensei Kage, Equipo ArrEquipos) {


        this.NombreAldea = NombreAldea;
        this.CodigoAldea = CodigoAldea;
        this.FechaCreacionAldea = LocalDate.of(1000, 12, 10);
        this.Kage = Kage;
        this.ArrEquipos = new Equipo[]{ArrEquipos};


    }

    public String getNombreAldea() {
        return NombreAldea;
    }

    public void setNombreAldea(String nombreAldea) {
        NombreAldea = nombreAldea;
    }

    public String getCodigoAldea() {
        return CodigoAldea;
    }

    public LocalDate getFechaCreacionAldea() {
        return FechaCreacionAldea;
    }

    public Sensei getKage() {
        return Kage;
    }

    public void setKage(Sensei kage) {
        Kage = kage;
    }
}
