import java.io.Serializable;

public class Coche {




    private String Color;
    private String Marca;


    public Coche(String color, String marca) {
        this.Color = color;
        this.Marca = marca;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Coche{");
        sb.append("Color='").append(Color).append('\'');
        sb.append(", Marca='").append(Marca).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
