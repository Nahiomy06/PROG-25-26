//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        /*
         Ejercicio 1: Crea un programa que pida una cadena de texto por teclado y
         luego muestre cada palabra de la cadena en una línea distinta.


        System.out.println("Introdusca una frase: ");
        String frase = sc.nextLine();


        String [] palabras = frase.split(" ");
        for (String palabra : palabras){
            System.out.println(palabra);


        }

        Ejercicio 2: Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.



        System.out.println("Introdusca la primer frase: ");
        String frase1 = sc.nextLine();
        System.out.println("Introdusca la seguanda frase: ");
        String frase2 = sc.nextLine();

        System.out.println("¿Son las frases iguales?: " + frase1.equals(frase2));
        System.out.println("¿Son las frases iguales ignorando mayusculas?: " + frase1.equalsIgnoreCase(frase2));





        3.Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        “Tarazón” y “Alcocer” mostrará “LIOTARALC”.





        System.out.println("Introdusca su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introdusca su primer apellido: ");
        String apellido1 = sc.nextLine();
        System.out.println("Introdusca su segundo apellido: ");
        String apellido2 = sc.nextLine();



        String Cnombre = nombre.substring(0, 3).toUpperCase();
        String Capellido1 = apellido1.substring(0, 3).toUpperCase();
        String Capellido2 = apellido2.substring(0, 3).toUpperCase();
        String Codigo = Cnombre + Capellido1 + Capellido2;


        System.out.println("Su codigo de usuario es: : " + Codigo );


        4.Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
        Nº de A's: 3
        Nº de E's: 1
        Nº de I's: 2
        Nº de O's: 0
        Nº de U's: 0



        System.out.println("Introdusca la primer frase: ");
        String fraseV = sc.nextLine();

        int a=0, e=0, ies=0, o=0, u=0;

        for (int i = 0; i < fraseV.length(); i++) {

            switch (fraseV.toLowerCase().charAt(i)){

                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> ies++;
                case 'o' -> o++;
                case 'u' -> u++;


            }

        }

        System.out.println("El numero de A es: " + a);
        System.out.println("El numero de E es: " + e);
        System.out.println("El numero de I ies: " + ies);
        System.out.println("El numero de O oes: " + o);
        System.out.println("El numero de U ues: " + u);






        5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        derecha a izquierda.

        */



        System.out.println("Introdusca una frase: ");
        String fraseOri = sc.nextLine();


        String fraseProse = fraseOri.replaceAll(" ", "").toLowerCase();

        if (esPalindromo(fraseProse)){
            System.out.println("la frase ingresada es un palindromo");
        } else{
            System.out.println("la frase ingresada NO es un palindromo");
        }



    }

    private static boolean esPalindromo(String texto) {

        boolean palindromo = false;

        int izquierda = 0;

        int derecha = texto.length() - 1;

        while (izquierda < derecha) {

            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return palindromo;
            }
            izquierda++;
            derecha--;
        }

        palindromo = true;
        return palindromo;
    }
}