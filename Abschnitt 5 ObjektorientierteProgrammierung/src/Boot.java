/**
 * Eine weitere Klasse, die die selbe Interface implementiert
 */
public class Boot implements Fahrbar{
    @Override
    public void fahren() {
        System.out.println("Das Boot legt ab.");
    }
}
