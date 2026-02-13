import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner sc = new Scanner(System.in);

    static final String path =  ".\\src\\resources\\";
    static final String fileName = "Biblioteca.dat";
    static final boolean fileMode = false;
    static final boolean eof = false;
    static List<Libro> libros = new LinkedList();



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String menu = """ 
                1. Crear Libro
                2. Mostrar Libros
                3. Eliminar Libro
                4. Guardar Libros
                5. Salir
                """;

        String opcion;

        cargarFicheros();
        do {
            System.out.println(menu);
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> crearLibro();
                case "2" -> mostrarLibros();
                case "3" -> eliminarLibro();
                case "4" -> guardarBiblioteca();
                case "5" -> System.out.println("Cerrando programa");


            }


        } while (!opcion.equals("5"));

    }


    public static void crearLibro() {
        System.out.println("Ingrese el ISBN del libro: ");
        String ISBN = sc.nextLine();

        if (ExistenProductos(ISBN)) {
            System.out.println("Este ISBN ya esta en uso ");
        } else {

            System.out.println("Ingrese el titulo del libro: ");
            String Titulo = sc.nextLine();
            System.out.println("Ingrese el autor del libro: ");
            String Autor = sc.nextLine();
            System.out.println("Ingrese el fecha del libro: ");
            String FechaPublicacion = sc.nextLine();

            Libro P = new Libro(ISBN, Titulo, Autor, FechaPublicacion);
            libros.add(P);
        }
    }


    public static void mostrarLibros() {

        if (libros.isEmpty()) {
            System.out.println("No existen productos");
        } else {
            for (Libro P : libros) {
                System.out.println(P);
            }
        }
    }

    public static void eliminarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("codigo de producto a eliminar: ");
        String ISBN = sc.nextLine();

        boolean Eliminado = libros.removeIf(producto -> ISBN.equals(producto.getISBN()));

        if (Eliminado) {
            System.out.println("Libro ha sido eliminado");
        }else  {
            System.out.println("No existen ese libro");
        }
    }

    public static void guardarBiblioteca() {
        try(FileOutputStream file =  new FileOutputStream(path + fileName, fileMode );
            ObjectOutputStream buffer = new ObjectOutputStream(file)) {

            for (Libro P : libros) {
                buffer.writeObject(P);
            }
            System.out.println("Los libros se an guardado exitosamente");


        } catch (IOException e) {
            System.out.println("Error de archivo: " + e.getMessage());
        }
    }

    public static void cargarFicheros() {
        try (FileInputStream file = new FileInputStream(path + fileName);
             ObjectInputStream lector = new ObjectInputStream(file)){


            while (!eof){
                Object obj = lector.readObject();
                if (obj instanceof Libro) {
                    Libro L = (Libro) obj;
                    libros.add(L);
                }

            }

        } catch (EOFException eof) {
            System.out.println("La libreria ha sido cargada correctamente.");

        } catch (IOException |  ClassNotFoundException e) {
            System.out.println("Error de archivo: " + e.getMessage());
        }
    }


    private static boolean ExistenProductos(String ISBN) {
        for (Libro L : libros) {
            if (L.getISBN().equalsIgnoreCase(ISBN)) {
                return true;
            }
        }
        return false;
    }















}