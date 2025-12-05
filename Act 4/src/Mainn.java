//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;



public class Mainn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*

        String[] alumnos = new String[3];
        for (int i = 0; i < alumnos.length; i++) {

            System.out.println("Escriba el nomre de alumno " + i + ": ");
            alumnos[i] = sc.nextLine();
        }

        System.out.println("El nombre del alumno es: " + alumnos[(int)(Math.random() * 2)]);


        double[] notas = new double[18];
        double suma = 0.0;

        for (int i =0; i < notas.length; i++) {

            notas [i] = Math.min(10.0, (Math.random() * 10.0) + 0.5);
            System.out.println("La nota de la posicion " + i + " es: " + notas[i]);

            suma += notas[i];
        }

        double media = suma / notas.length;
        System.out.println(" La nota media es: "+ media);


        int [] [] precios = new int[3][3];
        for (int i = 0; i < precios.length; i++) {
            for (int j = 0; j < precios[i].length; j++){
                precios[i][j] = (int) (Math.random() * 100.0);
            }
        }


        for (int i = 0; i < precios.length; i++) {
            for(int j = 0; j < precios[i].length; j++) {

                System.out.print(precios[i][j] + " ");
            }
        }

        */




        /*
        Ej 1: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego muestre todos sus valores.



        double[] NumReals = new double[10];
        for (int i = 0; i < NumReals.length; i ++) {

            System.out.println("introduce el numero real " + (i + 1) + ": ");
            NumReals[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(NumReals));




        Ej 2: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego muestre la suma de todos los valores.



        double[] NumReals2 = new double[10];
        double suma = 0.0;

        for (int i = 0; i < NumReals2.length; i++ ) {

            System.out.println("introduce el numero real " + (i + 1) + ": ");
            NumReals2[i] = sc.nextDouble();
            suma += NumReals2[i];

        }

        System.out.println(" la suama de los numberos es: " + suma);


        Ej 3: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.



        double[] NumReals3 = new double[10];

        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;

        for (int i = 0; i < NumReals3.length; i++ ) {

            System.out.println("introduce el numero real " + (i + 1) + ": ");
            NumReals3[i] = sc.nextDouble();
        }
        for (int i = 0; i < NumReals3.length; i++) {
            max = Math.max(NumReals3[i], max);
            min = Math.min(NumReals3[i], min);
        }

        System.out.println("El numero Maximo es: " + max);
        System.out.println("El numero Minimo es: " + min);



        Ej 4: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego  muestre por separado la suma de todos los valores positivos y negativos.




        double[] NumReals4 = new double[10];
        double sumaP = 0.0, sumaN = 0.0;


        for (int i = 0; i < NumReals4.length; i++ ) {

            System.out.println("introduce el numero real " + (i + 1) + ": ");
            NumReals4[i] = sc.nextDouble();

            if (NumReals4[i] >= 0) {
                sumaP += NumReals4[i];
            }
            if (NumReals4[i] < 0) {
                sumaN += NumReals4[i];
            }

        }

        System.out.println("La suma de los nuemros positivos es de: " + sumaP);
        System.out.println("La suma de los nuemros Negativos es de: " + sumaN);



        Ej 5: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.



        double[] NumReals5 = new double[10];
        double suma = 0.0;


        for (int i = 0; i < NumReals5.length; i++ ) {
            System.out.println("introduce el numero real " + (i + 1) + ": ");
            NumReals5[i] = sc.nextDouble();
            suma += NumReals5[i];

        }

        System.out.println(" la suma de los numeros es: " + suma);
        System.out.println(" la media de los numeros es: " + (suma / NumReals5.length));





        Ej 6: Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
        escriba M en todas sus posiciones y lo muestre por pantalla.



        System.out.println("Introduce el valor N para la dimension de array: ");
        int N = sc.nextInt();

        System.out.println("Introduce el valor M: ");
        double M = sc.nextDouble();

        if (N > 0){
            double[] ArrayN = new double[N];
            Arrays.fill(ArrayN, M);
            System.out.println(Arrays.toString(ArrayN));

            for (int i = 0; i < ArrayN.length; i++){
                ArrayN[i]= M;
                System.out.println(ArrayN[i]);
            }

        }

        else {
            System.out.println(" el array no se puede hacer con valores negativoss.");
        }


        Ej 7: Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        todos los valores desde P hasta Q, y lo muestre por pantalla.



        System.out.println("introduce el valor P");
        int P = sc.nextInt();
        System.out.println("introduce el valor Q");
        int Q = sc.nextInt();

        int dimensiones = Math.abs(P - Q) -1;
        int [] Numeros7 = new int [dimensiones];

        for (int i = 0; i < Numeros7.length; i++) {
            if (P > Q) {
                Numeros7[i] = Q + (i+1);
                System.out.println(Numeros7[i]);
            }
            else {
                Numeros7[i] = P + (i + 1);
                System.out.println(Numeros7[i]);
            }
        }


        Ej 8: Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
        mostrará cuántos valores del array son igual o superiores a R.


        double [] Numeros8 = new double[100];

        for (int i = 0; i < Numeros8.length; i++ ) {
            Numeros8[1] = Math.random();
        }


        System.out.println("Introduce el valor de R (entre 0.0 y 1.0)");
        double R = sc.nextDouble();

        int ContMayore = 0; int ContMenores = 0;

        for (int i = 0; i < Numeros8.length; i++) {
            if (Numeros8[i] >= R) {
                ContMayore++;
            }
            else {
                ContMenores++;
            }
        }
        System.out.println("Los numeros mayores que R son: " + ContMayore);
        System.out.println("Los numeros menores que R son: " + ContMenores);



        Ej 9: Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros
        aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué
        posiciones del array aparece N.


        int[] Numeros9 = new int[100];


        for (int i = 0; i < Numeros9.length; i++) {
            Numeros9[i] = (int) (Math.random() * 10 +1);
        }
        System.out.println("Intruduce el valor de N ");
        int Nbuscar = sc.nextInt();

        for (int i = 0; i < Numeros9.length; i++) {
            if (Numeros9[i] == Nbuscar){
                System.out.println("Aparece en al posicion " +i);
            }

        }


        Ej 11: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
        primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
        primer array al segundo array en orden inverso, y mostrar ambos por pantalla.


        int [] Array1 = new int[100];
        int [] Array2 = new int[100];

        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = i + 1;

        }

       for (int i = 0; i < Array2.length; i++) {
           Array2[i] = Array1[(Array1.length - 1) -i];

       }

        System.out.println(Arrays.toString(Array2));





        Ej 12: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
        distintas opciones:
            a. Mostrar valores.
            b. Introducir valor.
            c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una posición P,
        luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta que el usuario
        elija la opción ‘c’ que terminará el programa.


        int [] array = new int[10];

        String  opcion = "c";
        int contadorPosition = 0;

        do {
            System.out.println("Escoja la opcion deseada: ");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor: ");
            System.out.println("c. Salir");
            opcion = sc.nextLine();


            switch (opcion) {
                case "a":
                    System.out.println(Arrays.toString(array));
                    break;
                case "b":
                    System.out.println("Introduce la posicion donde quieras insertar el valor: ");
                    contadorPosition = sc.nextInt();
                    if (contadorPosition < array.length && contadorPosition >= 0) {
                        System.out.println("Introduce el valor que quiere insertar: ");
                        array[contadorPosition] = sc.nextInt();



                    } else {
                        System.out.println("No se puede ingresar por que las posicines no coinciden");

                    }
                    break;
                case "c":
                    System.out.println("El menu se cerrara");
                    break;
                default:
                    System.out.println("Por favor escoja una opcion");


            }
        }  while(!opcion.equals("c"));


        Again
        Ej 1: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego muestre todos sus valores.



        double[] NumReal = new double[10];
        for (int i = 0; i < NumReal.length; i++) {

            System.out.println("introduce el numero real " + (i + 1) + " : ");
            NumReal[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(NumReal));.




          Ej 2: Crea un programa que pida diez números reales por teclado,
        los almacene en un array, y luego muestre la suma de todos los valores.



        double[] NumReal2 = new double[10];
        double suma = 0.0;

        for (int i = 0; i < NumReal2.length; i++) {

            System.out.println("introduce el numero real " + (i + 1) + " : ");
            NumReal2[i] = sc.nextDouble();
            suma += NumReal2[i];
        }

        System.out.println("La suma de los numereos es: " + suma);




        3. Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.



        double[] NumReal3 = new double[10];
        double Max = Double.MIN_VALUE, Min = Double.MAX_VALUE;


        for (int i = 0; i < NumReal3.length; i++) {

            System.out.println("introduce el numero real " + (i + 1) + " : ");
            NumReal3[i] = sc.nextDouble();

        }
        for (int i = 0; i < NumReal3.length; i++) {

            Max = Math.max(NumReal3[i], Max);
            Min = Math.min(NumReal3[i], Min);

        }
        System.out.println("El numero maximo es: " + Max);
        System.out.println("El numero minimo es: " + Min);


        4. Crea un programa que pida veinte números enteros por teclado, los almacene en un
        array y luego muestre por separado la suma de todos los valores positivos y negativos.


        double[] NumReal4 = new double[20];
        double SumaP = 0.0, SumaN = 0.0 ;

        for (int i = 0; i < NumReal4.length; i++) {

            System.out.println("introduce el numero real " + (i + 1) + " : ");
            NumReal4[i] = sc.nextDouble();


            if (NumReal4[i] >= 0){
                SumaP += NumReal4[i];
            }
            if (NumReal4[i] < 0);{
                SumaN += NumReal4[i];
            }

        }

        System.out.println("La suma de los numeros positivos es de: " + SumaP);
        System.out.println("La suma de los numeros negativos es de: " + SumaN);





        5. Crea un programa que pida veinte números reales por teclado, los almacene en un array
        y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.




        double[] NumReal5 = new double[20];
        double suma = 0.0;

        for (int i = 0; i < NumReal5.length; i++) {

            System.out.println("introduce el numero real " + (i + 1) + " : ");
            NumReal5[i] = sc.nextDouble();
            suma += NumReal5[i];

        }
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La media de los numeros es: " + (suma / NumReal5.length));




        6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        N, escriba M en todas sus posiciones y lo muestre por pantalla.



        System.out.println("Introduce el valor N para la dimension de array: ");
        int N = sc.nextInt();

        System.out.println("Introduce el valor M: ");
        double M = sc.nextDouble();

        if (N >= 0){
            double[] ArrayN = new double[N];
            Arrays.fill(ArrayN, M);
            System.out.println(Arrays.toString(ArrayN));

            for (int i = 0; i < ArrayN.length; i++) {
                ArrayN[i]= M;
                System.out.println(ArrayN[i]);
            }
        }
        else {
            System.out.println("El arrya no puede ser negativo");
        }

        7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        todos los valores desde P hasta Q, y lo muestre por pantalla.


*/







    }
}