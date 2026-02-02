import java.io.File;
import java.nio.file.Path;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String Path = "C:/WINDOWS";
        File Carp = new File(Path);
        if (Carp.exists()) {
            System.out.println("Existe la carpeta");
            System.out.println("Tiene permiso de escritura? " + Carp.canWrite());
            String[] Contenido = Carp.list();
            System.out.println("Archivos o carpetas que contiene: " + Contenido.length);
            for (String Fich : Contenido) {
                File F = new File(Carp.getPath(), Fich);
                if (F.isDirectory()) {
                    System.out.println(Fich + ", " + "Carpeta");
                } else  {
                    System.out.println(Fich + ", " + "Fichero, " + F.length() + "Bytes: " + F.getTotalSpace());
                }
            }
        } else {
            System.out.println("Carpeta inexistente");
        }









    }
}