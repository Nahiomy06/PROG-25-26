import java.util.LinkedList;
import java.util.Scanner;

public class Agenda {

    private LinkedList<Contrato> contratos;


    public Agenda() {
        this.contratos = new LinkedList<>();
    }

    public LinkedList<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(LinkedList<Contrato> contratos) {
        this.contratos = contratos;
    }




    //1
    public void AnadeContrato(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos del contrato. ");

        System.out.println("\n Nombre: ");
        String Nombre = sc.nextLine();
        if (Nombre.matches("[A-Z][a-zA-Z]*")) {

            if (ExistenContrato(Nombre)) {
                System.out.println("Este nombre ya esta en uso.\n");

            } else {
                System.out.println("\n Telefono: ");
                String Telefono = sc.nextLine();

                System.out.println("\n Email: ");
                String Email = sc.nextLine();

                Contrato c = new Contrato(Nombre, Telefono, Email);
                contratos.add(c);
                System.out.println("Contrato añadido corectamente.\n");
            }
        } else {
            System.out.println("El nombre no esta en formato correcto, deve empesar con mayuscula y ser seguido solo por letras.");
        }

    }

    //2
    public void BuscarContrato(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre a buscar: ");
        String Nombre = sc.nextLine();

        for (Contrato c : contratos){
            if (c.getName().equals(Nombre)){
                System.out.println(c);
            }else {
                System.out.println("Ese contrato no existe \n");
            }
        }

    }

    //3

    public void EliminarContrato(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre a eliminar: ");
        String Nombre = sc.nextLine();

        for (Contrato c : contratos){
            if (c.getName().equals(Nombre)){
                contratos.remove(c);
                System.out.println("Contrato eliminado.");
            }
        }

    }

    public void VisualizarAgenda(){
        if (contratos.isEmpty()){
            System.out.println("La agenda esta vacia. \n");
        } else {
            for (Contrato c : contratos){
                System.out.println(c);
            }
        }
    }

    public int NumeroComntatos(){
        return contratos.size();
    }

    private boolean ExistenContrato(String Nombre){
        for (Contrato c : contratos){
            if (c.getName().equalsIgnoreCase(Nombre)){
                return true;
            }
        }
        return false;

    }


}
