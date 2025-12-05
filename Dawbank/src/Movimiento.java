


public class Movimiento {

    private int ID;
    private String Fecha;
    private Tipo tipo;
    private double cantidad;

    private static int ContadorMovimientos = 0;

    public Movimiento(Tipo tipo, double cantidad){

        this.ID = ContadorMovimientos;
        this.tipo = tipo;
        this.cantidad = cantidad;

    }

    public int getID() {
        return ID;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String MostrarInfoMovimientos(){

        String InfiMovimientos = "";
        InfiMovimientos += "ID: " + this.ID + "\n";
        InfiMovimientos += "Tipo: " + this.tipo + "\n";
        InfiMovimientos += "Cantidad: " + this.cantidad + "€" + "\n";
        return InfiMovimientos;
    }




}

