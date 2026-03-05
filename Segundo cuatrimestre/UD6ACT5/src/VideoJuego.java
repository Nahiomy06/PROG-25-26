import Exepciones.EstaAlquiladaExeption;

import java.time.LocalDate;

public class VideoJuego extends Articulo{

    private GeneroVideojuego GeneroVideojuego;
    private LocalDate FechaAlquiler;
    boolean EstaAlquilada;

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

    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public boolean EstaAlquilada() {
        return EstaAlquilada;
    }


    @Override
    public String toString() {
        return "Videojuego  {" + '\'' + "Cod='" + this.getCod() + '\'' +
                ", Titulo='" + this.getTitulo() + '\'' +
                ", FechaRegistro=" + this.getFechaRegistro() + '\'' +
                ", FechaBaja=" + this.getFechaBaja() + '\'' +
                "Genero del videojuego=" + GeneroVideojuego + '\'' +
                ", Fecha de alquiler=" + FechaAlquiler + '\'' +
                ", Esta alquilada?=" + EstaAlquilada +
                '}';
    }

    public void  alquilarVideojuego() throws EstaAlquiladaExeption {

        if (EstaAlquilada == false) {
            EstaAlquilada = true;
            FechaAlquiler = LocalDate.now();
        }
        String mensaje = "Este videojuego ya esta alquilado";
        throw  new EstaAlquiladaExeption(mensaje);
    }

    public void devolverVideojuego(){
        EstaAlquilada = false;
        FechaAlquiler = null;
    }



}

