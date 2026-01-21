import java.util.Objects;

public class Contrato implements Comparable<Contrato> {
    private String Nombre;
    private String Telefono;
    private String Email;


    public Contrato(String nombre, String telefono, String email){
        this.Nombre = nombre;
        this.Telefono = telefono;
        this.Email = email;
    }

    public String getName() {
        Nombre.matches("[A-Z][a-zA-Z]*");
        return  Nombre;
    }

    public String setName(String Nombre) {
        return Nombre;
    }

    public String getPhone() {
        return Telefono;
    }

    public void setPhone(String phone) {
        Telefono = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    public boolean ValidarNombre(String nombre){
        if (Nombre.matches("[A-Z][a-zA-Z]*")) {
            return true;
        } else return false;
    }
    public boolean ValidarTelefono(){
        if (Telefono.matches("[6,7,9][0-9]{8}")) {
            return true;
        } else return false;    }
    public boolean ValidarEmail(){
        if (Email.matches("[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,4}")) {
            return true;
        } else return false;    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contrato{");
        sb.append("Nombre='").append(Nombre).append('\'');
        sb.append(", Telefono='").append(Telefono).append('\'');
        sb.append(", Email='").append(Email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Contrato o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contrato contrato)) return false;
        return Objects.equals(Nombre, contrato.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Telefono, Email);
    }



}
