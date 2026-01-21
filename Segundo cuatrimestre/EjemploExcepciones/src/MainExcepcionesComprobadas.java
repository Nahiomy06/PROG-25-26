import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainExcepcionesComprobadas {

    public static void main(String[] args) throws Exception{

        FileReader fichero = null;

        try {
            fichero = new FileReader("c:/menu.txt");
            System.out.println("El fichero a sido abierto");

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        System.out.println("El fichero ha sido abierto");

    }
}
