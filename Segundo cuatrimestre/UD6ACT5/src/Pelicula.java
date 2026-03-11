import Exepciones.EstaAlquiladaExeption;

import java.time.LocalDate;

public class Pelicula extends Articulo{

    private GeneroPelicula GeneroPelicula;
    private LocalDate FechaAlquiler;
    boolean EstaAlquilada;

    public Pelicula(String Cod, String Titulo, LocalDate FechaRegistro, LocalDate FechaBaja,
                    GeneroPelicula GeneroPelicula) {
        super(Cod, Titulo, FechaRegistro, FechaBaja);

        this.GeneroPelicula = GeneroPelicula;
        this.FechaAlquiler = FechaAlquiler;
        this.EstaAlquilada = false;
    }

    public GeneroPelicula getGeneroPelicula() {
        return GeneroPelicula;
    }


    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public boolean EstaAlquilada() {
        return EstaAlquilada;
    }

    @Override
    public String toString() {
        return "Pelicular {" + '\'' + "Cod='" + this.getCod() + '\'' +
                ", Titulo='" + this.getTitulo() + '\'' +
                ", FechaRegistro=" + this.getFechaRegistro() + '\'' +
                ", FechaBaja=" + this.getFechaBaja() + '\'' +
                ", Genero de la pelicula=" + GeneroPelicula + '\'' +
                ", Fecha de alquiler=" + FechaAlquiler + '\'' +
                ", Esta alquilada?=" + EstaAlquilada +
                '}';
    }


    public void  alquilarPelicula() throws EstaAlquiladaExeption {
        if (EstaAlquilada == false) {
            EstaAlquilada = true;
            FechaAlquiler = LocalDate.now();
        }
        String mensaje = "Esta pelicula ya esta alquilado";
        throw  new EstaAlquiladaExeption(mensaje);
    }

    public void devolverPelicula(){
        EstaAlquilada = false;
        FechaAlquiler = null;
    }





}
