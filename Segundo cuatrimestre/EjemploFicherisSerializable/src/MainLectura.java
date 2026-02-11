import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Objects;

public class MainLectura {
    public static void main(String[] args) {

        final String path= ".\\src\\resource\\";
        final String filename = "alumnos.dat";
        boolean filemode = false;

        try (FileInputStream file = new FileInputStream(path + filename);
             ObjectInputStream reader = new ObjectInputStream(file)){

            Object obj = reader.readObject();
            if (obj instanceof Alumno){
                Alumno a = (Alumno)obj;
                System.out.println(a);

            }


        }catch(IOException e){

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
