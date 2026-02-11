import java.io.Serializable;

public class Producto{






    private String Codigo;
    private String Nombre;
    private int Cantidad;
    private double Precio;



    public Producto(String Codigo, String Nombre, int Cantidad, double Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }


    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }


    @Override
    public String toString() {
        return Codigo + "," + Nombre + "," + Cantidad + "," + Precio;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



    public static Producto enLinea(String linea){
        String[] datos = linea.split(",");

        return new Producto(datos[0], datos[1], Integer.parseInt(datos[2]), Double.parseDouble(datos[3]));
    }

}
