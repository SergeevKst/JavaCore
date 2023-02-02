package intrerface.functional.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MenuBiConsumer {
    public static void run() {
        BiConsumer<String, Integer> biConsumer = (a, b) -> System.out.println(a.repeat(b));
        biConsumer.accept("Java", 5);

        Map<Integer, String> map = new HashMap<>(Map.of(1, "one", 5, "five", 10, "ten"));
        BiConsumer<Integer, String> biConsumer1 = (a, b) -> System.out.println((b + " ").repeat(a));
        map.forEach(biConsumer1);
    }
}
