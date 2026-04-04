import java.util.Optional;

public class Adresse {

    private final String straße;

    public Adresse(String straße) {
        this.straße = straße;
    }

    public Optional<String>getStraße(){
        return Optional.of(straße);
    }
}
