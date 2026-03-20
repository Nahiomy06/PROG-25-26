import Exepciones.SalarioInvalidoExeption;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Empresa implements Serializable {


    private static final long serialVersionUID = -4243416660150909408L;

    private String Nombre;
    private String Cif;
//    private LocalDate FechaFundacion;
    public static Map<String, Trabajador> trabajadores = new HashMap<String, Trabajador>();

    public Empresa(String nombre, String cif/*, LocalDate fechaFundacion */) {
        Nombre = nombre;
        Cif = cif;
//        FechaFundacion = fechaFundacion;
    }


    public String getNombre() {
        return Nombre;
    }

    public String getCif() {
        return Cif;
    }

//    public LocalDate getFechaFundacion() {
//        return FechaFundacion;
//    }

    public Map<String, Trabajador> getTrabajadores() {
        return trabajadores;
    }


    @Override
    public String toString() {
        return "Empresa [" +
                "Nombre: " + Nombre + '\'' +
                ", Cif: " + Cif + '\'' +
//                ", FechaFundacion: " + FechaFundacion +
                ", trabajadores: " + trabajadores +
                ']';
    }

    ;


    public static void RegistrarTrabajador() throws SalarioInvalidoExeption {


        final String dniPattern = "[0-9]{7,8}[A-Za-z]";
        final String emailPattern = "[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,4}";
        final String numSSPatter = "[0-9]{10}+";
        final String fechaPattern = "[0-9]{2}-[0-9]{2}-[0-9]{4}";


        Scanner Sc = new Scanner(System.in);


        String DNI = Utils.comprobarPatronRepetidamente(dniPattern, "Ingrese el DNI del trabajador");

        if (DNI.equalsIgnoreCase(String.valueOf(trabajadores.containsKey(DNI)))) {
            System.out.println("Este DNI ya existe y no se puede utilizar");
        } else {
            System.out.println("Siga crando el perfil del trabajador: ");
            String NumSS = Utils.comprobarPatronRepetidamente(numSSPatter, "Numero de seguridad social");
            if (trabajadores.containsValue(NumSS)) {
                System.out.println("Ya Existe un trabajador con el numero de seguridad social" + NumSS);
            } else {

                System.out.println("Siga ingresando lo datos de el trabajador");
                System.out.print("Nombre: ");
                String NombreTrabajador = Sc.nextLine();
                System.out.print("Direccion: ");
                String Direccion = Sc.nextLine();
//                String FechaNacimiento = Utils.comprobarPatronRepetidamente(fechaPattern, "Fecha de Nacimiento");
                String MailEmpresa = Utils.comprobarPatronRepetidamente(emailPattern, "mail de empresa:");
                System.out.print("Salario: ");
                int Salario = Sc.nextInt();
                if (Salario < 0) {
                    throw new SalarioInvalidoExeption("Salario negativo");
                }
                System.out.print("Departamento (Informatica, Gestion o Marketing):");
                String Departamento = Sc.nextLine();
                if (!(Departamento.equalsIgnoreCase("Informatica") || Departamento.equalsIgnoreCase("Marketing") || Departamento.equalsIgnoreCase("Direccion"))) {
                    System.out.println("Departamento incorrecto");
                    System.out.print("Departamento (Informatica, Gestion o Marketing):");
                    Departamento = Sc.nextLine();
                }

                trabajadores.put(DNI, new Trabajador(NombreTrabajador /*, LocalDate.parse(FechaNacimiento)*/, DNI, Direccion, NumSS, MailEmpresa, Salario, Enunerado.valueOf(Departamento)));

            }

        }

    }

    public static void RegistrarGerenteDep() throws SalarioInvalidoExeption {

        final String dniPattern = "[0-9]{7,8}[A-Za-z]";
        final String emailPattern = "[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,4}";
        final String numSSPatter = "[0-9]{10}+";
        final String fechaPattern = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
        Scanner Sc = new Scanner(System.in);

        String DNI = Utils.comprobarPatronRepetidamente(dniPattern, "Ingrese el DNI del trabajador");


        if (DNI.equalsIgnoreCase(String.valueOf(trabajadores.containsKey(DNI)))) {
            System.out.println("Este DNI ya existe y no se puede utilizar");
        } else {
            System.out.println("Siga crando el perfil del trabajador: ");
            String NumSS = Utils.comprobarPatronRepetidamente(numSSPatter, "Numero de seguridad social");
            if (trabajadores.containsValue(NumSS)) {
                System.out.println("Ya Existe un trabajador con el numero de seguridad social" + NumSS);
            } else {

                System.out.println("Siga ingresando lo datos de el trabajador");
                System.out.print("Nombre: ");
                String NombreTrabajador = Sc.nextLine();
                System.out.print("Direccion: ");
                String Direccion = Sc.nextLine();
//                String FechaNacimiento = Utils.comprobarPatronRepetidamente(fechaPattern, "Fecha de Nacimiento");
                String MailEmpresa = Utils.comprobarPatronRepetidamente(emailPattern, "mail de empresa:");
                System.out.print("Salario: ");
                int Salario = Sc.nextInt();
                if (Salario < 0) {
                    throw new SalarioInvalidoExeption("Salario negativo");
                }
                System.out.print("Departamento (Informatica, Gestion o Marketing):");
                String Departamento = Sc.nextLine();
                if (!(Departamento.equalsIgnoreCase("Informatica") || Departamento.equalsIgnoreCase("Marketing") || Departamento.equalsIgnoreCase("Direccion"))) {
                    System.out.println("Departamento incorrecto");
                    System.out.print("Departamento (Informatica, Gestion o Marketing):");
                    Departamento = Sc.nextLine();
                }
                int NumAct = trabajadores.size();



            trabajadores.put(DNI, new GerenteDep(NombreTrabajador, DNI, Direccion, NumSS, MailEmpresa, Salario, Enunerado.valueOf(Departamento), NumAct, Enunerado.valueOf(Departamento)));

            }




        }

    }
    public static void RegistarDirector() throws SalarioInvalidoExeption{
        final String dniPattern = "[0-9]{7,8}[A-Za-z]";
        final String emailPattern = "[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,4}";
        final String numSSPatter = "[0-9]{10}+";
        final String fechaPattern = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
        final String telefonoPattern = "[0-9]{9}";

        Scanner Sc = new Scanner(System.in);

        String DNI = Utils.comprobarPatronRepetidamente(dniPattern, "Ingrese el DNI del trabajador");


        if (DNI.equalsIgnoreCase(String.valueOf(trabajadores.containsKey(DNI)))) {
            System.out.println("Este DNI ya existe y no se puede utilizar");
        } else {
            System.out.println("Siga crando el perfil del trabajador: ");
            String NumSS = Utils.comprobarPatronRepetidamente(numSSPatter, "Numero de seguridad social");
            if (trabajadores.containsValue(NumSS)) {
                System.out.println("Ya Existe un trabajador con el numero de seguridad social" + NumSS);
            } else {

                System.out.println("Siga ingresando lo datos de el trabajador");
                System.out.print("Nombre: ");
                String NombreTrabajador = Sc.nextLine();
                System.out.print("Direccion: ");
                String Direccion = Sc.nextLine();
//                String FechaNacimiento = Utils.comprobarPatronRepetidamente(fechaPattern, "Fecha de Nacimiento");
                String MailEmpresa = Utils.comprobarPatronRepetidamente(emailPattern, "mail de empresa:");
                System.out.print("Salario: ");
                int Salario = Sc.nextInt();
                if (Salario < 0) {
                    throw new SalarioInvalidoExeption("Salario negativo");
                }
                System.out.print("Departamento (Informatica, Gestion o Marketing):");
                String Departamento = Sc.nextLine();
                if (!(Departamento.equalsIgnoreCase("Informatica") || Departamento.equalsIgnoreCase("Marketing") || Departamento.equalsIgnoreCase("Direccion"))) {
                    System.out.println("Departamento incorrecto");
                    System.out.print("Departamento (Informatica, Gestion o Marketing):");
                    Departamento = Sc.nextLine();
                }
                String telefonoEmpresa = Utils.comprobarPatronRepetidamente(telefonoPattern, "Introduce el telefono del titular");
                System.out.print("Coche de la empresa: ");
                String Coche = Sc.nextLine();

                trabajadores.put(DNI, new Director(NombreTrabajador, DNI, Direccion, NumSS, MailEmpresa, Salario, Enunerado.valueOf(Departamento), telefonoEmpresa, Coche));



            }
        }
    }

    public static void MostrarInfoEmpresa(){
        System.out.println();
    }


    public static void NumTrabajadoresActuales(){

        int NumEmp = trabajadores.size();

        System.out.println("El numero de trabajadores actuales es de " + NumEmp);
    }

    public static void MostrarInfoDepartamentos(){

        for (Enunerado enunerado: Enunerado.values()){
             Utils.imprimir(trabajadores.toString() + " - " + enunerado);
        }

    }









}
















