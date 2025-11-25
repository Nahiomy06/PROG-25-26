//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String option = "c";



        do{
            System.out.println("Elija Piedra, Papel o Tijeras para jugar, o salir para cerrar el juego.");
            System.out.println("P.Piedra");
            System.out.println("L.Papel");
            System.out.println("T. Tijeras");
            System.out.println("S. Salir");
            option = sc.nextLine().toUpperCase();
            int Pc = (int) Math.floor(Math.random() * 3);



            switch (option){






            }





        }




















    }
}