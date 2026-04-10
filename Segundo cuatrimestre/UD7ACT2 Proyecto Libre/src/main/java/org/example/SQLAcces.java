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

    public static int InsertAnimals(Animals a){

    int response = -1;

    String SQLInsertAnimals = """
            insert into animals(pet_name, species, age, gender, arrival_date, caretaker, adopted)
            values (?, ?, ?, ?, ?, ?, ?);
            """;

    try (Connection connection = SQLManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQLInsertAnimals)){

        statement.setNString(1, a.getAnimal_name());
        statement.setInt(2, a.getSpecies_id());
        statement.setInt(3, a.getAge());
        statement.setNString(4, a.getGender().toString());
        statement.setDate(5, Date.valueOf(a.getArrival_date()));
        statement.setInt(6, a.getCaretaker());
        statement.setBoolean(7, a.isAdopted());

        response = statement.executeUpdate();

        System.out.println("Animals insertado con exito");



    } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
    }

    return response;

    }



    public static List<Species> getAnimalSpecies(){

        List<Species> species = new LinkedList<>();

        String SQLAnimalSpecies = "select species_id, species from animal_species";

        try (Connection connection = SQLManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQLAnimalSpecies)){


            while (resultSet.next()) {
                species.add(new Species(
                        resultSet.getInt(1),
                        resultSet.getString(2)
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return species;


    }


    public static List<Staff> getCaretakersName(){

        List<Staff> staff = new LinkedList<>();

        String SQLSeeStaff = "select staff_id, birth_date, first_name, last_name, gender, hire_date, work_role  from staff where work_role = 'cuidador' and staff_id is not null";
        try (Connection connection = SQLManager.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQLSeeStaff)){



            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                Date birth_Day = resultSet.getDate(2);
                LocalDate localDateBirth = birth_Day.toLocalDate();
                String first_name = resultSet.getString(3);
                String last_name = resultSet.getString(4);
                Gender gender = Gender.valueOf(resultSet.getString((5)));
                Date hire_date = resultSet.getDate(6);
                LocalDate localDateHire = hire_date.toLocalDate();
                WorkRole work_role = WorkRole.valueOf(resultSet.getString(7));


                staff.add(new Staff(id, localDateBirth, first_name, last_name, gender, localDateHire, work_role ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return staff;
    }


    public static int deleteAnimals(int animal_id){
        int response = -1;

        String SQLDeleteAnimals = "delete from animals where animal_id = ?";

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQLDeleteAnimals)){

            statement.setInt(1, animal_id);
            response = statement.executeUpdate();
            System.out.println("Animals eliminado con exito");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return response;
    }



    public static void addAnimals(Animals a, int animalId, int adopterId, int staffId){

        String SQLGetIfAdopted = "Select adopted from animals where animal_id = ?";
        String SQLAdoptionTable = """
                insert into adoptions(animal_id, adopter_id, adoption_date, staff_id)
                values (?,?,curdate(),?)""";
        String SQlActualizarAnimals = "update animals set adopted = true where animal_id = ?";


        try (Connection connection = SQLManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(SQLGetIfAdopted)){

            statement.setInt(1, animalId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                boolean adopted = resultSet.getBoolean(1);
                if (adopted = true) {
                    System.out.println("Este animal ya esta adoptado");
                }
            }else {
                System.out.println("No existe ese animal");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQLAdoptionTable)){

            statement.setInt(1, animalId);
            statement.setInt(2, adopterId);
            statement.setInt(4,staffId);

            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try (Connection connection = SQLManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQLGetIfAdopted)){

            statement.setInt(1, animalId);
            statement.executeUpdate();

            System.out.println("Animal adoptado con exito");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }











}
