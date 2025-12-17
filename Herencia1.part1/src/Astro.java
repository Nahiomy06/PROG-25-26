abstract public class Astro {

    private String Nombre;
    private double Diametro;
    private double PeriodoRotacion;
    private double PeriodoTraslacion;
    private double DistaciaMedia;


    public Astro (String name, double diametro, double periodoRotacion, double periodoTraslacion, double distaciaMedia) {
        this.Nombre = name;
        this.Diametro = diametro;
        this.PeriodoRotacion = periodoRotacion;
        this.PeriodoTraslacion = periodoTraslacion;
        this.DistaciaMedia = distaciaMedia;

    }

    public String getNombre() {
        return Nombre;
    }

    public double getDiametro() {
        return Diametro;
    }

    public double getPeriodoRotacion() {
        return PeriodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return PeriodoTraslacion;
    }

    public double getDistaciaMedia() {
        return DistaciaMedia;
    }



    public String MostrarInfo() {
        return
                "Nombre: " + Nombre  +
                ", Diametro: " + Diametro +
                ", PeriodoRotacion: " + PeriodoRotacion +
                ", PeriodoTraslacion: " + PeriodoTraslacion +
                ", DistaciaMedia: " + DistaciaMedia;
    }



}









