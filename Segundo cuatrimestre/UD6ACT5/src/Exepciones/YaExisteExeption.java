package Exepciones;

public class YaExisteExeption extends RuntimeException {
    public YaExisteExeption(String message) {
        super(message);
    }
}
