import java.util.ArrayList;
import java.util.List;

/**
 * Main Klasse zum testen
 */
public class Main {
    public static void main(String[] args) throws Exception {

    // Typ-Token: Erstellen eines generischen Objekts
        MyNumber number = TypeFactory.createInstance(MyNumber.class);
        System.out.println(number);

        // Bridge-Methode sichtbar über Bytecode, nicht im Quelltext
        Comparable<MyNumber> comp = new MyNumber(5);
        System.out.println("Vergleich: "+comp.compareTo(new MyNumber(10)));
    }
}
