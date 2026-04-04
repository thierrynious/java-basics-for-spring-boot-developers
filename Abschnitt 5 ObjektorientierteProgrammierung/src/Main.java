/**
 * Hauptklasse zum testen
 */
public class Main {

    public static void main(String[] args) {

        Fahrbar meinAuto = new Auto();
        Fahrbar meinBoot = new Boot();

        starteFahrt(meinAuto);
        starteFahrt(meinBoot);

    }

    // Methode ewartet ein Objekt, das die Interface Fahrbar erfüllt.
    public static void starteFahrt(Fahrbar fahrzeug){
        fahrzeug.fahren(); // Aufruf ohne wissen über die konkrete Klasse.
    }
}
