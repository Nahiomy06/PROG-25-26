import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Menu = """
                
                --INVENTARIO--
                
                1. Mostrar Productos en el Inventario.
                2. (Opcional) Registrar producto en el Inventario
                3. Eliminar Producto por referencia.
                4. Guardar y Salir.

                """;

        String option = "";


        CargarProductos();
        do {
            System.out.println(Menu);
            option = sc.nextLine();



            switch (option) {
                case "1":
                    MostrarProductos();
                    break;
                case "2":
                    CrearProductos();
                    break;
                case "3":
                    EliminarProducto();
                    break;
                case "4":
                    GuardarProductos();
                    EscribirSerializable();
                    break;
            }

        }while (!option.equals("4"));


    }



    final static String path = ".\\src\\recursos\\";
    static String fileNameUnicode = "productos.csv";
    static String fileNameBinario = "almacen.dat";
    static String fileNameSerial = "inventario.dat";
    static boolean eof = false;
    static List<Producto> productos = new ArrayList<Producto>();
    static Scanner sc = new Scanner(System.in);


    //Unicode
    public static void LeerUnicode(){
        try (FileReader fr = new FileReader(path + fileNameUnicode);
             BufferedReader br = new BufferedReader(fr)){
            String linea = "";
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split("/");

                if (datos.length == 4){
                    productos.add(new Producto(datos[0], datos[1], datos[2], datos[3]));

                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al encontrar el archivo " + fileNameUnicode);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + fileNameUnicode);
        }
    }

    public static void EscribirUnicode(){

        try (FileWriter fw = new FileWriter(path + fileNameUnicode);
            BufferedWriter bw = new BufferedWriter(fw)){

            for (Producto p : productos){
                bw.write(p.getReferencia() + "/" + p.getNombre() + "/" + p.getDescripcion() + "/" + p.getTipo());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + fileNameUnicode);
        }
    }

    //Binario

    public static void LeerBinario(){

        try (FileInputStream fis = new FileInputStream(path + fileNameBinario);
            DataInputStream dis = new DataInputStream(fis)){

            int i = 0;

            while (!eof) {
                int Cantidad = dis.readInt();
                double Precio = dis.readDouble();
                int Descuenta = dis.readInt();
                int IVA = dis.readInt();
                boolean AplicarDto =  dis.readBoolean();

                if (i > productos.size()){
                    Producto p = productos.get(i);

                    p.setCantidad(Cantidad);
                    p.setPrecio(Precio);
                    p.setDescuento(Descuenta);
                    p.setIVA(IVA);
                    p.setAplicarDto(AplicarDto);
                }
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al encontrar el archivo " + fileNameBinario);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + fileNameBinario);
            System.out.println(e.getMessage());
        }

    }

    public static void EscribirBinario(){

        try (FileOutputStream fos = new FileOutputStream(path + fileNameBinario);
            DataOutputStream dos = new DataOutputStream(fos)){

            for (Producto p : productos){
                dos.writeInt(p.getCantidad());
                dos.writeDouble(p.getPrecio());
                dos.writeInt(p.getDescuento());
                dos.writeInt(p.getIVA());
                dos.writeBoolean(p.isAplicarDto());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al encontrar el archivo " + fileNameBinario);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + fileNameBinario);
        }
    }

    public static void EscribirSerializable(){

        try (FileOutputStream fos = new FileOutputStream(path + fileNameSerial);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(productos);

            System.out.println("Se ah escrito el archivo " + fileNameSerial);

        } catch (FileNotFoundException e) {
            System.out.println("Error al encontrar el archivo " + fileNameSerial);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + fileNameSerial);
        }
    }



    public static void MostrarProductos(){

        for (Producto p : productos){
            System.out.println(p);
        }

    }

    public static void GuardarProductos(){
        EscribirUnicode();
        EscribirBinario();
    }

    public static void CargarProductos(){
        LeerUnicode();
        LeerBinario();
    }


    public static void EliminarProducto(){

        if (productos.isEmpty()){
            System.out.println("No existe el productos");
            return;
        }
        for (Producto p : productos){
            System.out.println(p.getReferencia() + "/" + p.getDescripcion());

        }
        System.out.println("Ingrese la referencia del producto que desea eliminar");
        String referencia = sc.nextLine();

        productos.removeIf(p -> p.getReferencia().equals(referencia));

    }


    public static void CrearProductos(){

        System.out.println("Creando productos");
        System.out.println("Ingrese la referencia del producto: ");
        String Referencia = sc.nextLine();

        if (ExisteProductos(Referencia)){
            System.out.println("Esa referencia ya existe.");
            return;
        } else {
            System.out.println("Ingrese el nombre del producto: ");
            String Nombre = sc.nextLine();
            System.out.println("Ingrese la descripcion del producto: ");
            String Descripcion = sc.nextLine();
            System.out.println("Ingrese el tipo del producto: ");
            String Tipo = sc.nextLine();
            System.out.println("Ingrese la cantidad del producto: ");
            int Cantidad = sc.nextInt();
            System.out.println("Ingrese la Precio del producto: ");
            double Precio = sc.nextDouble();
            System.out.println("Ingrese la Descuento del producto: ");
            int Descuento = sc.nextInt();
            System.out.println("Ingrese la IVA del producto: ");
            int IVA = sc.nextInt();
            System.out.println("Ingrese si aplica el descuento del producto: ");
            boolean AplicarDto = sc.nextBoolean();

            Producto p = new Producto(Referencia, Nombre, Descripcion, Tipo, Cantidad, Precio, Descuento, IVA, AplicarDto);
            productos.add(p);
        }
    }


    public static boolean ExisteProductos(String Referencia){
        for (Producto p : productos){
            if (p.getReferencia().equalsIgnoreCase(Referencia)){
                return true;
            }
        }
        return false;
    }




}