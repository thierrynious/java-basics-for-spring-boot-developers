import java.util.Optional;

public class Person {

    private final String name;
    private final Adresse adresse = new Adresse("Bahnhofstrasse 5");

    public Person(String name) {
        this.name = name;
    }

    public Optional<Adresse> getAdresse(){
        return Optional.ofNullable(adresse);
    }
    public String toString() {
        return "Person: " +name;
    }
}
