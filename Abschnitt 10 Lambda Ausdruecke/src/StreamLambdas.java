import java.util.List;
import java.util.stream.Stream;

/**
 * StreamLambdas
 */
public class StreamLambdas {

    public static void main(String[] args) {
        List<String>namen = List.of("Anna", "Bob", "Clara","Alex");

        // Stream mit Lambda und Predicate
        namen.stream()
                .filter(name -> name.startsWith("A") )
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        // Konstruktorreferenz: String -> Person
        Stream<String> nameStream = Stream.of("Max", "Mia");
        Stream<Person> personen = nameStream.map(Person::new);
        personen.forEach(System.out::println);
    }
}
