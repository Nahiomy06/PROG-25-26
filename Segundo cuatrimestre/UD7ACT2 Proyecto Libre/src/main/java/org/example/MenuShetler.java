package org.example;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MenuShetler {
    public static void main(String[] args) {


        String menu = """            
                            --Refujio de animales--
                1. Ver animales en adopcion--
                2. Registro de todos los animales--
                3. Eliminar animal de registrtos--
                4. Registrar nuevo animal--
                5. Adoptar un animal--
                6. Contratar empleado--
                7. Registrar posibles personas para adopciones--
                8. Buscar Animales--
                
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
                    seeAnimals();
                    option = Submenu(sc);

                    break;
                case "3":
                    System.out.println("Elija que animal desea eliminar--");
                    int animal_id = ElejirAnimal(sc);
                    SQLAcces.deleteAnimals(animal_id);

                    break;
                case "4":
                    InsertarAnimals(sc);

                    break;
                case "5":


                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "8":
                    option = subMenuBusqueda(sc);

                    break;




            }

        }while (!option.equals("9"));






    }

    private static void seeAnimals() {
        try {
            System.out.println("            --- Animales ---");

            SQLAcces.DetailAnimals();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void InsertarAnimals(Scanner sc) {
        try {
            System.out.println("            --- Registrar nuevos Animales ---");

            System.out.println("Nombre: ");
            String pet_name = sc.nextLine();

            int specie = ElegirEspecie(sc);

            System.out.println("Edad en años: ");
            int age = sc.nextInt();
            sc.nextLine();

            Gender gender;
            while (true) {
                System.out.println("Genero (M/F): ");
                String generoS = sc.nextLine().toUpperCase().trim();
                if (generoS.equals("M") || generoS.equals("F")) {
                    gender = Gender.valueOf(generoS);
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

            int caretakerID = ElejirCuidador(sc);

            boolean adopted = false;

            SQLAcces.InsertAnimals(new Animals(pet_name, specie, age, gender, llegada, caretakerID, adopted));



        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
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



    public static String subMenuBusqueda(Scanner sc){

        String option;

        String subMenu = """
                            --- Buscar por ... ---
                
                1. Id.
                2. Nombre.
                3. Edad.
                4. Estadia.
                5. Genero.
                6. Especie.

                0. Volver al menu principal--
                """;

        do {
            System.out.println(subMenu);
            option = sc.nextLine();
            switch (option) {
                case "1":
                    try {
                        System.out.println("Ingrese el id del animal que desea buscar: ");
                        int ID = sc.nextInt();
                        System.out.println(AQLAccessSearchs.getAnimalsById(ID));

                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        System.out.println("Ingrese el nombre del animal que desea buscar: ");
                        String nombre = sc.nextLine();
                        System.out.println(AQLAccessSearchs.getAnimalsByName(nombre));

                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;

                case "3":
                    try {
                        System.out.println("Ingrese el id del animal que desea buscar: ");
                        int age = sc.nextInt();
                        System.out.println(AQLAccessSearchs.getAnimalsByAge(age));

                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;

                case "4":
                    try {
                        System.out.println("Ingrese el tiempo (contamos en meses) que ha pasado el animal que desea buscar: ");
                        int month = sc.nextInt();
                        List<Animals> animals = AQLAccessSearchs.getAnimalsByTimeDate(month);
                        for (Animals a : animals) {
                            System.out.println(a);
                        }

                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }

                    break;
                case "5":

                    try {
                        System.out.println("Ingrese el genero (M|F) el animal que desea buscar: ");
                        Gender gender = Gender.valueOf(sc.nextLine().toUpperCase());
                        List<Animals> animals = AQLAccessSearchs.getAnimalsByGender(gender);
                        for (Animals a : animals) {
                            System.out.println(a);
                        }

                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }

                    break;

                case "6":
                    try {
                        System.out.println("Ingrese la especie del animal que desea buscar: ");
                        int id_specie = ElegirEspecie(sc);
                        List<Animals> animals = AQLAccessSearchs.getAnimalsBySpecies(id_specie);
                        for (Animals a : animals) {
                            System.out.println(a);
                        }

                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;

                case "0":
                    break;

            }

        } while (!option.equals("0"));

        return option;

    }








    static List<Animals> animals = SQLAcces.getAnimales();


    public static int ElejirCuidador(Scanner sc){

        List<Staff> caretakers = SQLAcces.getCaretakersName();

        int option;

        do {
            System.out.println("        --- Cuidadores ---");

            for (int i = 0; i < caretakers.size(); i++){
                System.out.println((i + 1) + ". " + caretakers.get(i));
            }

            System.out.println("Elige una opction");

            try {
                sc = new Scanner(System.in);
                option = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e) {
                option = -1;
            }

            if (option < 1 || option > caretakers.size()) {
                System.out.println("Opción inválida, intenta otra vez\n");
            }


        }   while (option < 1 || option > caretakers.size());

        return  caretakers.get(option - 1).getStaff_id();
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

    public static int ElejirAnimal(Scanner sc) {
        List<Animals> animals = SQLAcces.getAnimales();

        int option;


        do {
            System.out.println("        --- Animales ---");

            for (int i = 0; i < animals.size(); i++) {

                System.out.println((i + 1) + ". " + animals.get(i));
            }

            System.out.println("Elige una opction");

            try {
                sc = new Scanner(System.in);
                option = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e) {
                option = -1;
            }

            if (option < 1 || option > animals.size()) {
                System.out.println("Opción inválida, intenta otra vez\n");
            }
        } while (option < 1 || option > animals.size());

        return animals.get(option - 1).getSpecies_id();
    }







}