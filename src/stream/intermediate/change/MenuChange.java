package stream.intermediate.change;

import stream.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
В данном классе рассмотрены промежуточные методы для изменения потока
так жу рассмотрен ряд static method
 */
public class MenuChange {
    public static void run() {
        List<String> list = List.of("Java", "C++", "Fortarn");

        list.stream()
                .map(String::length)
                .forEach(System.out::println);

        Cat cat = new Cat("Vasil", 12, 3);
        Cat cat1 = new Cat("Grisha", 1, 6);
        Cat cat2 = new Cat("Maks", 7, 2);
        Cat cat3 = new Cat("Kiril", 2, 1);

        Cat[] cats = {cat1, cat, cat2, cat3};

        Arrays.stream(cats)
                .map(Cat::getName)
                .forEach(System.out::println);

        Singer singer = new Singer("Boris Brejcha", new String[]{
                "Blue Lake", "Spicy"});

        Singer singer1 = new Singer("NTO", new String[]{
                "Alter ego", "Invisible"});

        Singer[] singers = {singer1, singer};

        Arrays.stream(singers)
                .flatMap(n -> Arrays.stream(n.songs()))
                .forEach(System.out::println);

        list.stream()
                .flatMapToInt(String::codePoints)
                .forEach(System.out::println);

        List<String> concatStream = List.of("Java the best");

        Stream.concat(list.stream(), concatStream.stream())
                .forEach(System.out::println);

        Stream.empty()
                .forEach(System.out::println);

        Stream.generate(getRandom(1, 1000))
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(1, n -> n <= 10, n -> n + 1)
                .forEach(System.out::println);

        Stream.of("Java", "the", "best")
                .forEach(System.out::println);

        Stream.ofNullable(null)
                .forEach(System.out::println);

    }

    public static Supplier<Integer> getRandom(int start, int end) {
        class Rnd implements Supplier<Integer> {

            @Override
            public Integer get() {
                return (int) (start + Math.random() * (end - start) + 1);
            }
        }
        return new Rnd();
    }
}

record Singer(String name, String[] songs) {

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", songs=" + Arrays.toString(songs) +
                '}';
    }
}