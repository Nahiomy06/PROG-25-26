import java.io.DataOutputStream;
import java.io.FileOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        final String path = ".\\src\\Resources\\";
        final String filename = "productos.txt";
        final boolean filemode = true;


        Producto P1 = new Producto("p-001", "Switch 2","Nintendo Switch 2",499.9 , 300 );
        Producto P2 = new Producto("p-002", "Ps5","Playstation 5",499.9 , 300 );
        Producto P3 = new Producto("p-003", "XBOX X","Xbox Series X",499.9 , 300 );





        try (final FileOutputStream file = new FileOutputStream(path + filename, filemode);
             DataOutputStream writer = new DataOutputStream(file)) {
            writer.writeUTF(P1.getCodigo());
            writer.writeUTF(P1.getNombre());
            writer.writeUTF(P1.getDescripcion());
            writer.writeDouble(P1.getPrecio());
            writer.writeInt(P1.getCantidad());

            writer.writeUTF(P2.getCodigo());
            writer.writeUTF(P2.getNombre());
            writer.writeUTF(P2.getDescripcion());
            writer.writeDouble(P2.getPrecio());
            writer.writeInt(P2.getCantidad());

            writer.writeUTF(P3.getCodigo());
            writer.writeUTF(P3.getNombre());
            writer.writeUTF(P3.getDescripcion());
            writer.writeDouble(P3.getPrecio());
            writer.writeInt(P3.getCantidad());

            System.out.println("Se a realizado la estructura");



        }catch (Exception e){
            System.out.println(e.getMessage());

        }






    }
}