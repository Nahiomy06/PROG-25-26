package me.apppersonasfx.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDataBaseManager {


    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/";
    private static String SCHEMA = "dawpeople";
    private static String USER = "root";
    private static String PASSWORD = "daw12";


    public static Connection getConnection() {
        Connection conn = null;

        try {

            Class.forName(DRIVER);

            conn = DriverManager.getConnection(URL + SCHEMA, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.err.println("Error de acceso al driver" + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error de SQL" + e.getMessage());
        }
        return conn;
    }



}
