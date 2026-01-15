import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        final String NamePattern = "[A-Z][a-zA-Z]*";

        boolean Name = MiUtils.comprobarPatron(NamePattern, "Inserte nombre");
        Scanner sc = new Scanner();
        System.out.println(Name);
    }
}