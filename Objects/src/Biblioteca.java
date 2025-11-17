public class Biblioteca {

    // Atributos encapsulados

    private String codigo;
    private String nombre;
    private String dirreccion;
    private String email;
    private String nTelefono;

    // Coleccion (array) de libros en la biblioteca
    private Libro[] Libros;
    private int nLibrosActuales;
    private final int dimencionInicial = 100;


    //Constructor

    public Biblioteca(String codigo, String nombre, String dirreccion, String email, String nTelefono, int dimencionInicial){

        this.codigo = codigo;
        this.nombre = nombre;
        this.dirreccion = dirreccion;
        this.email = email;
        this.nTelefono = nTelefono;

        this.Libros = new Libro[this.dimencionInicial];

        // Esto es importante para pal SmartBiblioteca
        this.nLibrosActuales = 0;

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public boolean insertarLbro(Libro libro) {
        boolean resulatado = false;

        //Toda la logica para ingresar un libro

        if (libro != null){
            if (this.nLibrosActuales < this.dimencionInicial) {
                //Tengo huecos
                this.Libros[this.nLibrosActuales] = libro;
                resulatado = true;
                this.nLibrosActuales++;
            }
            else {
                //No tengo huecos sufficient
                this.ampliarDimenBiblioteca();
                this.Libros[nLibrosActuales] = libro;
                resulatado = true;
                this.nLibrosActuales++;


            }

        }

    public boolean eliminarLibro(Libro libro) {
            boolean resulatdo = false;

            if(libro != null) {
                int index = -1;

                for (int i = 0; 1 < this.nLibrosActuales; i++) {

                    if (this.Libros[i] != null){
                        if (this.Libros[i].getISBN().equalsIgnoreCase(libro.getISBN())){
                            index = i;
                            break; //para eliminar la primera occurencia
                        }
                    }

                    if(index != -1) {
                        this.Libros[index] = null;
                        resulatdo = true;

                        //opt 1
                        this.nLibrosActuales[index] = this.Libros[nLibrosActuales - 1];
                        this.nLibrosActuales[this.nLibrosActuales - 1] = null;
                        this.nLibrosActuales--;



                    }

                }
            }


        }





    private void ampliarDimenBiblioteca() {

            Libro[] librosAux = new Libro[this.Libros.length + 5];

            for (int i = 0; i < this.Libros.length; i++) {

                librosAux[i] = this.Libros[i];

            }
            this.Libros = librosAux;

        return resulatado;







}
