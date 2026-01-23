import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1


        try {

            System.out.println("Ingrece un numero entero:");
            int A = sc.nextInt();

            System.out.println("Valor intoducido: " + A);
        }catch (InputMismatchException e){
            System.out.println("El valor introducido es invalido.");

        }

        //2

        try {
            System.out.println("Ingrece un numero entero:");
            int A = sc.nextInt();
            System.out.println("Ingrece otro numero entero:");
            int B = sc.nextInt();

            float divicion = A / B;
            System.out.println("La division de los valores intoducidos: " + divicion);

        }catch (InputMismatchException e){
            System.out.println("El valor introducido es invalido.");

        } catch (ArithmeticException e){
            System.out.println("Los valores introducidos no se pueden dividir en ese orden o en general");

        }



    }
}