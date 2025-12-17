import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaSolar {
    public static void main(String[] args) {


        Satelite[] satelite = new Satelite[5];



        Planeta Tierra = new Planeta("Tierra", 12.2, 12.2, 12.2, 12.2, 12);


        satelite[1] = new Satelite("Luna", 12.2, 12.2, 12.2, 12.2, "Tierra");
        satelite[2] = new Satelite("Luna2", 12.2, 12.2, 12.2, 12.2, "Tierra");
        satelite[3] = new Satelite("Luna3", 12.2, 12.2, 12.2, 12.2, "Tierra");


        System.out.println(Tierra.MostrarInfo());

        for (int i = 0; i < satelite.length; i++) {
            satelite[i].MostrarInfoSatelites();
            System.out.println();
        }




    }
}