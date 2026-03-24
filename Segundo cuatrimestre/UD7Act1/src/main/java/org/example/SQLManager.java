package org.example;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLManager {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/";
    private static String SCHEMA = "Tienda";
    private static String USER = "root";
    private static String PASSWORD = "daw12";



    private static String Path = "./src/main/java/org/example/ficheros/";
    private static String FileName = "application.dat";


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
