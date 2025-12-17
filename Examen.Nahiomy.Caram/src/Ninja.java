public class Ninja extends Persona{

    private Chakra Chakra;
    private Rango Rango;
    private int IdNinja;
    private String TecnicaSecreta;
    private double Ataque;
    private double Defensa;




    public Ninja(String Nombre, String Dni, String Direccion, String Ncontratos, Chakra Chakra, Rango Rango, int IdNinja, String TecnicaSecreta, double Ataque, double Defensa) {
        super(Nombre, Dni, Direccion, Ncontratos);


        this.Chakra = Chakra;
        this.Rango = Rango;
        this.IdNinja = IdNinja;
        this.TecnicaSecreta = TecnicaSecreta;
        this.Ataque = Ataque;
        this.Defensa = Defensa;

    }



    public Chakra getChakra() {
        return Chakra;
    }

    public void setChakra(Chakra chakra) {
        Chakra = chakra;
    }

    public Rango getRango() {
        return Rango;
    }

    public void setRango(Rango rango) {
        Rango = rango;
    }

    public int getIdNinja() {
        return IdNinja;
    }

    public String getTecnicaSecreta() {
        return TecnicaSecreta;
    }

    public void setTecnicaSecreta(String tecnicaSecreta) {
        TecnicaSecreta = tecnicaSecreta;
    }

    public double getAtaque() {
        return Ataque;
    }

    public void setAtaque(double ataque) {
        Ataque = ataque;
    }

    public double getDefensa() {
        return Defensa;
    }

    public void setDefensa(double defensa) {
        Defensa = defensa;
    }



    public void MostrarNinja(){
        super.MostrarPersoan();

        System.out.println("Chakra: " + this.Chakra);
        System.out.println("Chakra: " + this.Rango);
        System.out.println("Chakra: " + this.IdNinja);
        System.out.println("Chakra: " + this.TecnicaSecreta);
        System.out.println("Chakra: " + this.Ataque);
        System.out.println("Chakra: " + this.Defensa);

    }













    public String toString() {
        return "Ninja{" +
                "Chakra=" + Chakra +
                ", Rango=" + Rango +
                ", IdNinja=" + IdNinja +
                ", TecnicaSecreta='" + TecnicaSecreta + '\'' +
                ", Ataque=" + Ataque +
                ", Defensa=" + Defensa +
                '}' +
                "} " + super.toString();
    }
}
