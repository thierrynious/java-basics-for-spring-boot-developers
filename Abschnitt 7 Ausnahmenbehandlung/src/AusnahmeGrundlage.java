import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Grundlagen der Ausnahmebehandlung
 */
public class AusnahmeGrundlage {

    public static void main(String[] args) {
        // Ungeprüfte Ausnahme
        try{
            int zahl = Integer.parseInt("abc");

        }catch (NumberFormatException e){
            System.out.println("Ungültige Zahl!");
        }

        // Geprüfte Ausnahme(IOException)
        BufferedReader reader = null;
        try{
            reader= new BufferedReader(new FileReader("test.txt"));
            String zeile = reader.readLine();
            System.out.println(zeile);

        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden!");
        } catch (IOException e) {
            System.out.println("Fehler beim Laden der Datei!");
        }finally {
            if(reader != null){
                try {
                    reader.close();
                }catch (IOException e){
                    System.out.println("Fehler beim schliessen");
                }
            }
        }

        // Multi-catch
        try {
            int zahl = Integer.parseInt("abc");
            BufferedReader r = new BufferedReader(new FileReader("test.txt"));
        }catch (IOException | NumberFormatException e){
            System.out.println("Ein Fehler ist aufgetreten"+e.getMessage());
        }
    }
}
