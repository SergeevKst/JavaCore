package stream.intermediate.order;

import java.util.List;
import java.util.Objects;

/*
В данном классе рассмотрены промежуточные методы для изменения порядка потока
Стоит помнить про то что методы которые запоминают состояние и накапливают данные
перед обработкай лучше по возможности вызывать как можно ближе к терминальному
 */
public class MenuOrder {
    public static void run() {
        List<String> list = List.of("B1", "C1", "A1");

        System.out.println(list);

        list.stream()
                .sorted(Objects::hash)
                .forEach(System.out::println);

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
