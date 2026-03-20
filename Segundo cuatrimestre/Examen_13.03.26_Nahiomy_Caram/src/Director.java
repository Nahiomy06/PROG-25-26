import java.time.LocalDate;

public class Director extends Trabajador{

    private String NumeroTelefono;
    private String CocheEmpresa;

    public Director(String nombre /*, LocalDate fechaNacimiento*/, String dni, String direccion, String numeroSS,
                    String mailEmpresa, int salario, Enunerado departamento, String numeroTelefono, String cocheEmpresa) {
        super(nombre/*, fechaNacimiento*/ ,dni, direccion, numeroSS, mailEmpresa, salario, departamento);

        NumeroTelefono = numeroTelefono;
        CocheEmpresa = cocheEmpresa;
    }


    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public String getCocheEmpresa() {
        return CocheEmpresa;
    }

    @Override
    public String toString() {
        return "Director[ " + super.toString() +
                "NumeroTelefono: '" + NumeroTelefono + '\'' +
                ", CocheEmpresa: " + CocheEmpresa + '\'' +
                "]";
    }
}
