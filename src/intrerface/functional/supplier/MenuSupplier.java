package intrerface.functional.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MenuSupplier {
    public static void run() {
        Supplier<Integer> counter = new IntegerSequence(0, 10, 1);
        Integer num;
        while ((num = counter.get()) != null) {
            System.out.println(num);
        }

        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        Supplier<Integer> supplier1 = MenuSupplier::getSupplier;

        System.out.println(supplier1.get());
        System.out.println(supplier.get());

        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();

        System.out.println(list);

    }

    private static Integer getSupplier() {
        return (int) (Math.random() * 100);
    }
}

class IntegerSequence implements Supplier<Integer> {
    private Integer start;
    private final Integer end;
    private final Integer step;

    public IntegerSequence(Integer start, Integer end, Integer step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public Integer get() {
        if (start > end) return null;
        start += step;
        return start - step;
    }
}