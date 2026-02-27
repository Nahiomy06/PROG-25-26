import java.time.LocalDate;

public class Pelicula extends Articulo{

    private GeneroPelicula GeneroPelicula;
    private LocalDate FechaAlquiler;
    private boolean EstaAlquilada;

    public Pelicula(String Cod, String Titulo, LocalDate FechaRegistro, LocalDate FechaBaja,
                    GeneroPelicula GeneroPelicula, LocalDate FechaAlquiler, boolean EstaAlquilada) {
        super(Cod, Titulo, FechaRegistro, FechaBaja);

        this.GeneroPelicula = GeneroPelicula;
        this.FechaAlquiler = FechaAlquiler;
        this.EstaAlquilada = EstaAlquilada;
    }

    public GeneroPelicula getGeneroPelicula() {
        return GeneroPelicula;
    }

    public void setGeneroPelicula(GeneroPelicula generoPelicula) {
        GeneroPelicula = generoPelicula;
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
        return "Pelicula{" +
                "GeneroPelicula=" + GeneroPelicula +
                ", FechaAlquiler=" + FechaAlquiler +
                ", EstaAlquilada=" + EstaAlquilada +
                '}';
    }
}
