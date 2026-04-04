/**
 * Abstrakte Klasse: Kann nicht instanziert werden
 */
public abstract class Tier {
    // Abstrakte Methode: Muss von Unterklassen implementiert werden.
    public abstract void geraeuschMachen();

    // Konkrete Methode: Kann direkt genutzt oder überschrieben werden.
    public void bewegen(){
        System.out.println("Das Tier bewegt sich. ");
    }
}
