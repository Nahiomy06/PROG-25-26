import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainGatos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gatos> gatos = new ArrayList<>();

        int i = 0;

        while (i < 5){
            try {
                System.out.println("Intoduzca el nombre del Gato " + (i + 1) + ": ");
                String Nombre = sc.nextLine();

                System.out.println("Y la edad del gato: ");
                int Edad = sc.nextInt();

                Gatos g = new Gatos(Nombre, Edad);
                gatos.add(g);
                i++;

            } catch (InputMismatchException en) {
                    System.out.println("Debes introducir un número entero válido.");

            }catch (IllegalArgumentException e){
                System.out.println("Exepcion" + e.getMessage());

            } catch (Exception ex){
                System.out.println("Exepcion: " + ex.getMessage());
                sc.next();
            }
        }

        System.out.println("Todos los gatos");
        for (Gatos g : gatos){
            g.ImprimirGato();
        }



    }
}
