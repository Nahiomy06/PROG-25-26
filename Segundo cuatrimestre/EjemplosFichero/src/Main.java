import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//
//        String Path = "C:\\Users\\daw1\\OneDrive - Educantabria\\Documentos\\DAW1 NC\\GithubProg";
//        File Carp = new File(Path);
//        if (Carp.exists()) {
//            System.out.println("Existe la carpeta");
//            System.out.println("Tiene permiso de escritura? " + Carp.canWrite());
//            String[] Contenido = Carp.list();
//            System.out.println("Archivos o carpetas que contiene: " + Contenido.length);
//            for (String Fich : Contenido) {
//                File F = new File(Carp.getPath(), Fich);
//                if (F.isDirectory()) {
//                    System.out.println(Fich + ", " + "Carpeta");
//                } else  {
//                    System.out.println(Fich + ", " + "Fichero, " + F.length() + "Bytes: " + F.getTotalSpace());
//                }
//            }
//        } else {
//            System.out.println("Carpeta inexistente");
//        }


        File Fich = new File("C:\\Users\\daw1\\OneDrive - Educantabria\\Documentos\\DAW1 NC\\Pract.txt");

        boolean Ok = false;

        try {
            Ok = Fich.createNewFile();
        } catch (IOException e) {
            System.out.println("Esta ruta no existe");
        }

        if (Ok) {
            System.out.println("El fichero se ha crado con existo");
        }  else {
            System.out.println("El fichero no se ha podido crear");
        }














    }
}