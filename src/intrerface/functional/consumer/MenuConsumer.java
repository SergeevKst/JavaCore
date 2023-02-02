package intrerface.functional.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MenuConsumer {
    public static void run() {
        Consumer<String> consumer = new HashCodePrinter<>();
        consumer.accept("Konstantin");

        Consumer<String> consumer1 = a -> System.out.println(a.toUpperCase());
        consumer1.accept("Konstantin");

        Consumer<String> consumer2 = MenuConsumer::getConsumer;
        consumer2.accept("Konstantin");

        String word = "J";
        List<String> list = new ArrayList<>();

        Consumer<String> consumer3 = i -> {
            if (i.startsWith(word)) list.add(i);
        };

        consumer3.accept("Java");
        consumer3.accept("Jeromo");
        consumer3.accept("C++");

        list.forEach(System.out::println);

        Consumer<String> consumer4 = consumer1.andThen(consumer2);
        consumer4.accept("Java");

    }

    private static <T> void getConsumer(T t) {
        System.out.println(t);
    }
}

class HashCodePrinter<T> implements Consumer<T> {
    @Override
    public void accept(T t) {
        System.out.println(t.hashCode());
    }
}