/**
 * Beispiel über grundlegende Java Ausdrücke und Operatoren
 *
 */
public class Operatoren {

    public static void main(String[] args) {

        // Zuweisung
        int zahl = 10; // Zuweisungsoperator
        System.out.println("Zahl:"+zahl);

        // Arithmetische Operatoren
        int a = 5;
        int b = 3;
        int summe = a+b;
        int differenz = a-b;
        int produkt = a*b;
        int quotient = a/b;
        int rest = a%b;

        System.out.println("summe:"+summe);
        System.out.println("differenz:"+differenz);
        System.out.println("produkt:"+produkt);
        System.out.println("quotient:"+quotient);
        System.out.println("rest:"+rest);

        // Inkrement / Dekrement

        int x = 10;
        System.out.println("x vor x++: "+x++);
        System.out.println("x nach x++:"+x);
        System.out.println("++x: "+ ++x);

        // Verbundoperatoren
        int y = 20;
        y+=5; // entspricht y = y +5
        System.out.println("y nach +=5:" +y);

        // Vergleichsoperatoren
        boolean istGleich = (a==b);;
        boolean istUngleich = (a!=b);
        boolean istKleiner = (a<b);

        System.out.println("a==b ?"+ istGleich);
        System.out.println("a!=b?" + istUngleich);
        System.out.println("a<b?"+istKleiner);

        // Logische Operatoren
        boolean istPositivUndKlein = (x>0 && x<100);
        boolean istNegativ = !(x>0);

        System.out.println("x ist positiv und <100"+istPositivUndKlein);
        System.out.println("x ist negativ?"+istNegativ);
    }
}
