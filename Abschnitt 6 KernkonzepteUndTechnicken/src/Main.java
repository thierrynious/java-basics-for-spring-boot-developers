import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Lena",30));
        personen.add(new Person("Anna",25));
        personen.add(new Person("Ben",25));

        // Sortieren nach Name (Comparable)
        Collections.sort(personen);
        System.out.println("Nach Name: "+personen);

        // Sortieren nach Alter (Comparator)
        personen.sort(Comparator.comparing(p->p.alter));
        System.out.println("Nach Alter : "+personen);

        // Nach Alter, dann Name
        personen.sort(Comparator.comparing((Person p)->p.alter)
                .thenComparing(p->p.name));
        System.out.println("ALter + Name : "+personen);

    }
}