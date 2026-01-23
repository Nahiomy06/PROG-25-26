import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Taller {

    Scanner sc = new Scanner(System.in);
    private HashMap<String, Coche> Coches;

    public Taller(HashMap<String, Coche> coches) {
        this.Coches = new HashMap<>();

    }

    public void AnadeCoche() {
        System.out.println("Introduzca la matricula del coche: ");
        String Matricula = sc.nextLine().toUpperCase();

        if (Coches.containsKey(Matricula)) {
            System.out.println("Ya existe un coche con esa matrícula.");
            return;
        }
        System.out.println("Introduzca el color del coche: ");
        String Color = sc.nextLine();

        System.out.println("Introduzca la marca del coche: ");
        String Marca = sc.nextLine();

        Coche c = new Coche(Color, Marca);
        Coches.put(Matricula, c);

    }

    public void EliminaCoche() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre a buscar: ");
        String Matricula = sc.nextLine().toUpperCase();

        if (Coches.remove(Matricula) != null) {
            System.out.println("El coche ha side eliminado");
        } else {
            System.out.println("Esa matricula no existe");
        }
    }

    public void visualizaMatriculas() {

        System.out.println("Matrículas almacenadas: \n");
        if (Coches.isEmpty()) {
            System.out.println("No ahy ningun coche, no se pueden mostrar las matriculas. \n");
        } else {
            for (String Matricula : Coches.keySet()) {
                System.out.println(Matricula + "\n");
            }
        }
    }


    public void visualizaCoches() {

        System.out.println("Coches almacenadas: \n");
        if (Coches.isEmpty()) {
            System.out.println("No ahy ningun coche. \n");
        } else {
            for (Coche c : Coches.values()) {
                System.out.println(c + "\n");
            }
        }
    }

    public void VizualizaTaller() {

        System.out.println("Almacenamiento del taller: \n");

        if (Coches.isEmpty()){
            System.out.println("No ahy ningun dato. \n");

        }else {
            for (Map.Entry<String, Coche> Vertodo : Coches.entrySet()) {

                System.out.println("\n Coche : " + Vertodo.getKey() + " " + Vertodo.getValue());


            }
        }
    }


}










