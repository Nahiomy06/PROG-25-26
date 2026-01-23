//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        String [] Nombres = new String[3];

        String n = "2";
        int Num = 0;

        try {
            Num = Integer.parseInt(n);
            String Nombre = Nombres[Num];

        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());

        }

        try {
            for (int i = 0; i < Nombres.length; i++) {
                System.out.println(Nombres[i].length());

            }
        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        } finally {
            System.out.println("El progrma Cantinua hasta el algoritmo");
        }


        System.out.println("Se ha finalizadp el programa");


    }
}