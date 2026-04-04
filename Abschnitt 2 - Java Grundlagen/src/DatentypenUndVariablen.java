/**
 * Diese Klasse demonstriert die grundlegenden Datentypen in Java.
 */
public class DatentypenUndVariablen {

    /**
     * Die main-Methode ist der Einstiegspunkt des Programms.
     */
    public static void main(String[] args) {

        // Ganzahlen
        int alter = 30;
        long grosseZahl = 100000000000L ;
        char buchstabe = 'A'; // char: einzelnes Unicode-Zeichen

        // Fließkommazahlen
        float temperatur = 36.5f;
        double pi = 3.14159;

        // Wahrheitswert
        boolean istErwachsen = true; // boolean: true oder false

        // Typinferenz mit var (ab Java 10)
        var zahl = 42; // wird als int interpretiert
        var name = "Anna"; // wird als String interpretiert

        // Ausgabe auf der Konsole
        System.out.println("Alter:"+alter);
        System.out.println("Grosse:"+grosseZahl);
        System.out.println("Buchstabe:"+buchstabe);
        System.out.println("Temperatur:"+temperatur);
        System.out.println("Pi:"+pi);
        System.out.println("istErwachsen:"+istErwachsen);
        System.out.println("Zahl:"+zahl);
        System.out.println("Name:"+name);

    }
}
