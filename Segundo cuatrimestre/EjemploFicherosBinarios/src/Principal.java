import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {

        final String path = ".\\src\\Resources\\";
        final String filename = "productos.txt";
        final boolean filemode = false;
        LinkedList<Producto> productos = new LinkedList<>();



        boolean eof = false;

        try (FileInputStream file = new FileInputStream(path + filename);
             DataInputStream lector = new DataInputStream(file)){
                while (!eof) {
                    String codigo = lector.readUTF();
                    String nombre = lector.readUTF();
                    String descripcion = lector.readUTF();
                    double precio = lector.readDouble();
                    int cantidad = lector.readInt();

                    productos.add(new Producto(codigo, nombre, descripcion, precio, cantidad));
                }



        }catch (EOFException e1) {
            eof = true;
            System.out.println("Se ha finalizado el fichero");

        }catch (IOException e){
            System.out.println("Error al manejar el fichero");

        }



        for (Producto producto : productos) {
            System.out.println(producto);
        }















    }
}
