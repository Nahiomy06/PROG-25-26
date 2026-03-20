import java.time.LocalDate;

public class Trabajador extends Persona{

    private String NumeroSS;
    private String MailEmpresa;
    private int Salario;
    private Enunerado Departamento;

    public Trabajador(String nombre /*, LocalDate fechaNacimiento*/, String dni, String direccion, String numeroSS, String mailEmpresa, int salario, Enunerado departamento) {
        super(nombre/*, fechaNacimiento*/, dni, direccion);
        this.NumeroSS = numeroSS;
        this.MailEmpresa = mailEmpresa;
        this.Salario = salario;
        this.Departamento = departamento;
    }

    public String getNumeroSS() {
        return NumeroSS;
    }


    public String getMailEmpresa() {
        return MailEmpresa;
    }



    public int getSalario() {
        return Salario;
    }


    public Enunerado getDepartamento() {
        return Departamento;
    }


    @Override
    public String toString() {
        return "Trabajador[" + super.toString() +
                "NumeroSS: " + NumeroSS + '\'' +
                ", MailEmpresa: " + MailEmpresa + '\'' +
                ", Salario: " + Salario +
                ", Departamento: " + Departamento;
    }
}
