package org.example;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            SQLManager.CargarConnection();
            Connection conn = SQLManager.getConnection();
            if (conn != null) {
                System.out.println("Conectado correctamente");
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }



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

                case "5":
                    IngresarProducto();

                    break;

                case "6":
                    try {
                        System.out.println("Entre la referencia del producto que desea eliminar: ");
                        String refEliminar = sc.nextLine();
                        System.out.println(SQLAccesManager.EliminarProducto(refEliminar));

                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;

                case "7":
                    ActualizarProducto(sc);

                    break;

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

                case "9":
                    System.out.println("Saliendo...");



            }

        }while (!opcion.equals("9"));




    }

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