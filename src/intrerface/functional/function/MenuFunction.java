package intrerface.functional.function;

import java.util.*;
import java.util.function.Function;

public class MenuFunction {
    public static void run() {
        Function<String, Integer> function = new Example();
        System.out.println(function.apply("Konstantin"));

        Function<String, Integer> function1 = String::length;
        System.out.println(function1.apply("Konstantin"));

        Function<String, Integer> function2 = MenuFunction::countSpace;
        System.out.println(applyString("I learn Java", function2));

        List<String> stringList = List.of("I", "Learn", "Java", "And", "Looking forward to", "When I find job");
        System.out.println(countChar(function1, stringList));

        Map<Integer, String> map = new HashMap<>(Map.of(1, "one", 2, "two", 10, "ten", 5, "five"));
        Function<Integer, String> function3 = n -> "number " + n;
        Integer num = 100;

        String absent = map.computeIfAbsent(num, function3);
        System.out.println(absent);
        System.out.println(map);

        Function<String, String[]> function4 = a -> a.split(" ");
        Function<String[], int[]> function5 = MenuFunction::arrayToLength;
        Function<String, int[]> stringFunction = function4.andThen(function5);

        System.out.println(Arrays.toString(stringFunction.apply("I found of Java")));

        Function<String, String> function6 = a -> a.replaceAll("[^A-Za-z]", "");
        Function<String, Integer> compose = function1.compose(function6);

        System.out.println(compose.apply("I want work 3245 Java 938 Developer"));

        Function<Integer, Integer> function7 = Function.identity();
        System.out.println(function7.apply(12124));
    }

    private static int[] arrayToLength(String[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i].length();
        }
        return array;
    }

    private static <E, T> List<T> countChar(Function<E, T> function, List<E> list) {
        List<T> result = new ArrayList<>();

        list.stream()
                .map(function::apply)
                .forEach(result::add);

        return result;
    }

    private static Integer applyString(String text, Function<String, Integer> func) {
        return func.apply(text);
    }

    private static Integer countSpace(String text) {
        int count = 0;
        char[] chars = text.toCharArray();

        for (char aChar : chars) {
            if (aChar == ' ') {
                count += 1;
            }
        }
        return count;
    }
}

class Example implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}