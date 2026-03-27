public class OperatorenDemo {

    public static void main(String[] args) {

        // Zuweisung
        int zahl = 10;
        System.out.println("Zahl : " + zahl);

        // Arithmetische Operatoren
        int a = 5;
        int b = 3;
        int summe = a+b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int rest = a % b;

        System.out.println("Summe : " + summe);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);
        System.out.println("Rest : " + rest);

        // Inkrement
        int x = 10;
        System.out.println("X vor x++ : " + x++);
        System.out.println("X nach x++ : " + x);
        System.out.println("++ x: "+ ++x);

        // VErbundoperator
        int y = 20;
        y+=5;
        System.out.println("y nach +=5: "+y);

        // Vergleichsoperatoren
        boolean istGleich = (a==b);
        boolean istUngleich = (a!=b);
        boolean istKleiner = (a<b);

        System.out.println("a==b ?" + istGleich);
        System.out.println("a!=b ?" + istUngleich);
        System.out.println("a<b ?" + istKleiner);

        // Logische Operatoren
        boolean istPositivUndKlein = (x>0 && x<100);
        boolean istNegativ = !(x>0);

        System.out.println("x ist positiv und < 100? "+istPositivUndKlein);
        System.out.println("x ist negativ ? "+istNegativ);
    }
}
