package org.example;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class SQLAccesEmployees {

    public static List<String> getEmployeesName() {

        List<String> empNombres = new LinkedList<>();

        String sqlNombreEmpleados = "SELECT first_name FROM employees";

        try (Connection conn = SQLdataManager.getConnection();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlNombreEmpleados);){

            while (resultSet.next()){
                empNombres.add(resultSet.getNString(1));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return empNombres;
    }
}
