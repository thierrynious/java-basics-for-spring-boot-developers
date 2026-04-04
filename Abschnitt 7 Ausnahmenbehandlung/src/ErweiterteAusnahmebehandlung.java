import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ErweiterteAusnahmebehandlung{
    
    // Methode mit throws
    public static void ladeDatei(String pfad) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pfad));
        System.out.println(reader.readLine());
        reader.close();
    }

    // Methode mit eigener geprüfter Ausnahme
    public static void pruefeZahl(int zahl) throws UngueltigeEingabeException {
        if(zahl < 0){
            throw new UngueltigeEingabeException("Zahl darf nicht negativ sein!");
        }
    }

    public static void main(String[] args) throws IOException {

        int a = 5;
        int b = 10;
        int differenz = a-b;
        assert differenz >=0:"Differenz darf nicht negativ sein";

        // Aufruf der Methode mit throws

        try{
            ladeDatei("daten.txt");
        }catch (IOException e){
            System.out.println("Dateifehler: "+e.getMessage());
        }

        // Nutzung eigener Exception
        try{
            pruefeZahl(-5);
        }catch (UngueltigeEingabeException e){
            System.out.println("Benutzerfehler:"+e.getMessage());
        }

        // finally ohne catch
        try{
            System.out.println("Testausgabe");
        }finally{
            System.out.println("Wird immer ausgeführt. ");
        }

    }
}
