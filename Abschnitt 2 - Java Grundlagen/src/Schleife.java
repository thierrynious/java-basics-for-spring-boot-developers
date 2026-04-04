/**
 * Dieses Beispiel zeigt die wichtigsten Schleifenarten in Java.
 */
public class Schleife {

    public static void main(String[] args) {

        System.out.println("While-Schleife");
        int i = 0;
        while (i < 5) {
            System.out.println("i = "+i);
            i++;
        }

        System.out.println("\nfor-Schleife");
        for(int k = 0; k<10; k++){
            if(k==3) break; // Schleife bei k == 5 abbrechen
            System.out.println("k="+k);
        }

        System.out.println("\nfor-Schleife mit continue:");
        for(int k=0; k<5; k++){
            if(k==1)continue; // Schleifendurchlauf überspringen bei k==2
            System.out.println("k="+k);
        }
    }
}
