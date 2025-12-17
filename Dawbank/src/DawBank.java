
import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner sc;

        final String IbanPatron = "[A-Z]{2}[0-9]{22}";
        final String TitularPatron = "[a-z A-Z]{3,}";


        String Titular = MiUtils.comprobarPatronRepetidamente(TitularPatron, "Introduce un titular");
        String IBAN = MiUtils.comprobarPatronRepetidamente(IbanPatron, "Instroduce un IBAN");


        CuentaBancaria miCuenta = new CuentaBancaria(IBAN, Titular);


        System.out.println(miCuenta.InfoCuentaBancaria);

    }
}








//        do {
//
//            sc = new Scanner(System.in);
//
//            ImprimirMenuOpc;
//            opcion = sc.nextLine();
//
//            switch (opcion){
//                case "1":
//                    System.out.println(miCuenta.InfoCuentaBancaria());
//                    break;
//                case "2":
//                    System.out.println("El IBAN es: " + miCuenta);
//
//            }
//
//
//
//
//
//
//
//        }
//
//        private static void ImprimirMenuOpc() {
//            System.out.println("Elige la opcion que desees");
//            System.out.println("1. Datos de la cuenta");
//            System.out.println("2. IBAN");
//            System.out.println("3. Titular");
//            System.out.println("4. Saldo");
//            System.out.println("5. Ingreso");
//            System.out.println("6. Retirada");
//            System.out.println("7. Movimientos");
//            System.out.println("8. Salir");
//
//        }
//
//
//
//
//
//
//    }
