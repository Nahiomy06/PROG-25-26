import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //1
        Producto P1 = new Producto("Manzana", 10);
        Producto P2 = new Producto("Banana", 6);
        Producto P3 = new Producto("Pera", 8);
        Producto P4 = new Producto("Limon", 4);
        Producto P5 = new Producto("Uva", 20);


        //2
        LinkedList<Producto> productos = new LinkedList<>();

        //3
        productos.add(P1);
        productos.add(P2);
        productos.add(P3);
        productos.add(P4);
        productos.add(P5);

        //4
        Iterator<Producto> iterator = productos.iterator();
        Producto TodoProducto;
        System.out.println("\n" +"Listado de productos: ");
        while (iterator.hasNext()){
            TodoProducto = iterator.next();
            System.out.println(TodoProducto);
        }

        //5
        productos.remove(P3);
        productos.remove(P4);

        //6
        Producto PNuevo = new Producto("Cereza", 2);

        int LinkedMedio = productos.size()/2;

        productos.add(LinkedMedio, PNuevo);

        //7
        Iterator<Producto> iterator2 = productos.iterator();
        Producto TodoProducto2;
        System.out.println("\n" +"Listado de productos: ");
        while (iterator2.hasNext()){
            TodoProducto2 = iterator2.next();
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