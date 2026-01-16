import java.util.Objects;

public class Contrato implements Comparable<Contrato> {
    private String Nombre;
    private String Telefono;
    private String Email;


    public Contrato(String name, String phone, String email){
        this.Nombre = name;
        this.Telefono = phone;
        this.Email = email;
    }

    public String getName() {
        return Nombre;
    }

    public void setName(String name) {

        Nombre = name;
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
        return Objects.equals(Nombre, contrato.Nombre) && Objects.equals(Telefono, contrato.Telefono) && Objects.equals(Email, contrato.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Telefono, Email);
    }



}
