import javax.swing.text.html.Option;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Gestion {
    private static Enunerado Gestion;

    public static void main(String[] args) {


        String Menu = """ 
                            --- Empresa ---
                1- Registrar trabajador en empresa.
                2- Información general de la empresa.
                3- Trabajadores actuales.
                4- Información de un departamento.
                5- Eliminar trabajador de la empresa.
                6- Guardar informacion de la empresa.
                7- Guardar los cambios y salir.
                
                            ---------------
                """;
        String MiniMenu = """
                
                1- Registrar director
                2- Registrar GerenteDep
                3- Registrar Trabajador normal
                4- Salir
                
                """;

        Empresa empresa = new Empresa("EmpresaDaw", "A1234567890");

        Scanner sc = new Scanner(System.in);

        final String path = ".\\src\\Ficheros\\";
        String Organigram = "organigrama.dat";
        Map<String, Trabajador> trabajadores = new HashMap<String, Trabajador>();
        String option = "";
        Trabajador trabajador;

        LeerOrganigram(path, Organigram, trabajadores);


        Trabajador enasd = new Trabajador("PP", "1234567A", "MAlibu", "1234567890", "aads@dsa.com", 12331, Gestion);
        trabajadores.put("1234567A", enasd);


        do {
            LeerOrganigram(path, Organigram, trabajadores);

            Utils.imprimir(Menu);
            option = sc.nextLine();

            switch (option) {
                case "1":
                    do {

                        System.out.println(MiniMenu);
                        option = sc.nextLine();
                        switch (option) {
                            case "1":
                                Empresa.RegistarDirector();
                            case "2":
                                Empresa.RegistrarGerenteDep();
                            case "3":
                                Empresa.RegistrarTrabajador();
                            case "4":

                        }

                    } while (!option.equals("4"));

                case "2":
                case "3":
                    Empresa.NumTrabajadoresActuales();
                case "4":
                    Empresa.MostrarInfoDepartamentos();

                case "6":

                case "7":
                    EscribirOrganima(path, Organigram, trabajadores);
            }


        } while (!option.equals("7"));


    }

    private static void EscribirOrganima(String path, String Organigram, Map<String, Trabajador> trabajadores) {
        try (FileWriter fw = new FileWriter(path + Organigram);
             BufferedWriter bw = new BufferedWriter(fw)) {

            for (Trabajador p : trabajadores.values()) {
                bw.write(p.getDNI() + "/" + p.getNombre() + "/" + p.getDNI() + "/" + p.getDireccion() + "/" + p.getNumeroSS() + "/" + p.getMailEmpresa() + "/" + p.getSalario() + "/" + p.getDepartamento());
                bw.newLine();
            }
            Utils.imprimir("El fichero se a guardado correctamente");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + Organigram);
        }
    }

    private static void LeerOrganigram(String path, String Organigram, Map<String, Trabajador> trabajadores) {
        try (FileReader fr = new FileReader(path + Organigram);
             BufferedReader br = new BufferedReader(fr)) {
            String linea = "";
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("/");

                if (datos.length == 7) {
                    trabajadores.put(datos[1], new Trabajador(datos[0], datos[1], datos[2], datos[3], datos[4], Integer.valueOf(datos[5]), Enunerado.valueOf(datos[6])));

                    System.out.println("El Fichero se a abierto correctamente");
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al encontrar el archivo " + Organigram);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + Organigram);
        }
    }
}



