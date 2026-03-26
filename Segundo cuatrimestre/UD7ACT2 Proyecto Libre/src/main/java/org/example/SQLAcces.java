package org.example;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class SQLAcces {



    public static List<Animals> getAnimales() {

        List<Animals> animals = new LinkedList<>();

        String SQLTodosAnimales = "SELECT * FROM animals";


        try (Connection connection = SQLManager.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQLTodosAnimales)) {

            while (resultSet.next()) {

                int idAnimal = resultSet.getInt(1);
                String pet_name = resultSet.getString(2);
                int species = resultSet.getInt(3);
                int age = resultSet.getInt(4);

                Gender gender = Gender.valueOf(resultSet.getString((5)));

                Date Arrival_date = resultSet.getDate(6);
                LocalDate localDate = Arrival_date.toLocalDate();

                int caretaker = resultSet.getInt(7);
                boolean adopted = resultSet.getBoolean(8);


                animals.add(new Animals(idAnimal, pet_name, species, age, gender, localDate, caretaker, adopted));
            }


        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return animals;
    }






    public static void DetailAnimals(){

        String SQLDetailAnimals = """
                select an.pet_name, s.species, an.age, an.gender, an.arrival_date, an.adopted, st.first_name as caretaker
                from animals an
                join staff st on st.staff_id = an.caretaker
                join animal_species s on an.species = s.species_id
                """;

        try (Connection connection = SQLManager.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQLDetailAnimals)) {

            while (resultSet.next()) {
                String pet_name = resultSet.getString(1);
                String species = resultSet.getString(2);
                int age = resultSet.getInt(3);
                Gender gender = Gender.valueOf(resultSet.getString((4)));
                Date Arrival_date = resultSet.getDate(5);
                LocalDate localDate = Arrival_date.toLocalDate();
                boolean adopted = resultSet.getBoolean(6);
                String caretaker = resultSet.getString(7);

                System.out.println('[' + "Nombre= " +  pet_name + " | " + "Tipo= " + species + " | "
                        + "Edad= " + age + " años | " + "Genero= " + gender + " | "
                        + "Fecha de llegada= " + localDate + " | " + "Estado de adopcion= " + adopted + " | " + "Cuidador= " + caretaker + ']');


            }

        }catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }


    public static void AnimalsForAdotion(){

        String SQLAnimalsForAdoption = """
                select an.pet_name, s.species, an.age, an.gender, an.arrival_date
                from animals an
                join animal_species s on an.species = s.species_id
                left join adoptions ad on an.animal_id = ad.animal_id
                where ad.animal_id is null
               
                """;


        try (Connection connection = SQLManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLAnimalsForAdoption)){

            while (resultSet.next()) {
                String pet_name = resultSet.getString(1);
                String species = resultSet.getString(2);
                int age = resultSet.getInt(3);
                Gender gender = Gender.valueOf(resultSet.getString((4)));
                Date Arrival_date = resultSet.getDate(5);
                LocalDate localDate = Arrival_date.toLocalDate();

                System.out.println('[' + "Nombre= " +  pet_name + " | " + "Tipo= " +
                        species + " | " + "Edad= " + age + " años | " + "Genero= " +
                        gender + " | " + "Fecha de llegada= " + localDate + ']');

            }





        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }









}
