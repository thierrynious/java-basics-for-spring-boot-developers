/**
 * Die Klasse Auto implementiert Fahrbar.
 * Sie muss die Methode fahren() konkret definieren.
 */
public class Auto implements Fahrbar{
    @Override
    public void fahren() {
        System.out.println("Das Auto fährt los.");
    }
}
