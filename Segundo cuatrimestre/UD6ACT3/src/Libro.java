import java.io.Serializable;

public class Libro implements Serializable {


    private static final long serialVersionUID = 4128141516656399920L;


    private String ISBN;
    private String titulo;
    private String autor;
    private String Fechapublicacion;


    public  Libro(String ISBN, String titulo, String autor, String Fechapublicacion) {

        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.Fechapublicacion = Fechapublicacion;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechapublicacion() {
        return Fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        Fechapublicacion = fechapublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", Fechapublicacion='" + Fechapublicacion + '\'' +
                '}';
    }
}
