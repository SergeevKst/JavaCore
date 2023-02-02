package intrerface.functional.binaryoperator;

import java.util.function.IntBinaryOperator;

public class MenuPrimitiveBinary {
    public static void run() {
        IntBinaryOperator binaryOperator=MenuPrimitiveBinary::getGcd;
        System.out.println(binaryOperator.applyAsInt(7, 11));
    }

    private static int getGcd(int i, int b) {
        i = Math.abs(i);
        b = Math.abs(b);

        if (b > i) {
            int temp = i;
            i = b;
            b = temp;
        }

        int res = i % b;

        while (res != 0) {
            i = b;
            b = res;
            res = i % b;
        }
        return b;
    }
}
