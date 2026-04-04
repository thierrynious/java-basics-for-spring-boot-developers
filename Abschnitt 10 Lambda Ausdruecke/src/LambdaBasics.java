import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Lambda Basics
 */
public class LambdaBasics {

    public static void main(String[] args) {
        // Funktion: String -> Integer
        Function<String,Integer> stringLength = s -> s.length();
        System.out.println("Länge: " + stringLength.apply("Hello"));

        //Predicate: prüft ob leer
        Predicate<String>isEmpty = s ->s.isEmpty();
        System.out.println("Leer?"+isEmpty.test(""));

        //Supplier: liefert einen Wert
        /*Supplier<String> printer = s-> System.out.println("Ausgabe: "+s);
        printer.accept("Lambda-Power");*/

        //Runnable mit Lambda
        Runnable r = () -> System.out.println("Thread läuft");
        new Thread(r).start();

    }
}
