package intrerface.functional.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MenuStaticMethod {
    public static void run() {

        Person person = new Person("Konstantin", 75);
        Person person1 = new Person("Marina", 14);
        Person person2 = new Person("Andre", 45);
        Person person3 = new Person("Kiril", 45);
        Person person4 = new Person("Maks", 25);

        List<Person> peoples = new ArrayList<>(List.of(person1, person, person2, person3, person4));

//        null friendly comparator
//        peoples.add(null);

        Comparator<Person> comparator = Comparator.comparingInt(Person::age);
        Comparator<Person> comparator1 = Comparator.nullsLast(comparator);

        Person min = Collections.min(peoples, comparator1);

        System.out.println(min);

        List<Integer> list = new ArrayList<>(List.of(1, 34, -2, -100, 75));

        Comparator<Integer> comparator2 = Comparator.naturalOrder();

        Integer minInt = Collections.min(list, comparator2);
        System.out.println(minInt);

        Comparator<String> nameComparator = String::compareTo;
        Function<Person, String> function = Person::name;

        Comparator<Person> comparing = Comparator.comparing(function, nameComparator);

        Person min1 = Collections.min(peoples, comparing);
        System.out.println(min1);
    }
}
