public class VariablenDemo {

    public static void main(String[] args) {

        //Ganzzahlen
        int alter = 30;
        long grosseZahl = 10000000000L;
        char buchstabe = 'A';

        // Fliesskommazahlen
        float temperatur = 36.5f;
        double pi = 3.14159265359;

        // Wahrheitswert
        boolean istErwachsen = true;

        // Typinferenz mit var (ab java 10)
        var zahl = 42; // Wird als int interpretiert
        var name = "Anna"; // Wird als String interpretiert

        // Ausgabe
        System.out.println("Alter: " + alter);
        System.out.println("Grosse Zahl: " + grosseZahl);
        System.out.println("Buchstabe: " + buchstabe);
        System.out.println("Temperatur: " + temperatur);
        System.out.println("Pi: " + pi);
        System.out.println("IstErwachsen: " + istErwachsen);
        System.out.println("Zahl: " + zahl);
        System.out.println("Name: " + name);

    }
}
