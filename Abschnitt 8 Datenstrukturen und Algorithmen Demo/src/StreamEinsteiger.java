import java.util.List;
import java.util.stream.Collectors;

public class StreamEinsteiger {
    public static void main(String[] args) {
        List<String> namen = List.of("Anna","Ben","Susi","Stefan","Tom");

        //Imperative Schleife - externe Iteration
        for (String name : namen) {
            if(name.startsWith("S")){
                System.out.println(name.toUpperCase());
            }
        }

        // Deklarativer Stil - interne Iteration mit Stream
        namen.stream()
                .filter(n->n.startsWith("S"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Stream mit collect - Ergebnis als neue Liste speichern
        List<String> ergebnis = namen.stream()
                .filter(n->n.length() == 4)
                .collect(Collectors.toList());
        System.out.println("Vier Buchstaben: " + ergebnis   );

        //Keine Veränderung der Ursprungsliste
        System.out.println("Original: "+namen);

    }
}
