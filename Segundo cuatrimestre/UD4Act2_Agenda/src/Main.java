import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        Scanner sc;


        Agenda agenda = new Agenda();


        sc = new Scanner(System.in);
        String opcion = "";
        String menu = "1. Añadir contacto '\n'" +
                "2. Buscar contacto '\n'" +
                "3. Eliminar contacto '\n'" +
                "4. Visualizar agenda '\n'" +
                "5. Número de contactos de mi agenda '\n'" +
                "6. Salir";

        do {
            System.out.println(menu);
            opcion = sc.nextLine();

            switch (opcion){
                case "1":
                    agenda.AnadeContrato();
                    break;

                case "2":
                    agenda.BuscarContrato();
                    break;

                case "3":
                    agenda.EliminarContrato();
                    break;

                case "4":
                    agenda.VisualizarAgenda();
                    break;

                case "5":
                    System.out.println("El numero de contratos es: "+ agenda.NumeroComntatos());
                    break;

                case "6":
                    System.out.println("El programa se cerrara. ");
            }



        } while (!opcion.equals("6"));

    }
}