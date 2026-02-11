import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final String path= ".\\src\\resource\\";
        final String filename = "alumnos.dat";
        boolean filemode = false;

        List<Alumno> alumnos = new LinkedList<>();



        Alumno pp = new Alumno("Pepe", "Blanco", 18);
        pp.Calificar("Programacion", 5);
        pp.Calificar("BBDD", 7);
        pp.Calificar("LMS", 7);
        pp.Calificar("SSII", 9);
        pp.Calificar("Ingles", 4);

        Alumno paco = new Alumno("Paco", "Blanco", 18);
        paco.Calificar("Programacion", 4);
        paco.Calificar("BBDD", 6);
        paco.Calificar("LMS", 5);
        paco.Calificar("SSII", 6);
        paco.Calificar("Ingles", 7);


//        //Creacion y apertura del fichero
//        FileOutputStream file;
//        ObjectOutputStream buffer;
//
//        try {
//            file = new FileOutputStream(path + filename, filemode);
//            buffer = new ObjectOutputStream(file);
//        } catch (IOException e) {
//            System.out.println("Error al abrir el fichero: " + e.getMessage());
//            return;
//        }
//
//
//        //Escritura del fichero
//        try {
//            buffer.writeObject(pp);
//            System.out.println("Archivo guardado correctamente");
//
//        } catch (IOException e) {
//            System.out.println("Error al guardar el fichero: " + e.getMessage());
//        }
//
//
//        //Cerrar los flujos
//        try {
//            file.close();
//            buffer.close();
//        } catch (IOException e) {
//            System.out.println("Error al cerrar el fichero: " + e.getMessage());
//        }
//


        //Usar try-catch-with-resources

        try(FileOutputStream file = new FileOutputStream(path+filename, filemode);
        ObjectOutputStream buffer = new ObjectOutputStream(file)) {

            for(Alumno alumno: alumnos){
                buffer.writeObject(alumno);

            }
            System.out.println("El fichero se ha guardado correctamente");

        } catch (IOException e) {
            System.out.println("Error al abrir el fichero" + e.getMessage());
        }


    }
}