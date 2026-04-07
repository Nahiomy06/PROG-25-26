package org.example;

import java.time.LocalDate;

public class Staff {


    private int staff_id;
    private LocalDate birth_date;
    private String first_name;
    private String last_name;
    private Gender gender;
    private LocalDate hire_date;
    WorkRole work_role;

    public Staff(int staff_id,LocalDate birth_date, String first_name, String last_name, Gender gender, LocalDate hire_date, WorkRole work_role) {
        this.staff_id = staff_id;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.hire_date = hire_date;
        this.work_role = work_role;
    }

    public Staff(int staff_id, String first_name, String last_name) {
        this.staff_id = staff_id;
        this.first_name = first_name;
        this.last_name = last_name;

    }


    public int getStaff_id() {
        return staff_id;
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

    public LocalDate getHire_date() {
        return hire_date;
    }


    @Override
    public String toString() {
        return "Staff[" +
                "staff id= " + staff_id + " | " +
                "Fecha de nacimento= " + birth_date + " | " +
                "Nombre= " + first_name + " | " +
                "Apellido= " + last_name + " | " +
                "Genero= " + gender + " | " +
                "Fecha de inicio= " + hire_date + " | " +
                "Rol de trabajo= " + work_role +
                ']';
    }
}
