import java.util.ArrayList;

public class Planeta extends Astro {

    private double DistanciaSol;

    public Planeta(String name, double diametro, double periodoRotacion, double periodoTraslacion, double distaciaMedia, double distanciaSol) {
        super(name, diametro, periodoRotacion, periodoTraslacion, distaciaMedia);
        this.DistanciaSol = distanciaSol;


    }

    public double getDistanciaSol() {
        return DistanciaSol;
    }


    @Override
    public String MostrarInfo() {
        System.out.println("Planeta");
        System.out.println(super.MostrarInfo() +
                "Distancia al sol: " + DistanciaSol);



        return "";


    }
}
