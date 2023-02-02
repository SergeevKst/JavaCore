package intrerface.functional.unaryoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MenuUnaryOperator {
    public static void run() {
        UnaryOperator<String> unaryOperator = new Unary();
        System.out.println(unaryOperator.apply("unary operator"));

        UnaryOperator<Integer> unaryOperator1 = a -> -a;

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        list.replaceAll(unaryOperator1);
        System.out.println(list);

        list.replaceAll(MenuUnaryOperator::getNegative);
        System.out.println(list);

        UnaryOperator<String> unaryOperator2 = String::strip;
        System.out.println(unaryOperator2.andThen(String::length).apply("    Hello "));

        Function<String,Integer> function= String::length;
        System.out.println(unaryOperator1.compose(function).apply("hello"));

        UnaryOperator<Integer> unaryOperator3=UnaryOperator.identity();
        System.out.println(unaryOperator3.apply(100));
    }

    private static Integer getNegative(int num) {
        return -num;
    }
}

class Unary implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}