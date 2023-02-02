package stream.intermediate.filtration;

import stream.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
В данном классе рассмотрены промежуточные
методы фильтрации данных в потоке
 */
public class MenuMethodForFiltration {
    public static void run() {

        List<Integer> list = new ArrayList<>(List.of(1, -10, -12, 236, 3667, 2234, 3444, 1, 3, 4));

        List<Integer> collect = list.stream()
                .filter(a -> a < 300)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);

        Cat cat = new Cat("Vasil", 12, 3);
        Cat cat1 = new Cat("Grisha", 1, 6);
        Cat cat2 = new Cat("Maks", 7, 2);
        Cat cat3 = new Cat("Kiril", 2, 1);

        Cat[] cats = {cat1, cat, cat2, null, cat3};

        Stream<Cat> catStream = Arrays.stream(cats)
                .filter(Objects::nonNull)
                .filter(i -> i.getWeight() > 5);

        try {
            List<Cat> collect1 = catStream.toList();
            System.out.println(collect1);
        } catch (NullPointerException e) {
            System.err.println(e);
        }

        List<Cat> catList = new ArrayList<>(List.of(cat3, cat2, cat1, cat, cat3));

        System.out.println(catList);

        catList.stream()
                .distinct()
                .forEach(System.out::println);

        list.stream()
                .filter(i -> i > 0)
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        list.stream()
                .filter(i -> i > 0)
                .sorted()
                .skip(3)
                .forEach(System.out::println);

        list.stream()
                .dropWhile(i -> i < 1000)
                .forEach(System.out::println);

        list.stream()
                .takeWhile(i -> i < 1000)
                .forEach(System.out::println);

    }
}
