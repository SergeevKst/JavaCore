package stream.terminal.collect;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class MenuCollect {
    public static void run() {
        List<Integer> listInt = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        ArrayList<Integer> collect = listInt.stream()
                .filter(a -> a % 2 != 0)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(collect);

        Map<String, List<Integer>> map = listInt.stream()
                .collect(MenuCollect::getMap, MenuCollect::addToMap, MenuCollect::addAll);

        System.out.println(map);

        Predicate<Integer> predicate = (a) -> a > 3 && a < 6;

        Collector<Integer, List<Integer>, List<Integer>> collector = new Classificator(predicate);

        List<Integer> integers = listInt.stream().collect(collector);
        System.out.println(integers);

    }

    private static Map<String, List<Integer>> getMap() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("even", new ArrayList<>());
        map.put("odd", new ArrayList<>());
        return map;
    }

    private static void addToMap(Map<String, List<Integer>> map, Integer element) {
        if (element % 2 == 0) map.get("even").add(element);
        else map.get("odd").add(element);
    }

    private static void addAll(Map<String, List<Integer>> map, Map<String, List<Integer>> map1) {
        map.get("even").addAll(map1.get("even"));
        map.get("odd").addAll(map1.get("odd"));
    }
}

class Classificator implements Collector<Integer, List<Integer>, List<Integer>> {

    private final Predicate<Integer> predicate;

    public Classificator(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (list, b) -> {
            if (predicate.test(b)) list.add(b);
        };
    }

    @Override
    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> {
            List<Integer> result = new ArrayList<>();
            result.addAll(a);
            result.addAll(b);
            return result;
        };
    }

    @Override
    public Function<List<Integer>, List<Integer>> finisher() {
        return (a) -> {
            List<Integer> sorted = new ArrayList<>();
            sorted.addAll(a);
            Collections.sort(sorted);
            return sorted;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
