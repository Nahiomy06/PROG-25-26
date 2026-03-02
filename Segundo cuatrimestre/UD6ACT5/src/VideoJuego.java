import java.time.LocalDate;

public class VideoJuego extends Articulo{

    private GeneroVideojuego GeneroVideojuego;
    private LocalDate FechaAlquiler;
    private boolean EstaAlquilada;

    public VideoJuego(String Cod, String Titulo, LocalDate FechaRegistro, LocalDate FechaBaja,
            GeneroVideojuego generoVideojuego, LocalDate fechaAlquiler, boolean estaAlquilada) {
        super(Cod, Titulo, FechaRegistro, FechaBaja);

        GeneroVideojuego = generoVideojuego;
        FechaAlquiler = fechaAlquiler;
        EstaAlquilada = estaAlquilada;
    }

    public VideoJuego(String Cod, String Titulo, LocalDate FechaRegistro, LocalDate FechaBaja) {
        super(Cod, Titulo, FechaRegistro, FechaBaja);
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
        return super.toString() +
                "Genero del videojuego=" + GeneroVideojuego +
                ", Fecha de alquiler=" + FechaAlquiler +
                ", Esta alquilada?=" + EstaAlquilada +
                '}';
    }

    public void  alquilarVideojuego(){
        EstaAlquilada = true;
        FechaAlquiler = LocalDate.now();
    }

    public void devolverVideojuego(){
        EstaAlquilada = false;
        FechaAlquiler = null;
    }



}

