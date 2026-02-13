import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    final static String path = ".\\src\\resource\\";
    static String fileName = "Almacen.txt";
    static LinkedList<Producto> productos = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String menu = "1. Crear producto " + "\n" +
                "2. Mostrar productos existentes " + "\n" +
                "3. Eliminar producto por código " + "\n" +
                "4. Guardar productos en el fichero. " + "\n" +
                "5. Salir";

        String opcion = "";

        cargarFicheros();

        do {
            System.out.println(menu);
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> crearProducto();
                case "2" -> mostrarProducto();
                case "3" -> eliminarProducto();
                case "4" -> guardarFicheros();
                case "5" -> System.out.println("Cerrando programa.");


            }


        } while (!opcion.equals("5"));


    }


    public static void crearProducto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el codigo del producto: ");
        String Codigo = sc.nextLine();

        if (ExistenProductos(Codigo)) {
            System.out.println("Este codigo esta en uso ");
        } else {

            System.out.println("Ingrese el nombre del producto: ");
            String Nombre = sc.nextLine();

            System.out.println("Ingrese el cantidad del producto: ");
            int Cantidad = sc.nextInt();

            System.out.println("Ingrese el precio del producto: ");
            double Precio = sc.nextDouble();

            Producto P = new Producto(Codigo, Nombre, Cantidad, Precio);
            productos.add(P);
        }
    }

    public static void mostrarProducto() {

        if (productos.isEmpty()) {
            System.out.println("No existen productos");
        } else {
            for (Producto P : productos) {
                System.out.println(P);
            }
        }


    }

    public static void eliminarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("codigo de producto a eliminar: ");
        String Codigo = sc.nextLine();

        boolean Eliminado = productos.removeIf(producto -> Codigo.equals(producto.getCodigo()));

        if (Eliminado) {
            System.out.println("Producto eliminado");
        }else  {
            System.out.println("No existen ese producto");
        }

    }

    public static void guardarFicheros() {

        try(FileWriter Almacen = new FileWriter(path + fileName);
            BufferedWriter BuffW = new BufferedWriter(Almacen)){

            for (Producto P : productos) {
                BuffW.write(P.toString());
                BuffW.newLine();
            }
            System.out.println("los cambios se an guardado correctamente");


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void cargarFicheros() {
        try (BufferedReader br = new BufferedReader(new FileReader(path + fileName))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                productos.add(Producto.enLinea(linea));
            }

            System.out.println("Almacen se ha cargado correctamente.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    private static boolean ExistenProductos(String Codigo) {
        for (Producto P : productos) {
            if (P.getCodigo().equalsIgnoreCase(Codigo)) {
                return true;
            }
        }
        return false;
    }
}