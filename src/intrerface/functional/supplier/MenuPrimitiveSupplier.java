package intrerface.functional.supplier;

import java.util.Arrays;
import java.util.function.IntSupplier;

public class MenuPrimitiveSupplier {
    public static void run() {

        IntSupplier intSupplier = new RandomGenerator(100, 200);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = intSupplier.getAsInt();
        }
        System.out.println(Arrays.toString(array));
    }
}

class RandomGenerator implements IntSupplier {

    private final int max;
    private final int min;

    public RandomGenerator(int max, int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public int getAsInt() {
        return (int) (min + Math.random() * (max - min));
    }
}