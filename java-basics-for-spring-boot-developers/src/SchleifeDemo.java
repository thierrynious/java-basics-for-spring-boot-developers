public class SchleifeDemo {

    public static void main(String[] args) {

        System.out.println("While-Schleife");

        int i = 0;

        while (i < 5) {
            System.out.println("i = "+i);
            i++;
        }

        System.out.println("\n do-while-Schleife: ");
        int j = 0;
        do{
            System.out.println("j = "+j);
            j++;
        }while(j < 3);

        System.out.println("\n for-Schleife: ");
        for (int k = 0; k < 5; k++) {
            System.out.println("k = "+k);
        }

        System.out.println("\n for-Schleife mit continue: ");
        for (int k = 0; k < 5; k++) {
            if(k == 1)continue;
            System.out.println("k = "+k);
        }
    }
}
