import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Producto {
//• Referencia (String)
//• Descripción (String)
//• Tipo (String)
//• Cantidad (int)
//• Precio (double)
//• Descuento (int)
//• IVA (int)
//• AplicarDto (boolean)



    private String Referencia;
    private String Descripcion;
    private String Tipo;
    private int Cantidad;
    private double Precio;
    private int Descuento;
    private int IVA;
    private boolean AplicarDTO;

    static List<Producto> productos = new ArrayList<Producto>();

    public Producto(String referencia, String descripcion, String tipo, int cantidad, double precio, int descuento, int IVA) {
        this.Referencia = referencia;
        this.Descripcion = descripcion;
        this.Tipo = tipo;
        this.Cantidad = cantidad;
        this.Precio = precio;
        this.Descuento = descuento;
        this.IVA = IVA;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String referencia) {
        Referencia = referencia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int descuento) {
        Descuento = descuento;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public boolean isAplicarDTO() {
        return AplicarDTO;
    }

    public void setAplicarDTO(boolean aplicarDTO) {
        AplicarDTO = aplicarDTO;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "Referencia='" + Referencia + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Cantidad=" + Cantidad +
                ", Precio=" + Precio +
                ", Descuento=" + Descuento +
                ", IVA=" + IVA +
                '}';
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

    public static void crearProducto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el codigo del producto: ");
        String Referencia = sc.nextLine();

        if (ExistenProductos(Referencia)) {
            System.out.println("Esta referencia esta en uso ");
        } else {
            System.out.println("Ingrese la descripcion del producto: ");
            String Descripcion = sc.nextLine();
            System.out.println("Ingrese la cantidad del producto: ");
            int Cantidad = sc.nextInt();
            System.out.println("Ingrese el tipo de producto: ");
            String Tipo = sc.nextLine();
            System.out.println("Ingrese el precio del producto: ");
            double Precio = sc.nextDouble();
            System.out.println("Ingrese el descuento del producto: ");
            int Descuento = sc.nextInt();
            System.out.println("Ingrese el iva del producto: ");
            int IVA = sc.nextInt();


            Producto P = new Producto(Referencia, Descripcion, Tipo, Cantidad, Precio, Descuento, IVA);
            productos.add(P);
        }
    }


    public static void eliminarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("codigo de producto a eliminar: ");
        String Referencia = sc.nextLine();

        boolean Eliminado = productos.removeIf(producto -> Referencia.equals(producto.getReferencia()));

        if (Eliminado) {
            System.out.println("Producto eliminado");
        } else {
            System.out.println("No existen ese producto");
        }
    }

    private static boolean ExistenProductos(String Referencia) {
        for (Producto    P : productos) {
            if (P.getReferencia().equalsIgnoreCase(Referencia)) {
                return true;
            }
        }
        return false;
    }



    //Unicode
    final static String path1 = ".\\src\\resource\\";
    static String fileName1 = "productos.csv";
    static final boolean filemode1 = false;


    public static void guardarFicherosUnicode() {

        try(FileWriter Almacen = new FileWriter(path1 + fileName1);
            BufferedWriter BuffW = new BufferedWriter(Almacen)){

            for (Producto P : productos) {
                BuffW.write(P.toString());
            }
            System.out.println("los cambios del almacen Unicode an guardado correctamente");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void cargarFicherosUnicode() {
        try (BufferedReader br = new BufferedReader(new FileReader(path1 + fileName1))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                productos.add(linea);
            }

            System.out.println("Almacen se ha cargado correctamente.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

























    //Bianrios
    final static String path2 = ".\\src\\resource\\";
    static String fileName2 = "almacen.dat";
    static final boolean filemode2 = false;
    static boolean eof = false;


    public static void guardarFicherosBinario() {

        try(FileOutputStream file =  new FileOutputStream(path2 + fileName2 );
            DataOutputStream escritor = new DataOutputStream(file)) {


            for (Producto P : productos) {
                escritor.writeUTF(P.getReferencia());
                escritor.writeUTF(P.getDescripcion());
                escritor.writeUTF(P.getTipo());
                escritor.writeDouble(P.getPrecio());
                escritor.writeDouble(P.getDescuento());
                escritor.writeInt(P.getIVA());
                escritor.writeBoolean(P.isAplicarDTO());
            }
            System.out.println("los cambios binarios se an guardado correctamente");

        } catch (IOException e) {
            System.out.println("Error al abrir Almacen" + e.getMessage());
        }

    }

    public static void cargarFicheros() {
        try (FileInputStream file = new FileInputStream(path2 + fileName2);
             DataInputStream lector = new DataInputStream(file)) {

            while (!eof){
                String referencia = lector.readUTF();
                String descripcion = lector.readUTF();
                String tipo = lector.readUTF();
                double Precio = lector.readDouble();
                int Descuento = lector.readInt();
                int IVA = lector.readInt();
                boolean AplicarDTO = lector.readBoolean();

            }

        } catch (EOFException e) {
            eof = true;
            System.out.println("Almacen Binario se ha cargado correctamente.");

        } catch (IOException e2) {
            System.out.println("Error al manejar el almacen binario: " + e2.getMessage());
        }
    }










}
