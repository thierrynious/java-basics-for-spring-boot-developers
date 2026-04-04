import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StetsBeispiel {
    public static void main(String[] args) {
        //HashSet: speichert Elemente ohne garantierte Reihenfolge
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apfel");
        hashSet.add("Banane");
        hashSet.add("Apfel"); // Wird ignoriert
        System.out.println("HashSet: " + hashSet);

        //TreeSet
        // speichert in sortierter Reihenfolge
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apfel");
        treeSet.add("Banane");
        treeSet.add("Kirsche");
        System.out.println("TreeSet(sortiert): " + treeSet);

        // EnumSet
        enum Color {RED,GREEN,BLUE};
        Set<Color> colorSet = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        System.out.println("EnumSet: " + colorSet);

        //Methoden der Set-Schnittstelle
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        //Enthält das Set ein Element?
        System.out.println("Set enthält 'B': "+set.contains("B"));

        //Setgröße und ob das Set leer ist
        System.out.println("Set Größe: "+set.size());
        System.out.println("Ist Set leer? "+set.isEmpty());

        // Alle Elemente entfernen
        set.clear();
        System.out.println("Set nach clear : "+set);
    }
}
