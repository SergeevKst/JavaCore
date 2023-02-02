package stream.parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.*;
import java.util.stream.Collector;

public class MenuParallel {
    public static void run() {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 5, 9, 8);

        Integer reduce = list.parallelStream()
                .reduce(0, Integer::sum);

        System.out.println(reduce);

        Supplier<List<Integer>> supplier = ArrayList::new;

        BiConsumer<List<Integer>, Integer> biConsumer = List::add;

        BinaryOperator<List<Integer>> binaryOperator = (a, b) -> {
            CopyOnWriteArrayList<Integer> result = new CopyOnWriteArrayList<>();
            result.addAll(a);
            result.addAll(b);
            return result;
        };

        Function<List<Integer>, List<Integer>> function = Function.identity();

        List<Integer> collect = list.parallelStream()
                .filter(a -> a % 2 == 0)
                .collect(Collector.of(supplier, biConsumer, binaryOperator, function));

        System.out.println(collect);

        String[] strings = {"I", "Love", "Java"};
        BinaryOperator<String> binaryOperator1 = (a, b) -> a + " " + b;

        Arrays.parallelPrefix(strings, binaryOperator1);
        System.out.println(Arrays.toString(strings));

        int[] num = new int[6];

        Arrays.parallelSetAll(num, n -> {
            int factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        });

        System.out.println(Arrays.toString(num));
    }
}
