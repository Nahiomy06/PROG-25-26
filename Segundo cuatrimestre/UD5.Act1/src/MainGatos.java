import java.util.Scanner;

public class MainGatos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);





        try {
            Gatos G1 = new Gatos("Eyra", 5);
            Gatos G2 = new Gatos("Odin", 3);
            G1.ImprimirGato();
            G2.ImprimirGato();

            G1.setEdad(-2);

            G1.ImprimirGato();

        }catch (Exception e){
            System.out.println("Exepcion" + e.getMessage());
        }


        try {
            Gatos G1 = new Gatos("Eyra", 5);
            Gatos G2 = new Gatos("Odin", 3);
            G1.ImprimirGato();
            G2.ImprimirGato();

            G2.setNombre("Al");

            G2.ImprimirGato();

        }catch (Exception e){
            System.out.println("Exepcion" + e.getMessage());
        }



























//        System.out.println("Ingrese el nombre del gato: ");
//        String Nombre = sc.nextLine();
//
//        System.out.println("Ingrese la edad del gato: ");






    }
}
