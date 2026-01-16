import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String NamePattern = "[A-Z][a-zA-Z]*";
        final String PhonePattern = "[6,7,9][0-9]{9}";
        final String EmailPattern = "[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,4}";

        String Name = MiUtils.comprobarPatronRepetidamente(NamePattern, "Inserte nombre: ");
        String Phone = MiUtils.comprobarPatronRepetidamente(PhonePattern, "Inserte Numero de telefono: ");
        String Email = MiUtils.comprobarPatronRepetidamente(EmailPattern, "Inserte email: ");




    }
}