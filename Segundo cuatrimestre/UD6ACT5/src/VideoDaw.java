import java.time.LocalDate;
import java.util.LinkedList;

public class VideoDaw {



    private String CIF;
    private String Direccion;
    private LocalDate FechaAlta;
    public static LinkedList<Articulo> Articulos;
    public static LinkedList<Cliente> Clientes;

    public VideoDaw(String CIF, String direccion, LocalDate fechaAlta, LinkedList<Articulo> articulos, LinkedList<Cliente> clientes) {
        this.CIF = CIF;
        this.Direccion = direccion;
        this.FechaAlta = fechaAlta;
        this.Articulos = new LinkedList<>();
        this.Clientes = new LinkedList<>();
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public LocalDate getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        FechaAlta = fechaAlta;
    }

    public LinkedList<Articulo> getArticulos() {
        return Articulos;
    }

    public void setArticulos(LinkedList<Articulo> articulos) {
        articulos = articulos;
    }

    public LinkedList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        clientes = clientes;
    }

    @Override
    public String toString() {
        return "VideoDaw{" +
                "CIF='" + CIF + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Fecha de alta=" + FechaAlta +
                ", Articulos=" + Articulos +
                ", Clientes=" + Clientes +
                '}';
    }



    public void mostrarInfoVideoClub(){
        System.out.println("        VideoDaw        " +
                "CIF: " + CIF + '\'' +
                ", Direccion: " + Direccion + '\'' +
                ", Fecha de alta: " + FechaAlta +
                ", Cantidad de articulos: " + Articulos.size() +
                ", Cantidad de clientes: " + Clientes.size());
    }

    public static void  mostrarArticulosRegistrados(){

        if(Articulos.isEmpty()){
            System.out.println("No existen Articulos registrados" + '\n');
        }else {
            for (Articulo A : Articulos){
            System.out.println(A);
            }
        }
    }

    public static void  mostrarClientesRegistrados(){

        if(Clientes.isEmpty()){
            System.out.println("No existen Articulos registrados" + '\n');
        }else {
            for (Cliente C : Clientes){
                System.out.println(C);
            }
        }
    }


    public void Alquilar(){


    }

    public static void  alquilarPelicula(){

    }




































}