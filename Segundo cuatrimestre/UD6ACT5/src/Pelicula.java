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
        this.EstaAlquilada = false;
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

    public boolean EstaAlquilada() {
        return EstaAlquilada;
    }

    public void setEstaAlquilada(boolean estaAlquilada) {
        EstaAlquilada = estaAlquilada;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Genero de la pelicula=" + GeneroPelicula +
                ", Fecha de alquiler=" + FechaAlquiler +
                ", Esta alquilada?=" + EstaAlquilada +
                '}';
    }


    public void  alquilarPelicula(){
        if (EstaAlquilada == false) {
            EstaAlquilada = true;
            FechaAlquiler = LocalDate.now();
        }
    }

    public void devolverPelicula(){
        EstaAlquilada = false;
        FechaAlquiler = null;
    }





}
