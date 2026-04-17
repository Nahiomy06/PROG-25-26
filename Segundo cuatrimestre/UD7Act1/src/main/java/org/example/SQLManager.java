package org.example;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Gestiona la configuración y las conexiones a una base de datos MySQL.
 * <p>
 * Esta clase permite persistir los parámetros de conexión en un archivo local,
 * recuperarlos y establecer una conexión activa mediante JDBC.
 * </p>
 * * @author Nahiomy
 * @version 1.0
 */

public class SQLManager {

    /** Driver JDBC predeterminado para MySQL. */
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";

    /** Nombre del esquema o base de datos. */
    private static String URL = "jdbc:mysql://localhost:3306/";

    /** Nombre de usuario para la autenticación. */
    private static String SCHEMA = "Tienda";

    /** Nombre de usuario para la autenticación. */
    private static String USER = "root";

    /** Contraseña para la autenticación. */
    private static String PASSWORD = "daw12";


    /** Ruta del directorio donde se almacenan los archivos de configuración. */
    private static String Path = "./src/main/java/org/example/ficheros/";
    private static String FileName = "application.dat";


    /**
     * Guarda los parámetros de conexión actuales en un archivo de texto plano.
     * <p>
     * Los datos se almacenan en formato "Clave = Valor". Si el archivo o
     * el directorio no existen, se intentará crearlos (dependiendo de los permisos del SO).
     * </p>
     * * @see #CargarConnection()
     */
    public static void GuardarConnection(){

        try(FileWriter file = new FileWriter(Path + FileName);
            BufferedWriter buffer = new BufferedWriter(file)){

            buffer.write("Driver = " + DRIVER);
            buffer.newLine();
            buffer.write("Url = " + URL);
            buffer.newLine();
            buffer.write("Schema = " + SCHEMA );
            buffer.newLine();
            buffer.write("User = " + USER );
            buffer.newLine();
            buffer.write("Password = " + PASSWORD);
            buffer.newLine();


        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    /**
     * Carga los parámetros de conexión desde el archivo de configuración {@code application.dat}.
     * <p>
     * Lee línea a línea el archivo y actualiza los atributos estáticos de la clase
     * separando las cadenas mediante el delimitador "=".
     * </p>
     * * @throws ArrayIndexOutOfBoundsException Si el formato del archivo no es correcto (falta el signo '=').
     */
    public static void CargarConnection(){

        try (FileReader file = new FileReader(Path + FileName);
            BufferedReader buffer = new BufferedReader(file)){

            DRIVER = buffer.readLine().split("=")[1].trim();
            URL = buffer.readLine().split("=")[1].trim();
            SCHEMA = buffer.readLine().split("=")[1].trim();
            USER = buffer.readLine().split("=")[1].trim();
            PASSWORD = buffer.readLine().split("=")[1].trim();


        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        }

    }



    /**
     * Intenta establecer una conexión con la base de datos utilizando los parámetros actuales.
     * * @return Un objeto {@link Connection} si la conexión fue exitosa;
     * {@code null} en caso de error (Driver no encontrado o fallo de autenticación/red).
     */
    public static Connection getConnection() {
        Connection conn = null;

        try {

            Class.forName(DRIVER);

            conn = DriverManager.getConnection(URL + SCHEMA, USER, PASSWORD);

        }catch (ClassNotFoundException e){
            System.err.println("Error de acceso al driver" + e.getMessage());
        }catch (SQLException e){
            System.err.println("Error de SQL" + e.getMessage());
        }


        return conn;
    }


}
