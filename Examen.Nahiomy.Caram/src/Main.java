//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        final String DniPatron = "[0-9]{8}[A-Z]{1}";
        String Dni = Utils.comprobarPatronRepetidamente(DniPatron, "Instroduce un DNi");
        //Ninja no
        final String CodigoAldeaPatron = "[0-9]{8}[A-Z]{1}";
        String CodigoAldea = Utils.comprobarPatronRepetidamente(CodigoAldeaPatron, "Instroduce CodigoAldea");

       // 1. Crear Equipo.
//        2. Registrar Ninja en el equipo.
//        3. Mostrar el número de ninjas totales en la Aldea.
//        4. Mostrar información de un equipo.
//        5. Mostrar información de todos los equipos.
//        6. Mostrar información de toda la Aldea.
//        7. Calcular estadísticas de toda la Aldea.
//        8. Cambiar ninja de un equipo.
//        9. Eliminar ninja de la aldea.
//        10. Salir de la aplicación.

        Scanner sc = new Scanner(System.in);

        String Menu = "a. Crear Equipo.\n" +
                "b. Registrar Ninja en el equipo.\n" +
                "c. Mostrar el número de ninjas totales en la Aldea.\n" +
                "d. Mostrar información de un equipo.\n" +
                "e. Mostrar información de todos los equipos.\n" +
                "f. Mostrar información de toda la Aldea.\n" +
                "g. Calcular estadísticas de toda la Aldea.\n" +
                "h. Cambiar ninja de un equipo.\n" +
                "i. Eliminar ninja de la aldea.\n" +
                "j. Salir de la aplicación.";


        String Option = "j";

            System.out.println();


        do {
            System.out.println(Menu);
            sc.nextLine().toLowerCase();
            switch (Option){
                case "a" :
                    System.out.println("Cree su equipo");

                    break;
                case "b":
                    System.out.println("Registre a un Ninja");

                    break;
                case "c":
                    System.out.println("El numero total de Ninjas en la Aldea es de: ");

                    break;
                case "d":
                    System.out.println("La informacion del equipo");

                    break;
                case "e":
                    System.out.println("La informacion de todos los equipo");

                    break;
                case "f":
                    System.out.println("La informacion de la Aldea");

                    break;
                case "g":
                    System.out.println("Las estadisticas de la Aldea");

                    break;
                case "h":
                    System.out.println("A cual ninja deseea cambiar de equipo");

                    break;
                case "i":
                    System.out.println("A cual ninja deseea eliminar");

                    break;
                case "j":
                    System.out.println("Cerrando la aplicacion.");
                    break;

                default:
                    System.out.println("Eliga una opcion real");
            }

        }while (!Option.equalsIgnoreCase("j"));


    }
}