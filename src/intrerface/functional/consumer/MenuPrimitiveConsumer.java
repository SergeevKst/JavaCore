package intrerface.functional.consumer;

import java.util.function.IntConsumer;

public class MenuPrimitiveConsumer {
    public static void run() {
        IntConsumer intConsumer = a -> {
            if (a % 2 == 0) System.out.println(a + " even number");
            else System.out.println(a + " odd number");
        };

        intConsumer.accept(250);
    }
}
