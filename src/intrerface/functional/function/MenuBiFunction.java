package intrerface.functional.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MenuBiFunction {
    public static void run() {

        BiFunction<String, Character, Integer> biFunction = MenuBiFunction::getCount;

        System.out.println(biFunction.apply("Konstantin", 'n'));

        BiFunction<String, String, String[]> biFunction1 = (a, b) -> a.split(b);
        Function<String[], String> function = a -> String.join("", a);
        BiFunction<String, String, String> stringBiFunction = biFunction1.andThen(function);

        System.out.println(stringBiFunction.apply("Java    the  Best", "{1,}\s"));
    }

    private static Integer getCount(String s, Character character) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == character) count += 1;
        }
        return count;
    }
}
