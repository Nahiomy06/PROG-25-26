import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GestionVideoDaw {
    public static void main(String[] args) {

        String menu = """
                                 --VideoDaw--
                
                1. Crear y registrar VideoClub en la franquicia.
                2. Registrar película en videoclub.
                3. Crear y registrar cliente en videoclub.
                4. Alquilar.
                5. Devolver.
                6. Dar de baja cliente.
                7. Dar de baja articulo.
                8. Salir.
                """;


        String Opcion = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(menu);
            System.out.print("Eliga una opción: ");
            Opcion = sc.nextLine();
            switch (Opcion) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    System.out.println("Cerrando VideoDaw...");
                    break;
            }


        }while (!Opcion.equals("8"));












    }
}