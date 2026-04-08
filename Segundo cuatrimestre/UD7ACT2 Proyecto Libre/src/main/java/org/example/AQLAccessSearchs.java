package org.example;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class AQLAccessSearchs {



    public static List<Animals> getAnimalsById(int animal_id){
        List<Animals> animals = new LinkedList<>();

        String SqlAnimalsByName = "select * from animals where animal_id = ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SqlAnimalsByName)){

            statement.setInt(1, animal_id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt(1);
                String pet_name = resultSet.getString(2);
                int species_id = resultSet.getInt(3);
                int age = resultSet.getInt(4);
                Gender gender = Gender.valueOf(resultSet.getString((5)));
                Date arrival_date = resultSet.getDate(6);
                LocalDate localDate = arrival_date.toLocalDate();
                int caretaker = resultSet.getInt(7);
                boolean adopted = resultSet.getBoolean(8);

                animals.add(new Animals(id, pet_name, species_id,  age, gender, localDate, caretaker, adopted));

            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return animals;

    }


    public static List<Animals> getAnimalsByName(String animal_name){
        List<Animals> animals = new LinkedList<>();

        String SqlAnimalsByName = "select * from animals where pet_name = ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SqlAnimalsByName)){

            statement.setString(1, animal_name);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt(1);
                String pet_name = resultSet.getString(2);
                int species_id = resultSet.getInt(3);
                int age = resultSet.getInt(4);
                Gender gender = Gender.valueOf(resultSet.getString((5)));
                Date arrival_date = resultSet.getDate(6);
                LocalDate localDate = arrival_date.toLocalDate();
                int caretaker = resultSet.getInt(7);
                boolean adopted = resultSet.getBoolean(8);

                animals.add(new Animals(id, pet_name, species_id,  age, gender, localDate, caretaker, adopted));

            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return animals;

    }

    public static List<Animals> getAnimalsByAge(int anmimal_age){
        List<Animals> animals = new LinkedList<>();

        String SqlAnimalsByName = "select * from animals where age <= ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SqlAnimalsByName)){

            statement.setInt(1, anmimal_age);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt(1);
                String pet_name = resultSet.getString(2);
                int species_id = resultSet.getInt(3);
                int age = resultSet.getInt(4);
                Gender gender = Gender.valueOf(resultSet.getString((5)));
                Date arrival_date = resultSet.getDate(6);
                LocalDate localDate = arrival_date.toLocalDate();
                int caretaker = resultSet.getInt(7);
                boolean adopted = resultSet.getBoolean(8);

                animals.add(new Animals(id, pet_name, species_id,  age, gender, localDate, caretaker, adopted));

            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return animals;

    }


    public static List<Animals> getAnimalsByTimeDate(int months){
        List<Animals> animals = new LinkedList<>();

        String SqlAnimalsByName = "select * from animals where timestampdiff(month, arrival_date, curdate()) >= ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SqlAnimalsByName)){

            statement.setInt(1, months);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt(1);
                String pet_name = resultSet.getString(2);
                int species_id = resultSet.getInt(3);
                int age = resultSet.getInt(4);
                Gender gender = Gender.valueOf(resultSet.getString((5)));
                Date arrival_date = resultSet.getDate(6);
                LocalDate localDate = arrival_date.toLocalDate();
                int caretaker = resultSet.getInt(7);
                boolean adopted = resultSet.getBoolean(8);

                animals.add(new Animals(id, pet_name, species_id,  age, gender, localDate, caretaker, adopted));

            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return animals;

    }






}
