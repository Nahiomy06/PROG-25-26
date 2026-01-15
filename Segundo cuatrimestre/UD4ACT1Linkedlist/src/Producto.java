public class Producto implements Comparable<Producto> {

    private String Nombre;
    private int Cantidad;


    public Producto(String nombre, int cantidad) {
        this.Nombre = nombre;
        this.Cantidad = cantidad;

    }

    public String getNombre() {
        return Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto = " + Nombre +
                ", Cantidad: " + Cantidad
                ;
    }

    @Override
    public int compareTo(Producto OtroProducto) {
        return this.Nombre.compareTo(OtroProducto.Nombre);
    }
}
