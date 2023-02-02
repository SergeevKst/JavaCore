package intrerface.functional.unaryoperator;

import java.util.function.IntUnaryOperator;

public class MenuPrimitiveUnary {
    public static void run() {
        IntUnaryOperator unaryOperator = MenuPrimitiveUnary::getFactorial;
        System.out.println(unaryOperator.applyAsInt(5));


    }

    private static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}
