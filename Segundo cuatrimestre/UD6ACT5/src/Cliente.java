import java.time.LocalDate;
import java.util.LinkedList;

public class Cliente extends Persona {

    private String NumSocio;
    private LocalDate FechaBaja;
    private static LinkedList<Articulo> ArticulosAlquilados = new LinkedList<>();


    public Cliente(String DNI, String Nombre, String Direccion,
                   String NumSocio, LocalDate FechaBaja, LinkedList<Articulo> ArticulosAlquilados) {
        super(DNI, Nombre, Direccion,  FechaBaja);

        this.NumSocio = NumSocio;
        this.FechaBaja = FechaBaja;
        this.ArticulosAlquilados = ArticulosAlquilados;
    }


    public String getNumSocio() {
        return NumSocio;
    }


    public LocalDate getFechaBaja() {
        return FechaBaja;
    }


    public LinkedList<Articulo> getArticulosAlquilados() {
        return ArticulosAlquilados;
    }


    @Override
    public String toString() {
        return "Cliente {" + '\'' + "DNI='" + this.getDNI() + '\'' +
                ", Nombre='" + this.getNombre() + '\'' +
                ", Direccion='" + this.getDireccion() + '\'' +
                " Numero de Socio='" + NumSocio + '\'' +
                ", Articulos alquilados=" + ArticulosAlquilados +
                '}';
    }

    public static void mostrarArticulosAlquilados(){

        if(ArticulosAlquilados.isEmpty()){
            System.out.println("No hay articulos alquilados");
        }else {
            for (Articulo A : ArticulosAlquilados) {
                System.out.println(A);
            }
        }
    }

    public static void AlquilarArticulos(Articulo A){
        ArticulosAlquilados.add(A);
    }

    public static void DevolverArticulos(Articulo A){
        ArticulosAlquilados.remove(A);
    }



}

