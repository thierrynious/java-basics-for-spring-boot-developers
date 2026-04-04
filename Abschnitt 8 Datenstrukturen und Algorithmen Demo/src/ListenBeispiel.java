import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListenBeispiel {

    public static void main(String[] args) {
        //ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        System.out.println("ArrayList: " + arrayList);

        // Mit Anfangskapazität
        List<String> arrayListWithCapacity = new ArrayList<>(10);

        // Kopieren einer bestehenden Sammlung
        List<String> anotherList = Arrays.asList("A", "B", "C");
        List<String>copiedList = new ArrayList<>(anotherList);
        System.out.println("Kopierte Liste: " + copiedList);

        // Interne Arbeitsweise von ArrayList
        //Manuell Kapazität
        ((ArrayList<String>) arrayList).ensureCapacity(1000);

        //LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("LinkedList: " + linkedList);

        //Zusätzliche Methoden von LinkedList
        LinkedList<String> linkedLisDeque = new LinkedList<>();
        linkedLisDeque.add("Start");
        linkedLisDeque.add("End");
        linkedLisDeque.removeLast();
        System.out.println("LinkedList mit Deque: " + linkedLisDeque);

        //Arrays.asList
        List<String> arrayListFromArray = Arrays.asList("a", "b", "c");
        // Achtung: Diese Liste ist fixgroß
        System.out.println("ArrayList aus Array: "+arrayListFromArray);

    }
}
