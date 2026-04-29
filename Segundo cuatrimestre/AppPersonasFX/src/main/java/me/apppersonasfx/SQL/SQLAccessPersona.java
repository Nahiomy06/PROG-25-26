package me.apppersonasfx.SQL;

import me.apppersonasfx.configuration.SQLDataBaseManager;
import me.apppersonasfx.model.Persona;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SQLAccessPersona {

    public static List<Persona> getAllPersonas() {
        List<Persona> personas = new LinkedList<>();

        String sqlAllPeople = "SELECT * FROM personas";

        try (Connection connection = SQLDataBaseManager.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlAllPeople)){

            while (resultSet.next()) {
                String dni = resultSet.getNString(1);
                String name = resultSet.getNString(2);
                String surname = resultSet.getNString(3);
                String email = resultSet.getNString(4);
                int age = resultSet.getInt(5);
                String phone = resultSet.getNString(6);

                //Buider .0.
                Persona p = Persona.builder()
                        .dni(dni)
                        .name(name)
                        .surname(surname)
                        .email(email)
                        .age(age)
                        .phone(phone)
                        .build();

                personas.add(p);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return personas;
    }

    public static Persona getPersonaByID(String dni) {

        Persona p = null;

        String sqlSelectID = "SELECT * FROM personas WHERE dni = ?";

        try (Connection connection = SQLDataBaseManager.getConnection();
            PreparedStatement Statement = connection.prepareStatement(sqlSelectID)){

            Statement.setString(1,dni);
            ResultSet resultSet = Statement.executeQuery();
            if (resultSet.next()) {
                String dniBd = resultSet.getNString(1);
                String name = resultSet.getNString(2);
                String surname = resultSet.getNString(3);
                String email = resultSet.getNString(4);
                int age = resultSet.getInt(5);
                String phone = resultSet.getNString(6);


                p = Persona.builder()
                        .dni(dniBd)
                        .name(name)
                        .surname(surname)
                        .email(email)
                        .age(age)
                        .phone(phone)
                        .build();

            }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
        }
        return p;

    }

    public static Persona getPersonaByEmail(String email) {
        Persona p = null;

        String sqlSelectID = "SELECT * FROM personas WHERE email = ?";

        try (Connection connection = SQLDataBaseManager.getConnection();
             PreparedStatement Statement = connection.prepareStatement(sqlSelectID)) {

            Statement.setString(1, email);
            ResultSet resultSet = Statement.executeQuery();
            if (resultSet.next()) {
                String dni = resultSet.getNString(1);
                String name = resultSet.getNString(2);
                String surname = resultSet.getNString(3);
                String emailBd = resultSet.getNString(4);
                int age = resultSet.getInt(5);
                String phone = resultSet.getNString(6);

                p = Persona.builder()
                        .dni(dni)
                        .name(name)
                        .surname(surname)
                        .email(emailBd)
                        .age(age)
                        .phone(phone)
                        .build();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return p;
    }

    public static boolean createPersona(Persona persona) {
        boolean status = false;

        String sqlInsertPersona = "Insert into person(dni, name, surname, email, age, phone) values(?,?,?,?,?,?)";

        try (Connection connection = SQLDataBaseManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(sqlInsertPersona)){

            statement.setString(1, persona.getDni());
            statement.setString(2, persona.getName());
            statement.setString(3, persona.getSurname());
            statement.setString(4, persona.getEmail());
            statement.setInt(5, persona.getAge());
            statement.setString(6, persona.getPhone());

            statement.execute();
            status = true;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return status;
    }

    public static boolean updatePersona(Persona persona) {
        boolean status = false;

        String sqlUpdatePersona = "UPDATE person SET name = ?, surname = ?," +
                " email = ?, age = ?, phone = ? WHERE dni = ?";

        try(Connection connection = SQLDataBaseManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(sqlUpdatePersona)){

            statement.setString(1, persona.getName());
            statement.setString(2, persona.getSurname());
            statement.setString(3, persona.getEmail());
            statement.setInt(4, persona.getAge());
            statement.setString(5, persona.getPhone());

            //Where:
            statement.setString(6, persona.getDni());

            statement.execute();
            status = true;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


        return status;
    }

    public static boolean deleteByDni(String dni) {
        boolean status = false;

        String sqlDeletePersona = "DELETE FROM personas WHERE dni = ?";

        try (Connection connection = SQLDataBaseManager.getConnection();
        PreparedStatement Statement = connection.prepareStatement(sqlDeletePersona)){

            Statement.setString(1,dni);

            Statement.execute();
            status = true;

        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return status;
    }







}
