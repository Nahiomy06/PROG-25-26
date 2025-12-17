
public class Sensei extends Ninja{

    private String CodSensei;
    private double Estrategia;
    private double Liderasco;



    public Sensei(String Nombre, String Dni, String Direccion, String Ncontratos, Chakra Chakra, Rango Rango, int IdNinja, String TecnicaSecreta, double Ataque, double Defensa, String CodSensei, double Estrategia, double Liderasco) {
        super(Nombre, Dni, Direccion, Ncontratos, Chakra, Rango, IdNinja, TecnicaSecreta, Ataque, Defensa);

        this.CodSensei = CodSensei;
        this.Estrategia = Estrategia;
        this.Liderasco = Liderasco;


    }

    public String getCodSensei() {
        return CodSensei;
    }

    public double getEstrategia() {
        return Estrategia;
    }

    public double getLiderasco() {
        return Liderasco;
    }



}
