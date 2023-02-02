package stream.terminal.collectors;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
В этом классе расмотрен class Collectors и его методы
 */
public class MenuCollector {
    public static void run() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Integer, String> collector = list.stream()
                .collect(Collectors.toMap(Function.identity(), a -> (a % 2 == 0) ? "even" : "odd"));

        System.out.println(collector);

        Map<String, List<Integer>> collect = list.stream()
                .collect(Collectors.groupingBy(a -> (a % 2 == 0) ? "even" : "odd"));

        System.out.println(collect);

        List<Integer> listInt = List.of(1, -2, 3, 4, -5, 6, 7, -8, -9, 10);

        Predicate<Integer> predicate = a -> a > 0;

        Map<Boolean, List<Integer>> collect1 = listInt.stream().collect(Collectors.partitioningBy(predicate));
        System.out.println(collect1);

        Integer collect2 = listInt.stream().collect(Collectors.reducing(0, (a, b) -> a + b));
        System.out.println(collect2);

        Collector<Integer, ?, List<Integer>> toList = Collectors.toList();

        Function<List<Integer>, List<String>> function = a -> {
            List<String> result = new ArrayList<>();

            a.stream()
                    .map(b -> b.toString().repeat(b))
                    .forEach(result::add);

            return result;
        };

        List<String> stringList = list.stream()
                .collect(Collectors.collectingAndThen(toList, function));

        System.out.println(stringList);

        List<Integer> integerList = listInt.stream()
                .collect(Collectors.filtering(predicate, toList));

        System.out.println(integerList);

        IntSummaryStatistics data = listInt.stream()
                .collect(Collectors.summarizingInt(a -> a * 1));

        System.out.println("Sum: " + data.getSum() +
                "; Average: " + data.getAverage() +
                "; Max: " + data.getMax() +
                "; Min: " + data.getMin() +
                "; Count: " + data.getCount());

        List<String> listStr = List.of("Love");

        String collect3 = listStr.stream()
                .collect(Collectors.joining(" ", " I ", " Java"));

        System.out.println(collect3);
    }
}
