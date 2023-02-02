package intrerface.functional.binaryoperator;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class MenuBinaryOperator {

    public static void run() {
        BinaryOperator<String> binaryOperator = new StringConcat(4);

        System.out.println(binaryOperator.apply("Java", "C++"));

        BinaryOperator<Integer> binaryOperator1 = (a, b) -> a * b;
        BinaryOperator<Integer> binaryOperator2 = MenuBinaryOperator::getSum;

        System.out.println(binaryOperator1.apply(10, 10));
        System.out.println(binaryOperator2.apply(10, 10));

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        BinaryOperator<Integer> binaryOperator3 = Integer::sum;

        System.out.println(reduce(list, binaryOperator3, 0));

        Comparator<String> comparator = Comparator.comparingInt(String::length);
        BinaryOperator<String> binaryOperator4 = BinaryOperator.maxBy(comparator);

        System.out.println(binaryOperator4.apply("Java", "C++"));
    }

    private static <T> T reduce(List<T> list, BinaryOperator<T> bO, T startValue) {
        T result = startValue;
        for (T t : list) {
            result = bO.apply(result, t);
        }
        return result;
    }

    private static Integer getSum(Integer a, Integer b) {
        return a + b;
    }
}

class StringConcat implements BinaryOperator<String> {
    private final int minLength;

    public StringConcat(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public String apply(String s, String s2) {
        String a = s.length() >= minLength ? s : "";
        String b = s2.length() >= minLength ? s2 : "";
        return a + b;
    }
}