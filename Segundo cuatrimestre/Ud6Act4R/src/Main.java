import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        //path a la carpeta Recursos del proyecto
        final String pathFile = "./src/Recursos/";

        //Nombre del fichero Binario
        final String fileNameBinario = "almacen.dat";

        //Nombre del fichero UNICODE
        final String fileNameUnicode = "productos.csv";

        //Fichero Serializable
        final String fileNameSerial = "inventario.dat";


                //Metodo para que se escriba el fichero binario como se necesita
        //escribirFicheroBinarioExamen(pathFile, fileNameBinario);


        LinkedList<Producto> productosLeidos = leerFicheroUnicode(pathFile, fileNameUnicode);

        //prueba

        LinkedList<Producto> productosLeidosBinarios = new LinkedList<Producto>();




//        Scanner sc = new Scanner(System.in);
//
//        String Menu = """
//
//                --INVENTARIO--
//
//                1. Mostrar Productos en el Inventario.
//                2. (Opcional) Registrar producto en el Inventario
//                3. Eliminar Producto por referencia.
//                4. Guardar y Salir.
//
//                """;
//
//        String option = "";
//
//        do {
//            System.out.println(Menu);
//            option = sc.nextLine();
//
//            switch (option) {
//                case "1":
//                    break;
//
//                case "2":
//                    break;
//                case "3":
//                    break;
//                case "4":
//                    break;
//
//
//            }
//        }while (!option.equals("4"));



        Producto[] productos = (Producto[]) productosLeidos.toArray();
        Producto[] productos2 = (Producto[]) productosLeidosBinarios.toArray();

        for(int i =0; i < productos.length; i++) {
            productos[i].setCantidad(productos2[i].getCantidad());
        }

        //prueba


        int i = 0;

        //Lectura de fichero binario

        boolean eof = false;

        try(FileInputStream fichero = new FileInputStream(pathFile+fileNameBinario);
            DataInputStream lector = new DataInputStream(fichero);)
        {
            while(!eof)
            {
                // OJO CUIDADO, MUY IMPORTANTE: DANGER DANGER
                //CONOCER LA ESTRUCTURA DEL FICHERO

                int cantidad = lector.readInt();
                double precio = lector.readDouble();
                int descuento = lector.readInt();
                int IVA = lector.readInt();
                boolean aplicarDto = lector.readBoolean();


                productosLeidos.get(i).setCantidad(cantidad);
                productosLeidos.get(i).setPrecio(precio);
                productosLeidos.get(i).setDescuento(descuento);
                productosLeidos.get(i).setIVA(IVA);
                productosLeidos.get(i).setAplicarDto(aplicarDto);

                if(i < productosLeidos.size())
                {
                    i++;
                }

            }


        }catch(EOFException e)
        {
            eof = true;


        }catch(IOException e)
        {
            System.out.println("Ha ocurrido un error al I/O");
            System.out.println(e.getMessage());

        }catch(Exception e)
        {
            System.out.println("Ha ocurrido un error inexperado");
            System.out.println(e.getMessage());
        }





        //Recorro la lista y muestro todos los valores
        for(Producto p : productosLeidos)
        {
            System.out.println(p.toString());
        }

    }//main


    private static LinkedList<Producto> leerFicheroUnicode(final String pathFile, String fileName) {
        LinkedList<Producto> lineas = null;
        if(pathFile != null && fileName != null)
        {
            lineas = new LinkedList<Producto>();

            try (FileReader file = new FileReader(pathFile+fileName);
                 BufferedReader buffer = new BufferedReader(file);)
            {
                String linea = null;
                do {
                    linea = buffer.readLine();

                    if(linea != null) {

                        String [] elementos = linea.split("/");
                        Producto p =
                                new Producto(elementos[0], elementos[1],elementos[2]);

                        lineas.add(p);

                    }

                }while(linea != null);

                return lineas;

            }catch(IOException e) {
                e.printStackTrace();
            }
        }//if

        return lineas;

    }//metodo


    private static void escribirFicheroBinarioExamen(final String pathFile, String fileNameBinario) {
        //Escritura de fichero binario
        try (FileOutputStream fichero = new FileOutputStream(pathFile + fileNameBinario, false);
             DataOutputStream escritor = new DataOutputStream(fichero);) {

            Producto p1 = new Producto(5, 25.75, 15, 21, false);
            Producto p2 = new Producto(15, 55.95, 5, 21, true);
            Producto p3 = new Producto(100, 3.25, 0, 21, false);
            Producto p4 = new Producto(300, 0.95, 0, 21, false);
            Producto p5 = new Producto(27, 5.25, 13, 21, true);


            LinkedList<Producto> productos = new LinkedList<Producto>();

            productos.add(p1);
            productos.add(p2);
            productos.add(p3);
            productos.add(p4);
            productos.add(p5);


            for (Producto p : productos) {

                escritor.writeInt(p.getCantidad());
                escritor.writeDouble(p.getPrecio());
                escritor.writeInt(p.getDescuento());
                escritor.writeInt(p.getIVA());
                escritor.writeBoolean(p.isAplicarDto());
            }

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al I/O");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inexperado");
            System.out.println(e.getMessage());

        }
    }


    public static void escribirSerializable(String pathFile, String fileNameSerial, LinkedList<Producto> Lista) {
        try (FileOutputStream file = new FileOutputStream(pathFile + fileNameSerial);
             ObjectOutputStream escritor = new ObjectOutputStream(file)) {

            escritor.writeObject(Lista);

            System.out.println(Lista);

            System.out.println("El inventario se ah guardado correctamente");

        } catch (FileNotFoundException ex) {
            System.out.println("El inventario no se ha encontrado");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void leerSerializable(final String pathFile, String fileNameSerial) {
        boolean eof = false;

        try (FileInputStream file = new FileInputStream(pathFile + fileNameSerial);
        ObjectInputStream lector = new ObjectInputStream(file)){

            while (!eof){
                Object obj = lector.readObject();
                if (obj instanceof Producto){
                    Producto p = (Producto) obj;
                    System.out.println(p);

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}//clase