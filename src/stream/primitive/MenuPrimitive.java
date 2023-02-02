package stream.primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MenuPrimitive {
    public static void run() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7);

        intStream.forEach(System.out::println);

        IntStream arrayStream = IntStream.of(new int[]{1, 2, 34, 5, 6,});

        arrayStream
                .filter(a -> a < 10)
                .forEach(System.out::println);

        IntStream range = IntStream.range(50, 61);

        range.forEach(System.out::println);

        String[] program = {"Java", "Fortran", "C++"};
        IntStream.Builder builder = IntStream.builder();

        Arrays.stream(program)
                .forEach(i -> builder.accept(i.hashCode()));

        IntStream intStream1 = builder.build();
        intStream1.forEach(System.out::println);

        IntStream range1 = IntStream.range(1, 100);

        double sum = range1.asDoubleStream().sum();
        System.out.println(sum);

        IntStream range2 = IntStream.range(1, 100);
        List<Integer> collect = range2.boxed().toList();
        System.out.println(collect);

    }
}
