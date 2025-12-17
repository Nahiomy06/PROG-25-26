public class Satelite extends Astro{

    private String Planeta;


    public Satelite(String name, double diametro, double periodoRotacion, double periodoTraslacion, double distaciaMedia, String planeta) {
        super(name, diametro, periodoRotacion, periodoTraslacion, distaciaMedia);

        this.Planeta = planeta;
    }


    public String getPlaneta() {
        return Planeta;
    }


    public String MostrarInfoSatelites() {
        System.out.println("Satelite:");
        System.out.println(super.MostrarInfo());
        System.out.println(Planeta);
        return "";
    }


}
