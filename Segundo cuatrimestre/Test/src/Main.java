//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        ArrayList<Triangulo> trians = new ArrayList<Triangulo>();
        trians.add(new Triangulo(1, 2, 3));
        trians.add(new Triangulo(1, 1, 2));
        trians.add(new Triangulo(1, 1, 1));
        Iterator<Triangulo> itera = trians.iterator();
        Triangulo cadaTriangulo;
        while (itera.hasNext()) {
            cadaTriangulo = itera.next();
            System.out.println(cadaTriangulo.toString());
        }
    }
}
