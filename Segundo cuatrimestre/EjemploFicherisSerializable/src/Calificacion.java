import java.io.Serializable;

public class Calificacion implements Serializable {

    private static final long serialVersionUID = 6181839580634789133L;

    private String Asignatura;
    private int Notas;


    public Calificacion(String Asignatura, int Notas) {
        this.Asignatura = Asignatura;
        this.Notas = Notas;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public int getNotas() {
        return Notas;
    }

    public void setNotas(int notas) {
        Notas = notas;
    }


    @Override
    public String toString() {
        return "{"
                + Asignatura  +
                "Notas:" + Notas +
                '}' + '\n' ;
    }
}
