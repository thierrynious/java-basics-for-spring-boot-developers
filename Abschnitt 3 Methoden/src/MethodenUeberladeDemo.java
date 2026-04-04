public class MethodenUeberladeDemo {

    public static void main(String[] args) {
        drucke("Hallo");
        drucke("Hi",2);
        System.out.println(addiere(2,3));
        System.out.println(addiere(3,4,1));
        System.out.println(quadriere(4));
        System.out.println(quadriere(2.5));
    }

    static void drucke(String text){
        System.out.println(text);
    }
    static void drucke(String text, int mal){
        for(int i = 0; i < mal; i++){
            System.out.println(text);
        }
    }

    static int addiere(int a, int b){
        return a + b;
    }
    static int addiere(int a, int b, int c){
        return a + b + c;
    }

    static int quadriere(int x){
        return x * x;
    }
    static double quadriere(double x){
        return x * x;
    }
}
