import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Inventario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Producto producto;

        String Menu = """
                
                --INVENTARIO--
                
                1. Mostrar Productos en el Inventario.
                2. (Opcional) Registrar producto en el Inventario
                3. Eliminar Producto por referencia.
                4. Guardar y Salir.

                """;

        String option = "";


        do {
            System.out.println(Menu);
            option = sc.nextLine();



            switch (option) {
                case "1" -> Producto.mostrarProducto();
                case "2" -> Producto.crearProducto();
                case "3" -> Producto.eliminarProducto();
                case "4" -> System.out.println("Salir");
            }

        }while (!option.equals(4));





    }
}