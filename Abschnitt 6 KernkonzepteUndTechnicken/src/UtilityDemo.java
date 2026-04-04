import java.util.List;
import java.util.Objects;

public class UtilityDemo {
    public static void main(String[] args) {

        // Null prüfen
        String name = "Anna";
        Objects.requireNonNull(name);

        // Null-sicher vergleichen
        System.out.println(Objects.equals(name, "Anna"));

        // Index prüfen (ab java 9)
        int i = 1;
        List<String> farben = List.of("Rot","Grün");
        if(Objects.checkIndex(i,farben.size()) >= 0){
            System.out.println(farben.get(i));
        }
    }
}
