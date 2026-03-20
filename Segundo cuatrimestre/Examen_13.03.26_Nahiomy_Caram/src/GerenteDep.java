import java.time.LocalDate;
import java.util.List;

public class GerenteDep extends Trabajador{

        private int TrabajadoresEnDep;
        private Enunerado Gerencia;
        private List<GerenteDep> Trabajadores;

    public GerenteDep(String nombre/*, LocalDate fechaNacimiento*/, String dni, String direccion, String numeroSS, String mailEmpresa,
                      int salario, Enunerado departamento, int trabajadoresEnDep, Enunerado gerencia) {
        super(nombre/*, fechaNacimiento */, dni, direccion, numeroSS, mailEmpresa, salario, departamento);

        TrabajadoresEnDep = trabajadoresEnDep;
        Gerencia = gerencia;
    }


    public int getTrabajadoresEnDep() {
        return TrabajadoresEnDep;
    }

    public Enunerado getGerencia() {
        return Gerencia;
    }

    public List<GerenteDep> getTrabajadores() {
        return Trabajadores;
    }


    @Override
    public String toString() {
        return "GerenteDep[" + super.toString() +
                "TrabajadoresEnDep: " + TrabajadoresEnDep +
                ", Gerencia: " + Gerencia +
                ", Trabajadores: " + Trabajadores + "]";
    }

}
