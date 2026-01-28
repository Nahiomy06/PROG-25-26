public class EdadGatosException extends RuntimeException {

    private static final long serialVersionUID = 2L;

    private int Edad;

    public EdadGatosException(int edad) {
        super("la edad no puede ser negativa o ser un caracter");





    }
}
