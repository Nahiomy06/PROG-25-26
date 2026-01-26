import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    //4
    public static void ImprimePositivo (int p) throws Exception{
        if (p < 0){
            throw new Exception("El numero es negativo, no se puede imprimir como positivo");
        }
        System.out.println("Positivo: " + p);
    }
    public static void ImprimeNegativo (int n) throws Exception{
        if (n >= 0){
            throw new Exception("El numero es positivo, no se puede imprimir como negativo");
        }
        System.out.println("Negativo: " + n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        //4
        while (true){
            try {
                System.out.println("Intoduzca un numero entero: ");
                int Num = sc.nextInt();

                ImprimePositivo(Num);
                ImprimeNegativo(Num);

            } catch (InputMismatchException e){
                System.out.println("El numero ungresado es invalido");
            } catch (Exception e){
                System.out.println("Exepcion capturada: " + e.getMessage());
                sc.next();
            }

        }












    }




    }
