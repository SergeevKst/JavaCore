package stream.terminal.execute;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/*
В данном классе расмотрены терминальные методы
выполняющие действия на данными
 */
public class MenuExecute {
    public static void run() {
        List<String> list = List.of("Learn", "Java");

        list.stream()
                .map(a -> a.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);

        Object[] objects = list.stream()
                .map(a -> a.toUpperCase(Locale.ROOT))
                .toArray();

        System.out.println(Arrays.toString(objects));

        String[] strings = list.stream()
                .map(a -> a.repeat(3))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(strings));
    }
}
