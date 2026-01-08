import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        Producto P1 = new Producto("Manzana", 10);
        Producto P2 = new Producto("Banana", 6);
        Producto P3 = new Producto("Pera", 8);
        Producto P4 = new Producto("Limon", 4);
        Producto P5 = new Producto("Uva", 20);

        //2
        ArrayList<Producto> productos = new ArrayList<>();

        //3
        productos.add(P1);
        productos.add(P2);
        productos.add(P3);
        productos.add(P4);
        productos.add(P5);


        //4
        Iterator<Producto> itera = productos.iterator();
        Producto TodoProducto;
        System.out.println("\n" +"Listado de productos: ");
        while (itera.hasNext()){
            TodoProducto = itera.next();
            System.out.println(TodoProducto);
        }

        //5
        productos.remove(P3);
        productos.remove(P4);


        //6
        Producto PNuevo = new Producto("Cereza", 2);

        int ArayMedio = productos.size()/2;

        productos.add(ArayMedio, PNuevo);


        //7
        Iterator<Producto> itera2 = productos.iterator();
        Producto TodoProducto2;
        System.out.println("\n" +"Segundo listado de productos: ");
        while (itera2.hasNext()){
            TodoProducto2 = itera2.next();
            System.out.println(TodoProducto2);
        }

        //8

        productos.sort(Producto::compareTo);

        System.out.println();

        Iterator<Producto> itera3 = productos.iterator();
        Producto TodoProducto3;
        System.out.println("\n" +"Tercer listado de productos: ");
        while (itera3.hasNext()){
            TodoProducto3 = itera3.next();
            System.out.println(TodoProducto3);
        }


        //9
        productos.clear();
        System.out.println("\n" +"Cuarto listado de productos(Vacios): ");
        System.out.println(productos);


    }
}