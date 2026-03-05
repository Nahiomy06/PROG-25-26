import Exepciones.EstaAlquiladaExeption;
import Exepciones.TiempoAlquilerExedidoExeption;
import Exepciones.YaExisteExeption;

import java.time.Duration;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class VideoDaw {

    Scanner sc = new Scanner(System.in);

    private String CIF;
    private String Direccion;
    private LocalDate FechaAlta;
    public static LinkedList<Articulo> Articulos;
    public static LinkedList<Cliente> Clientes;

    public VideoDaw(String CIF, String direccion, LocalDate fechaAlta, LinkedList<Articulo> articulos, LinkedList<Cliente> clientes) {
        this.CIF = CIF;
        this.Direccion = direccion;
        this.FechaAlta = fechaAlta;
        this.Articulos = new LinkedList<>();
        this.Clientes = new LinkedList<>();
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public LocalDate getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        FechaAlta = fechaAlta;
    }

    public LinkedList<Articulo> getArticulos() {
        return Articulos;
    }

    public void setArticulos(LinkedList<Articulo> articulos) {
        articulos = articulos;
    }

    public LinkedList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        clientes = clientes;
    }

    @Override
    public String toString() {
        return "VideoDaw{" +
                "CIF='" + CIF + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Fecha de alta=" + FechaAlta +
                ", Articulos=" + Articulos +
                ", Clientes=" + Clientes +
                '}';
    }


    public void mostrarInfoVideoClub() {
        System.out.println("        VideoDaw        " +
                "CIF: " + CIF + '\'' +
                ", Direccion: " + Direccion + '\'' +
                ", Fecha de alta: " + FechaAlta +
                ", Cantidad de articulos: " + Articulos.size() +
                ", Cantidad de clientes: " + Clientes.size());
    }

    public static void mostrarArticulosRegistrados() {

        if (Articulos.isEmpty()) {
            System.out.println("No existen Articulos registrados." + '\n');
        } else {
            for (Articulo A : Articulos) {
                System.out.println(A);
            }
        }
    }

    public static void mostrarClientesRegistrados() {

        if (Clientes.isEmpty()) {
            System.out.println("No existen Articulos registrados." + '\n');
        } else {
            for (Cliente C : Clientes) {
                System.out.println(C);
            }
        }
    }

    public void registrarArticulos(Articulo a) {
        System.out.println("Ingresa el codigo del Articulo");
        String Cod = sc.nextLine();
        if (Cod.equalsIgnoreCase(a.getCod())) {
            System.out.println("El articulo ya existe");
        } else{
            System.out.println("Ingresa el titulo del Articulo");
            String tilulo = sc.nextLine();
            LocalDate fechaRegistro = LocalDate.now();


            a = new Articulo(Cod, tilulo, fechaRegistro, null);
        }

    }



    public void resgistrarCliente(Cliente c) throws YaExisteExeption {

        System.out.println("Ingrese Dni: ");
        String DNI = sc.nextLine();
        if (DNI.equalsIgnoreCase(c.getDNI())) {
            String mesaje = "Este DNI ya existe.";
            throw new YaExisteExeption(mesaje);

        } else {
            System.out.println("Ingrese su num de socio: ");
            String socio = sc.nextLine();
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            System.out.println(c.getNombre() + "Ingrese su Direccion: ");
            String direccion = sc.nextLine();

             c = new Cliente(DNI, nombre, direccion, socio, null, Articulos);
        }
    }



    public void alquilar(Cliente cliente, Articulo articulo, String CodArticulo, String NumScocio ) throws EstaAlquiladaExeption {

        for (Articulo A : Articulos) {
            if (CodArticulo.equalsIgnoreCase(A.getCod())) {
                articulo = A;
            }
        }

        for (Cliente C : Clientes) {
            if (NumScocio.equalsIgnoreCase(C.getNumSocio())) {
                cliente = C;
            }
        }

        if (articulo instanceof Pelicula p && !p.EstaAlquilada) {
            p.alquilarPelicula();
            cliente.AlquilarArticulos(p);
        }

        if (articulo instanceof VideoJuego v && !v.EstaAlquilada) {
            v.alquilarVideojuego();
            cliente.AlquilarArticulos(v);
        }
    }


    public void devolver(Cliente cliente, Articulo articulo, String CodArticulo, String NumScocio) throws TiempoAlquilerExedidoExeption {

        for (Articulo A : Articulos) {
            if (CodArticulo.equalsIgnoreCase(A.getCod())) {

                LocalDate fecha = LocalDate.now();

                if (A instanceof Pelicula p) {
                    fecha = p.getFechaAlquiler();
                }
                if (A instanceof VideoJuego v) {
                    fecha = v.getFechaAlquiler();
                }

                long Horas = Duration.between(fecha, LocalDate.now()).toHours();

                if (Horas < 48) {
                    String mensaje = "Se ha excedido el tiempo de alquiler de 48 horas.";
                    throw  new TiempoAlquilerExedidoExeption(mensaje);
                }

                if (A instanceof Pelicula p) {
                    p.devolverPelicula();
                }

                if (A instanceof VideoJuego v) {
                    v.devolverVideojuego();
                }

            }
        }

    }

















}









