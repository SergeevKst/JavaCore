package stream.terminal.accumulation;

import stream.Cat;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
/*
В данном классе рассмотрены аккумулирующие терминальнае методы
 */
public class MenuAccumulation {
    public static void run() {
        List<Integer> integerList = List.of(1, 2, 3, 45);

        integerList.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        integerList.stream()
                .reduce((a, b) -> a > b ? a : b)
                .ifPresent(System.out::println);

        List<String> stringList = List.of("Learn", "Java");

        String reduce = stringList.stream()
                .reduce("I", (a, b) -> a + " " + b);

        System.out.println(reduce);

        Cat cat = new Cat("Vasil", 1, 3);
        Cat cat1 = new Cat("Grisha", 12, 6);
        Cat cat2 = new Cat("Vasil", 7, 2);
        Cat cat3 = new Cat("Tom", 2, 1);

        List<Cat> cats = List.of(cat1, cat, cat2, cat3);

        BiFunction<Integer, Cat, Integer> biFunction = (a, b) -> a + b.getAge();
        BinaryOperator<Integer> binaryOperator = Integer::sum;

        Integer catsAge = cats.stream()
                .reduce(0, biFunction, binaryOperator);

        System.out.println("General cats age is: " + catsAge);
    }
}
