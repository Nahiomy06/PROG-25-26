package org.example;

import java.util.List;
import java.util.Scanner;

public class MenuShetler {
    public static void main(String[] args) {


        String menu = """
                            
                            
                            --Refujio de animales--
                1. Ver animales en adopcion--
                2. Registro de topos los animales--
                
                """;


        Scanner sc = new Scanner(System.in);
        String option = "";

        do{

            System.out.println(menu);
            option = sc.nextLine();


            switch (option) {
                case "1":
                    try {
                        System.out.println("            --- Animales en adopcion ---");
                        SQLAcces.AnimalsForAdotion();

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "2":
                    try {
                        System.out.println("            --- Animales ---");
                        List<Animals> animals = SQLAcces.getAnimales();

                        for (Animals animal : animals) {
                            System.out.println(animal);

                        }
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    do {
                        System.out.println("""
                                1. Lista mas detallada--
                                0. Salir--
                                """);
                        option = sc.nextLine();
                        switch (option) {
                            case "1":
                                try {

                                    SQLAcces.DetailAnimals();

                                } catch (Exception e) {
                                    System.err.println("Error: " + e.getMessage());
                                }
                                break;
                            case "2":
                                break;
                        }
                        break;

                    }while (!option.equals("0"));





            }

        }while (!option.equals("9"));



















    }

    public static void SubmenuDettales(Scanner sc) {


        String option = "";

        do {
            System.out.println("""
                                1. Lista mas detallada--
                                0. Salir--
                                """);
            option = sc.nextLine();

        }while (!option.equals("4"));




        return;

    }

}