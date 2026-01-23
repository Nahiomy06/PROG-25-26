import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Taller taller = new Taller(new HashMap<>());

        Scanner sc = new Scanner(System.in);
        String opcion = "";
        String menu = """
                 1. Añadir coche \
                 
                 2. Eliminar coche \
                 
                 3. Salir\
                 
                """;

        do {
            System.out.println(menu);
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    taller.AnadeCoche();
                    break;
                case  "2":
                    taller.EliminaCoche();
                    break;

                case "3":
                    taller.visualizaMatriculas();
                    taller.visualizaCoches();
                    taller.VizualizaTaller();
                    System.out.println("Cerrando programa.");
                    break;


            }

        }while (!opcion.equals("3"));

    }
}