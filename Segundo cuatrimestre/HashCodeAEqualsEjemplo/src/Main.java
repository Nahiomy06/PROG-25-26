import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<String> harbingers = new HashSet<>();

        harbingers.add("Tartaglia");
        harbingers.add("Scaramouch");
        harbingers.add("Signora");
        harbingers.add("Arlecchino");
        harbingers.add("Pierro");
        harbingers.add("Pulcinella");
        harbingers.add("Dottore");
        harbingers.add("Capitano");
        harbingers.add("Sandrone");
        harbingers.add("Columbina");
        harbingers.add("Pantalone");


        for (String harbinger : harbingers){
            System.out.println(harbinger);
        }

        //Conjunto de harbingers



        Set<Harbingers> harbinge = new HashSet<>();

        Harbingers tartaglia = new Harbingers("11", "Tartaglia");
        Harbingers Scaramouch = new Harbingers("8", "Scaramouch");


        harbinge.add(tartaglia);
        harbinge.add(Scaramouch);

        System.out.println(harbinge);



    }
}