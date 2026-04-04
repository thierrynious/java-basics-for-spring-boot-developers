/**
 * Grundlagen von Methoden
 */
public class MethodenDemo {
    public static void main(String[] args) {
        System.out.println("Methoden mit Rückgabewert: ");
        int summe = addiere(3,4);
        System.out.println("Summe: " + summe);

        String begruessung = begruessung("Anna");
        System.out.println(begruessung);

        System.out.println("Void-Methoden: ");
        druckeText();

        System.out.println("Methode mit Rückgabe boolean");
        System.out.println("Ist 4 gerade ? "+istGerade(4));
        System.out.println("Ist 5 gerade ? "+istGerade(5));

        System.out.println("\n Quadratwurzel ausgeben: ");
        printSqrt(-9);
        printSqrt(25);
        printSqrt(12);

    }

    public static int addiere(int a, int b) {
        return a+b;
    }

    public static String begruessung(String name){
        return "Hallo "+name+ "!";
    }

    public static void druckeText(){
        System.out.println("Dies ist eine void-Methode");
    }

    public static boolean istGerade(int zahl){
        return zahl%2==0;
    }

    public static void printSqrt(double zahl){
        if(zahl<0){
            System.out.println("Zahl ist negative!-Keine Wurzel berechenbar");
            return;
        }
        double wurzel = Math.sqrt(zahl);
        System.out.println("Die Quadratwurzel ist : "+wurzel);
    }
}
