import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperationenDemo {
    public static void main(String[] args) {
        List<String> namen = List.of("Anna", "Alex", "Ben", "Susi","Ben");
        List<Integer> zahlen = List.of(3,5,2,8,5,10);

        //count()
        long anzahl = namen.stream().count(); // Anzahl dern Namen
        System.out.println("count: "+anzahl );

        //forEach()
        namen.stream().forEach(System.out::println); // Jeden Namen ausgeben

        //findFirst()
        Optional<String> erstes = namen.stream().findFirst();
        erstes.ifPresent(n-> System.out.println("Erstes Element: "+n));

        // anyMatch(), allMatch(), noneMAtch()....
        boolean gibtEsAnna = namen.stream().anyMatch(n->n.equals("Anna"));
        System.out.println("Anna vorhanden: "+gibtEsAnna);

        //min(), max()
        Optional<Integer> min = zahlen.stream().min(Integer::compareTo);
        Optional<Integer> max = zahlen.stream().max(Integer::compareTo);
        min.ifPresent(m-> System.out.println("Min element: "+m));
        max.ifPresent( m-> System.out.println("Max element: "+m));

        // reduce
        int summe = zahlen.stream().reduce(0, Integer::sum);
        System.out.println("Summe: "+summe);

        // collect()
        List<String> liste = namen.stream()
                .filter(n->n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Namen mit A: "+liste);

        //peek()
        List<String> debug = namen.stream()
                .peek(n-> System.out.println("Vorher: "+n))
                .map(String::toUpperCase)
                .peek(n-> System.out.println("Nachher: "+n))
                .collect(Collectors.toList());
    }
}
