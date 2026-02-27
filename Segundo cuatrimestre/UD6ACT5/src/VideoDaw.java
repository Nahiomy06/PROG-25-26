import java.time.LocalDate;

public class VideoDaw extends Articulo{

    private GeneroVideojuego GeneroVideojuego;
    private LocalDate FechaAlquiler;
    private boolean EstaAlquilada;

    public VideoDaw(String Cod, String Titulo, LocalDate FechaRegistro, LocalDate FechaBaja,
                    GeneroVideojuego generoVideojuego, LocalDate fechaAlquiler, boolean estaAlquilada) {
        super(Cod, Titulo, FechaRegistro, FechaBaja);

        GeneroVideojuego = generoVideojuego;
        FechaAlquiler = fechaAlquiler;
        EstaAlquilada = estaAlquilada;
    }

    public GeneroVideojuego getGeneroVideojuego() {
        return GeneroVideojuego;
    }

    public void setGeneroVideojuego(GeneroVideojuego generoVideojuego) {
        GeneroVideojuego = generoVideojuego;
    }

    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        FechaAlquiler = fechaAlquiler;
    }

    public boolean isEstaAlquilada() {
        return EstaAlquilada;
    }

    public void setEstaAlquilada(boolean estaAlquilada) {
        EstaAlquilada = estaAlquilada;
    }

    @Override
    public String toString() {
        return "VideoDaw{" +
                "GeneroVideojuego=" + GeneroVideojuego +
                ", FechaAlquiler=" + FechaAlquiler +
                ", EstaAlquilada=" + EstaAlquilada +
                '}';
    }
}
