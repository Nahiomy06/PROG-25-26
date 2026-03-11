import java.time.LocalDate;

public class Articulo {

    private String Cod;
    private String Titulo;
    private LocalDate FechaRegistro;
    private LocalDate FechaBaja;


    public Articulo(String Cod, String Titulo) {
        this.Cod = Cod;
        this.Titulo = Titulo;
        this.FechaRegistro = LocalDate.now();
        this.FechaBaja = LocalDate.now();
    }

    public String getCod() {
        return Cod;
    }

    public void setCod(String cod) {
        Cod = cod;
    }

    public String getTitulo() {
        return Titulo;
    }



    @Override
    public String toString() {
        return "Articulo{" +
                "Cod='" + Cod + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", FechaRegistro=" + FechaRegistro +
                ", FechaBaja=" + FechaBaja;
    }

}
