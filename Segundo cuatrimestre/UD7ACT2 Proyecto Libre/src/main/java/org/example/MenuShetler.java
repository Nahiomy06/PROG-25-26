package org.example;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuShetler {
    public static void main(String[] args) {


        String menu = """
                            
                            
                            --Refujio de animales--
                1. Ver animales en adopcion--
                2. Registro de todos los animales--
                3. Registrar nuevo animal--
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
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case "2":
                    try {
                        System.out.println("            --- Animales ---");

                        SQLAcces.DetailAnimals();

                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    option = Submenu(sc);

                    break;


                case "3":
                    try {
                        System.out.println("            --- Registrar nuevos Animales ---");


                        System.out.println("Nombre: ");
                        String pet_name = sc.nextLine();

                        int specie = ElegirEspecie(sc);

                        System.out.println("Edad en años: ");
                        int edad = sc.nextInt();
                        sc.nextLine();

                        Gender genero;
                        while (true) {
                            System.out.println("Genero (M/F): ");
                            String generoS = sc.nextLine().toUpperCase().trim();
                            if (generoS.equals("M") || generoS.equals("F")) {
                                genero = Gender.valueOf(generoS);
                                break;
                            } else {
                                System.out.println("El formato del genero es invalido. ");
                            }
                        }

                        LocalDate llegada;
                        while (true) {
                            System.out.println("Fecha de llegada (AAAA-MM-DD) o precionar enter para asignar hoy como fecha de entrada: ");
                            String fechaLlegada = sc.nextLine();
                            if (fechaLlegada.isEmpty()) {
                                llegada = LocalDate.now();
                                break;
                            }
                            try {
                                llegada = LocalDate.parse(fechaLlegada);
                                break;
                            }catch (Exception e) {
                                System.err.println("El formato de la fecha es invalido.  ");
                            }
                        }

                        S








                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }


            }

        }while (!option.equals("9"));





















    }

    static List<Animals> animals = SQLAcces.getAnimales();


    public static int ElejirCuidador(){




    }



    public static int ElegirEspecie(Scanner sc) {

        List<Species> species = SQLAcces.getAnimalSpecies();

        int option;


        do {
            System.out.println("        --- Especies ---");

            for (int i = 0; i < species.size(); i++) {

                System.out.println((i + 1) + ". " + species.get(i));
            }

            System.out.println("Elige una opction");

            try {
                sc = new Scanner(System.in);
                option = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e) {
                option = -1;
            }

            if (option < 1 || option > species.size()) {
                System.out.println("Opción inválida, intenta otra vez\n");
            }
        } while (option < 1 || option > species.size());

        return species.get(option - 1).getSpecies_id();




    }




    private static String Submenu(Scanner sc) {
        String option;
        do {
            System.out.println("""
                    1. Lista mas detallada--
                    0. Salir--
                    """);
            option = sc.nextLine();
            switch (option) {
                case "1":
                    try {

                        for (Animals animal : animals) {
                            System.out.println(animal);

                        }


                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case "2":
                    break;
            }
            break;
        }while (!option.equals("0"));
        return option;
    }


}