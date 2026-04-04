/**
 * Hier erstellen wir ein Auto-Objekt und nutzen seine Eigenschaften
 */
public class Main {

    public static void main(String[] args) {

        //Objekt erzeugen
        Auto meinAuto = new Auto();

        //Eigenschaften setzen
        meinAuto.farbe="Rot";
        meinAuto.geschwindigkeit=100;

        //Objekt verwenden
        System.out.println("Farbe: "+meinAuto.farbe);
        System.out.println("Geschwindigkeit: "+meinAuto.geschwindigkeit+" km/h");
        meinAuto.fahren();
        meinAuto.bremsen();
    }
}
