import java.time.LocalDate;

public class Articulo {

    private String Cod;
    private String Titulo;
    private LocalDate FechaRegistro;
    private LocalDate FechaBaja;


    public Articulo(String Cod, String Titulo, LocalDate FechaRegistro, LocalDate FechaBaja) {
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

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public LocalDate getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        FechaRegistro = fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return FechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        FechaBaja = fechaBaja;
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
