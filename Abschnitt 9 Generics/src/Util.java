import java.util.List;

public class Util {

    //Nur lesend: akzeptiert Subtypen von Number
    public static double sum(List<? extends Number> list) {
        double result = 0.0 ;
        for(Number n : list) {
            result += n.doubleValue();
        }
        return result;
    }

    //Schreibend: akzeptiert Supertypen von Integer
    public static void addNumbers(List<?super Integer>list){
        list.add(10);
        list.add(20);
    }
}
