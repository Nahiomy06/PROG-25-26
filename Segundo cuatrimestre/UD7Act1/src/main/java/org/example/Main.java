package org.example;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;


/**
 * Clase principal que ejecuta el sistema de gestión de inventario.
 * <p>
 * Proporciona una interfaz de línea de comandos (CLI) que permite al usuario interactuar
 * con la base de datos de productos mediante un menú de opciones.
 * </p>
 * * @author Nahiomy
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Punto de entrada principal de la aplicación.
         * <p>
         * Inicializa la configuración de la base de datos, establece la conexión y gestiona
         * el bucle principal del menú (do-while) para procesar las peticiones del usuario.
         * </p>
         * * @param args Argumentos de la línea de comandos (no utilizados).
         */
        try {

            SQLManager.CargarConnection();
            Connection conn = SQLManager.getConnection();
            if (conn != null) {
                System.out.println("Conectado correctamente");
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }


        /**
         * El menu que es el orquestador del flujo de la aplicación.
         * <p>
         * El menú sigue un patrón de diseño de bucle de control (Control Loop).
         * Las operaciones se dividen en tres categorías principales:
         * </p>
         * <ul>
         * <li><b>Consultas (1-4):</b> Recuperación de datos desde la BD (lectura).</li>
         * <li><b>Persistencia (5, 8):</b> Inserción de nuevos registros (escritura).</li>
         * <li><b>Mantenimiento (6-7):</b> Modificación y borrado de registros existentes.</li>
         * </ul>
         */
        String Menu = """
                
                1. Mostrar todos los Productos en el Inventario.
                2. Buscar producto por referencia (REF-xxx).
                3. Buscar productos por tipo.
                4. Buscar producto por cantidad.
                5. Insertar un nuevo producto.
                6. Eliminar Producto por referencia.
                7. Actualizar producto (descripción, cantidad, precio, descuento, AplicarDto).
                8. Insertar un nuevo tipo de producto.
                9. Salir.
                """;


        String opcion = "";
        Scanner sc;

        do {
            sc = new Scanner(System.in);

            System.out.println(Menu);
            opcion = sc.nextLine();



            switch (opcion) {

                /** * Opción 1: Listar inventario completo.
                 * Llama a {@link SQLAccesManager#getProductos()} e imprime la lista.
                 */
                case "1":

                    try {
                        List<producto> Productos = SQLAccesManager.getProductos();

                        for (producto Producto : Productos) {
                            System.out.println(Producto);
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;

                /** * Opción 2: Búsqueda exacta por SKU/Referencia.
                 * Útil para encontrar un producto único rápidamente.
                 */
                case "2":

                    try {
                        sc = new Scanner(System.in);

                        System.out.print("Entar la referencia del producto: ");
                        String ref = sc.nextLine();
                        System.out.println(SQLAccesManager.getProductoRef(ref));
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }


                    break;

                /** * Opción 3: Filtrado por categoría técnica (ID de tipo).
                 */
                case "3":

                    try {
                        sc = new Scanner(System.in);

                        System.out.print("Entar la id del tipo de producto: ");
                        int idT = sc.nextInt();
                        System.out.println(SQLAccesManager.getProTipo(idT));
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;

                /** * Opción 4: Filtrado por disponibilidad de stock.
                 * Muestra productos con una cantidad igual o superior a la entrada.
                 */
                case "4":

                    try {
                        sc = new Scanner(System.in);

                        System.out.print("Entre la cantidad de producto: ");
                        int cantidad = sc.nextInt();

                        List<producto> ProductoCantidad = SQLAccesManager.getProCantidad(cantidad);

                        for (producto Producto : ProductoCantidad) {
                            System.out.println(Producto);
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;

                /** * Opción 5: Registro de nuevas existencias.
                 * Delega la captura de datos al metodo {@link #IngresarProducto()}.
                 */
                case "5":
                    IngresarProducto();

                    break;

                /** * Opción 6: Borrado físico de registros.
                 * Elimina el producto de la base de datos permanentemente mediante su referencia.
                 */
                case "6":
                    try {
                        System.out.println("Entre la referencia del producto que desea eliminar: ");
                        String refEliminar = sc.nextLine();
                        System.out.println(SQLAccesManager.EliminarProducto(refEliminar));

                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;

                /** * Opción 7: Modificación de atributos.
                 * Permite editar campos dinámicos (precio, stock, etc.) mediante {@link #ActualizarProducto(Scanner)}.
                 */
                case "7":
                    ActualizarProducto(sc);

                    break;

                /** * Opción 8: Gestión de categorías.
                 * Permite ampliar el catálogo de tipos de productos disponibles.
                 */
                case "8":

                    try {

                        System.out.println("Entre el id del nuevo tipo: ");
                        int idTi = sc.nextInt();
                        System.out.println("Entre el tipo de producto: ");
                        String tipo = sc.next();

                        SQLAccesManager.NuevoTipoProducto(idTi, tipo);
                    }catch (Exception e){
                        System.err.println(e.getMessage());
                    }

                    break;

                /** * Opción 9: Finalización.
                 * Rompe el bucle y cierra la ejecución del programa.
                 */
                case "9":
                    System.out.println("Saliendo...");



            }

        }while (!opcion.equals("9"));




    }

    /**
     * Solicita al usuario los datos necesarios para crear un nuevo producto.
     * <p>
     * Captura los datos desde la consola y crea una instancia de {@link producto}
     * para enviarla al {@link SQLAccesManager}.
     * </p>
     * * @see SQLAccesManager#InsertarProducto(producto)
     */
    private static void IngresarProducto() {
        try {

            Scanner sc1;
            sc1 = new Scanner(System.in);

            System.out.println("Ingrese la referencia del producto: ");
            String refP = sc1.nextLine();
            System.out.println("Ingrese el nombre del producto: ");
            String nombreP = sc1.nextLine();
            System.out.println("Ingrese la descripcion del producto: ");
            String descripcionP = sc1.nextLine();
            System.out.println("Ingrese la id del tipo de producto: ");
            int idTP = sc1.nextInt();
            System.out.println("Ingrese el cantidad del producto: ");
            int cantidadP = sc1.nextInt();
            System.out.println("Ingrese el precio del producto: ");
            double precioP = sc1.nextDouble();
            System.out.println("Ingrese el descuento del producto: ");
            int descuentoP = sc1.nextInt();
            System.out.println("Ingrese el iva del producto: ");
            int ivaP = sc1.nextInt();
            System.out.println("Ingrese si afecta el descuento al producto: ");
            boolean AplicarP = sc1.nextBoolean();


            SQLAccesManager.InsertarProducto(new producto(refP, nombreP, descripcionP, idTP, cantidadP, precioP, descuentoP, ivaP, AplicarP));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Solicita al usuario los valores actualizados de un producto existente.
     * <p>
     * El producto se identifica mediante su ID numérico. Se permite modificar
     * la descripción, cantidad, precio y política de descuentos.
     * </p>
     * * @param sc El objeto {@link Scanner} activo para la lectura de datos.
     * @see SQLAccesManager#ActualizarProducto(String, int, double, int, boolean, int)
     */
    private static void ActualizarProducto(Scanner sc) {
        try {

            Scanner sc1 = sc;
            System.out.println("Ingrese la id del producto que quiera actualizar:  ");
            int idP = sc1.nextInt();
            sc1 = new Scanner(System.in);


            System.out.println("Ingrese la descripcion del producto: ");
            String descripcionP = sc1.nextLine();
            System.out.println("Ingrese el cantidad del producto: ");
            int cantidadP = sc1.nextInt();
            System.out.println("Ingrese el precio del producto: ");
            double precioP = sc1.nextDouble();
            System.out.println("Ingrese el descuento del producto: ");
            int descuentoP = sc1.nextInt();
            System.out.println("Ingrese si afecta el descuento al producto: ");
            boolean AplicarDtoP = sc1.nextBoolean();

            SQLAccesManager.ActualizarProducto(descripcionP, cantidadP, precioP, descuentoP, AplicarDtoP, idP);

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


}