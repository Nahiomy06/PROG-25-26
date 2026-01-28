public class NombreGatoException extends Exception {

    private static final long serialVersionUID = 1L;
    String Nombre;

    public NombreGatoException(String nombre) {
        super("El nombre ser mayor a 3 letras. Se pondra el nombre John por defecto.");
        this.Nombre = nombre;

    }

    @Override
    public String toString() {
        return "NombreGatoException{" +
                "Nombre='" + Nombre + '\'' +
                '}';
    }
}
