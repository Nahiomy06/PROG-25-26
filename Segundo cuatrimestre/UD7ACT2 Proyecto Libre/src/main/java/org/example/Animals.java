package org.example;

import java.time.LocalDate;

public class Animals {

    private int animal_id;
    private String animal_name;
    private int species_id;
    private int age;
    private Gender gender;
    private LocalDate Arrival_date;
    private int Caretaker;
    private boolean adopted;


    public Animals(int animal_id, String animal_name, int species_id, int age, Gender gender, LocalDate arrival_date, int caretaker,  boolean adopted) {
        this.animal_id = animal_id;
        this.animal_name = animal_name;
        this.species_id = species_id;
        this.age = age;
        this.gender = gender;
        Arrival_date = arrival_date;
        Caretaker = caretaker;
        this.adopted = adopted;
    }

    public Animals(String animal_name, int species_id, int age, Gender gender, LocalDate arrival_date, int caretaker, boolean adopted) {
        this.animal_name = animal_name;
        this.species_id = species_id;
        this.age = age;
        this.gender = gender;
        Arrival_date = arrival_date;
        Caretaker = caretaker;
        this.adopted = adopted;

    }


    public int getAnimal_id() {
        return animal_id;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public int getSpecies_id() {
        return species_id;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getArrival_date() {
        return Arrival_date;
    }

    public int getCaretaker() {
        return Caretaker;
    }

    public boolean isAdopted() {
        return adopted;
    }

    @Override
    public String toString() {
        return "[" +
                "Id del animal= " + animal_id + " | " +
                "Nombre= " + animal_name + " | " +
                "Id de la especie=  " + species_id + " | " +
                "Edad = " + age + " | " +
                "Genero= " + gender + " | " +
                "Fecha de llegada= " + Arrival_date + " | " +
                "Id del cuidador= " + Caretaker + " | " +
                "Estado de adopcion= " + adopted + "]" ;
    }
}
