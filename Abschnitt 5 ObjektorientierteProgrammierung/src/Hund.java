/**
 * Konkrete Unterklasse: Erbt von Tier und implementiert die abstrakten Methoden
 */
public class Hund extends Tier{

    @Override
    public void geraeuschMachen() {
        System.out.println("Der Hund bellt: Wuff!!");
    }
}
