package intrerface.functional.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class MenuDefaultMethod {
    public static void run() {

        Person person = new Person("Konstantin", 25);
        Person person1 = new Person("Marina", 14);
        Person person2 = new Person("Andre", 45);
        Person person3 = new Person("Kiril", 45);
        Person person4 = new Person("Maks", 25);

        Person[] people = {person1, person, person2, person3, person4};

        Comparator<Person> comparator = Comparator.comparingInt(Person::age);
        Comparator<Person> comparator1 = Comparator.comparing(Person::name);
        Comparator<Person> comparator2 = comparator.thenComparing(comparator1);

        Arrays.sort(people, comparator2);
        System.out.println(Arrays.toString(people));

        Function<Person, String> function = Person::name;
        Comparator<Person> comparator3 = comparator.thenComparing(function);

        Arrays.sort(people, comparator3);
        System.out.println(Arrays.toString(people));

        Comparator<Person> comparator4 = comparator1.thenComparing(
                MenuDefaultMethod::getPersonName,
                MenuDefaultMethod::getCompare);

        Arrays.sort(people, comparator4);
        System.out.println(Arrays.toString(people));
    }

    private static String getPersonName(Person person) {
        return person.name();
    }

    private static int getCompare(String s, String s2) {
        return Integer.compare(s.length(), s2.length());
    }
}
