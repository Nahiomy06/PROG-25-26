package Exepciones;

public class SalarioInvalidoExeption extends RuntimeException {
    public SalarioInvalidoExeption(String message) {
        super(message);
    }
}
