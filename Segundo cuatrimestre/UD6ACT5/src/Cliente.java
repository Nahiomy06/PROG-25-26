import java.util.LinkedList;

public class Cliente extends Persona {

    private String NumSocio;
//    private LocalDate FechaBaja;
    private static LinkedList<Articulo> ArticulosAlquilados = new LinkedList<>();

    public Cliente(String DNI, String Nombre, String Direccion, String NumSocio, LinkedList<Articulo> ArticulosAlquilados) {
        super(DNI, Nombre, Direccion);

        this.NumSocio = NumSocio;
        this.ArticulosAlquilados = ArticulosAlquilados;
    }

    public String getNumSocio() {
        return NumSocio;
    }

    public void setNumSocio(String numSocio) {
        NumSocio = numSocio;
    }

    public LinkedList<Articulo> getArticulosAlquilados() {
        return ArticulosAlquilados;
    }

    public void setArticulosAlquilados(LinkedList<Articulo> articulosAlquilados) {
        ArticulosAlquilados = articulosAlquilados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "NumSocio='" + NumSocio + '\'' +
                ", ArticulosAlquilados=" + ArticulosAlquilados +
                '}';
    }

    public static void mostrarArticulosAlquilados(){}

}

