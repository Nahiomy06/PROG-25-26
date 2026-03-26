package org.example;

import java.time.LocalDate;

public class Adopters {


    private String dni;
    private int adopter_id;
    private LocalDate birth_date;
    private String first_name;
    private String last_name;
    private Gender gender;
    private String phone;
    private String email;

    public Adopters(String dni, LocalDate birth_date, String first_name, String last_name, Gender gender, String phone, String email) {
        this.dni = dni;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public int getAdopter_id() {
        return adopter_id;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Adopters [" +
                "dni='" + dni + " | " +
                ", adopter_id= " + adopter_id + " | " +
                ", birth_date= " + birth_date + " | " +
                ", first_name= " + first_name + " | " +
                ", last_name= " + last_name + " | " +
                ", gender= " + gender + " | " +
                ", phone= " + phone + " | " +
                ", email= " + email +
                ']';
    }
}
