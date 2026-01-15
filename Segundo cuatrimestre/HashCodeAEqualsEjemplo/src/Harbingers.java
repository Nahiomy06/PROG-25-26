import java.util.Objects;

public class Harbingers {

    private String Id;
    private String Title;

    public Harbingers(String id, String title){
        this.Id = id;
        this.Title = title;

    }

    @Override
    public String toString() {
        return "Harbingers{" +
                "Id='" + Id + '\'' +
                ", Title='" + Title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Harbingers that)) return false;
        return Objects.equals(Id, that.Id) && Objects.equals(Title, that.Title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Title);
    }
}
