public class Libro {

    //attributes de la class (encapsulation)

    private String titulo;
    private String autor;
    private int nPaginas;
    private String ISBN;
    private String editora;
    private String fechaPublicacion;
    private int edicion;


    //Constructor / Constructores

    public Libro(String titulo, String autor, String ISBN, String fechaPublicacion, int nPaginas, int edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.fechaPublicacion = fechaPublicacion;
        this.getnPaginas();
        this.edicion = edicion;
    }

    //Definir Getter y Setter

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public String getFechaPublicacion() {
        return this.fechaPublicacion;
    }
    public String getEditora() {
        return this.editora;
    }
    public int getnPaginas() {
        return this.nPaginas;
    }
    public int getEdicion() {
        return this.edicion;
    }


    public void setnPaginas(int nPaginas){
        if (nPaginas > 0){
            this.nPaginas = nPaginas;
        }

    }

    public String setEditora(String editora){
        return editora;

    }


    //Metodoss

    public String infolibro(){
        String infoLinbro = "";
        infoLinbro = "Titulo: " + this.titulo + "\n";
        infoLinbro = "Autor: " + this.autor + "\n";
        infoLinbro = "ISBN: " + this.ISBN + "\n";
        infoLinbro = "Fecha de publicacion: " + this.fechaPublicacion + "\n";
        infoLinbro = "Editora: " + this.editora + "\n";
        infoLinbro = "Paginas: " + this.nPaginas + "\n";
        infoLinbro = "Edicion: " + this.edicion + "\n";



        return infoLinbro;



    }




}
