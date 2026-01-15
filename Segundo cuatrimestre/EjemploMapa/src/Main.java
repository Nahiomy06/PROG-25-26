import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Map<String, String> alumnos = new HashMap<>(); 


        alumnos.put("0x","Pierro");
        alumnos.put("1x","Capitano");
        alumnos.put("2x","Doctore");
        alumnos.put("3x","Columbina");
        alumnos.put("4x","Arleccino");
        alumnos.put("5x","Punciella");
        alumnos.put("6x","Scaramouch");
        alumnos.put("7x","Sandrone");
        alumnos.put("8x","La Signora");
        alumnos.put("9x","Pantalone");
        alumnos.put("11x","Tartaglia");


//        Nos devuelve un boolean para decirnos si esta o no la clave
//        alumnos.containsKey("720000x");
//
//        Nos devuelve el valor de esa clave
//        String alumno = alumnos.get("720000x");
//        System.out.println(alumno);
//
//        Elimina la dupla del clave-valor
//        alumnos.remove("720000x");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdusca el alumno: ");
        String alumno2 = sc.nextLine();
        System.out.println("Introdusca el DNI: ");
        String dni2 =  sc.nextLine();

        //Crear alumno sin sobrescribir la clave
        if (!alumnos.containsKey(dni2)){
            alumnos.put(dni2, alumno2);
        } else {
            System.out.println("El DNI ya existe");
        }
        //Crear alumno pero se puede sobrescribir
        //alumnos.put(dni2, alumno2);

        for (Map.Entry<String, String> entry : alumnos.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n Iterando solo por el conjunto de calves");
        for (String clave : alumnos.keySet()){
            System.out.println(clave + ": " + alumnos.get(clave));
        }

        System.out.println("\n Iterando por los valores");
        for (String valor : alumnos.values()){
            System.out.println("valor: " + valor);
        }


    }
}