//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        /*1 Escribe un programa que dé los “buenos días”.
        System.out.println("Buenos Dias");

        //2 Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
        int lado1 = 5;
        System.out.println("El area de un cuadrado cual su lado es 5 es: " + lado1 * lado1);

        //3 Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por
        //teclado.
        Scanner lado = new Scanner(System.in);

        System.out.println("Ponga el lado del cuadrado que quiere calcular el Area: ");


        int area = lado.nextInt();

        area = area * area ;

        System.out.println("El area de cuadrado es: " + area);


        //4 Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
        //producto y división.

        Scanner num = new Scanner(System.in);

        System.out.println("introduce dos numeros X y Y");

        System.out.println("X: ");

        int num1 = num.nextInt();

        System.out.println("Y: ");

        int num2 = num.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma de ambos da de resultado: " + suma);


        int resta = num1 - num2;
        System.out.println("La resta de ambos da de resultado: " + resta);


        int mult = num1 * num2;
        System.out.println("La multiplicacion de ambos da de resultado: " + mult);


        int div = num1 / num2;
        System.out.println("La suma de division da de resultado: " + div);



        //8 Escribe un programa que lee dos números y los visualiza en orden ascendente.

        Scanner numb = new Scanner(System.in);

        System.out.println("introducir dos numeros: ");

        System.out.println("a: ");
        int a = numb.nextInt();

        System.out.println("b: ");
        int b = numb.nextInt();

        if (a < b)
            System.out.println("los numeros en asendente son: " + a + " y " + b);
        else
            System.out.println("los numeros en asendente son: " + b + " y " + a);


        //9 Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.

        Scanner equal = new Scanner(System.in);

        System.out.println("introducir dos numeros: ");

        System.out.println("a: ");
        int A = equal.nextInt();

        System.out.println("b: ");
        int B = equal.nextInt();

        if (A < B)
            System.out.println("El numero mayor es " + B);
            else
                if (A > B)
                    System.out.println("El numero mayor es: " + A);
                else
                    System.out.println("los numeros " + A + " y " + B + " son iguales");



        // 10 Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.

        Scanner Tres = new Scanner(System.in);

        System.out.println("introducir tres numeros: ");

        System.out.println("a: ");
        int Numb1 = Tres.nextInt();

        System.out.println("b: ");
        int Numb2 = Tres.nextInt();

        System.out.println("b: ");
        int Numb3 = Tres.nextInt();

        int Mayor1 = Math.max(Numb1, Numb2);

        int MaryorF = Math.max(Mayor1, Numb3);


        System.out.println("El numero mayor es: " +  MaryorF);


        */


        // 13 . Escribe un programa que lee un número y me dice si es positivo o negativo
        //consideraremos el cero como positivo.


        Scanner PosNeg = new Scanner(System.in);

        System.out.println("introducir un numero: ");
        int Numb = PosNeg.nextInt();

        if (Numb >= 0)
            System.out.println("El numero es positivo.");
        else
            System.out.println("El numero es Negativo.");










    }
    }
