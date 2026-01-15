import java.util.Objects;
import java.util.regex.Pattern;

public class Contrato implements Comparable<Contrato> {
    private String Name;
    private String Phone;
    private String Email;


    public Contrato(String name, String phone, String email){
        this.Name = name;
        this.Phone = phone;
        this.Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {

        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
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
        sb.append("Name='").append(Name).append('\'');
        sb.append(", Phone='").append(Phone).append('\'');
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
        return Objects.equals(Name, contrato.Name) && Objects.equals(Phone, contrato.Phone) && Objects.equals(Email, contrato.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Phone, Email);
    }



}
