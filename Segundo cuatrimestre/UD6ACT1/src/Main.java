import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    final static String path = ".\\src\\Almacen\\";
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

        for (Producto P : productos) {
            if (P.getCodigo().equals(Codigo)) {
                productos.remove(P);
                System.out.println("Contrato eliminado.");
            }
        }

    }

    public static void guardarFicheros() {

        try(FileWriter Almacen = new FileWriter(path + fileName, true);
            BufferedWriter BuffW = new BufferedWriter(Almacen)){

            for (Producto P : productos) {
                BuffW.write(P.toString());
                BuffW.newLine();
                System.out.println("Producto guardados correctamente.");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }




    private static boolean ExistenProductos(String Codigo) {
        for (Producto P : productos) {
            if (P.getCodigo().equalsIgnoreCase(Codigo)) {
                return true;
            }
        }return false;
    }
}