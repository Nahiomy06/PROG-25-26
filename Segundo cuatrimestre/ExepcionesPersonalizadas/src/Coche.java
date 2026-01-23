public class Coche {


    private String Color;
    private String Marca;
    private int Velocidad;

    public Coche(String color, String marca, int velocidad) {
        this.Color = color;
        this.Marca = marca;
        this.Velocidad = velocidad;
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int velocidad) {
        Velocidad = velocidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Coche{");
        sb.append("Color='").append(Color).append('\'');
        sb.append(", Marca='").append(Marca).append('\'');
        sb.append(", Velocidad=").append(Velocidad);
        sb.append('}');
        return sb.toString();

    }

    public void accelerar(int V){
        this.Velocidad = this.Velocidad + V;
        if (this.Velocidad > 120){
            throw new ExsesoVelocidadExepcioon(V);
        }


    }

}
