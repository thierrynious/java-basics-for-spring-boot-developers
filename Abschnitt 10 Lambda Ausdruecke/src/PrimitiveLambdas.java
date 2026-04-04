import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class PrimitiveLambdas {
    public static void main(String[] args) {
        // IntPredicate: int -> boolean
        IntPredicate istGerade = x -> x%2 ==0;
        System.out.println("Gerade? "+istGerade.test(4));

        //IntUnaryOperator: int -> int
        IntUnaryOperator quadrieren = x -> x*x;
        System.out.println("4^2 = "+quadrieren.applyAsInt(4));

        //IntStream: direkt mit primitiven Lambdas
        /*InStream.range(1,6)
                .map(x ->x*x)
                .forEach(System.out::println); */
    }
}
