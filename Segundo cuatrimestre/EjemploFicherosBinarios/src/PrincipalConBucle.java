import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;

public class PrincipalConBucle {
    public static void main(String[] args) {

        final String path = ".\\src\\Resources\\";
        final String filename = "productos.txt";
        final boolean filemode = true;

        LinkedList<Producto> productos = new LinkedList<>();

        Producto P1 = new Producto("p-001", "Switch 2","Nintendo Switch 2",499.9 , 300 );
        Producto P2 = new Producto("p-002", "Ps5","Playstation 5",499.9 , 300 );
        Producto P3 = new Producto("p-003", "XBOX X","Xbox Series X",499.9 , 300 );
        Producto P4 = new Producto("p-004", "Switch 1","Nintendo Switch 1",499.9 , 300 );
        Producto P5 = new Producto("p-005", "Ps4","Playstation 4",499.9 , 300 );



        productos.add(P1);
        productos.add(P2);
        productos.add(P3);
        productos.add(P4);
        productos.add(P5);

        try (final FileOutputStream file = new FileOutputStream(path + filename, filemode);
             DataOutputStream writer = new DataOutputStream(file)) {

                for(Producto producto : productos) {
                    writer.writeUTF(producto.getCodigo());
                    writer.writeUTF(producto.getNombre());
                    writer.writeUTF(producto.getDescripcion());
                    writer.writeDouble(producto.getPrecio());
                    writer.writeInt(producto.getCantidad());

                }

            System.out.println("Se a realizado la estructura");


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
