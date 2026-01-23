public class ExsesoVelocidadExepcioon extends RuntimeException {


    // Ejemplo De Exepciones personalizadas
    private static final long serialVersionUID = -4374723733690550009L;


    private int Velocidad;

    public ExsesoVelocidadExepcioon(int velocidad){
        super("Exeso de velocidad registrado, su velocidad es : " + velocidad);
        this.Velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "ExsesoVelocidadExepcioon{" + Velocidad + "}";

    }
}
