import java.util.Optional;

/**
 * OptionalBeispiele
 */
public class OptionalBeispiele {
    public static void main(String[] args) {
        // Optional mit Wert
        Optional<String> optName = Optional.of("Anna");
        optName.ifPresent(System.out::println);

        // Optional ohne Wert
        Optional<String>leer = Optional.empty();
        System.out.println("Name: "+leer.orElse("Unbekannt"));

        //map mit Optional
        Optional<String> groß = optName.map(String::toUpperCase);
        System.out.println(groß.orElse("Fehler"));

        // flatMap-Kaskade mit Dummy Objekten
        Optional<Person> person = Optional.of(new Person("Bob"));
        String strasse = person.flatMap(Person::getAdresse)
                .flatMap(Adresse::getStraße)
                .orElse("Straße unbekannt");
        System.out.println("Strasse : "+strasse);
    }
}
