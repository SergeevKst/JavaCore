package optional;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void run() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Konstantin", 15));
        list.add(new Person("Maria", 27));
        list.add(new Person("Ilia", 75));


        Group group = new Group(list);
        System.out.println(group);

        System.out.println(group.getPerson("Maria"));
        System.out.println(group.getPerson("Greta"));

        System.out.println(group.getPersonOrException("Ilia"));

        list.add(0, null);
        list.add(1, null);

        group.findFirstNotNull().ifPresent(System.out::println);
    }
}
