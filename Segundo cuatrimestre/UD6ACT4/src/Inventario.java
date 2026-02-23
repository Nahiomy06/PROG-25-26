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


        Producto.cargarFicherosBinarios();
        do {
            System.out.println(Menu);
            option = sc.nextLine();



            switch (option) {
                case "1":
                    Producto.mostrarProducto();
                    break;
                case "2":
//                    Producto.crearProducto();
                    break;
                case "3":
                    Producto.eliminarProducto();
                    break;
                case "4":
                    Producto.guardarFicheros();
                    Producto.guardarFicherosBinario();
                    Producto.cargarFicheros();
                    System.out.println("Cerrando programa.");
                    break;
            }

        }while (!option.equals("4"));





    }
}