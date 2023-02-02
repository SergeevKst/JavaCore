package intrerface.functional.comparator;

import java.util.Arrays;
import java.util.Comparator;

/*
Документация сайта Oracle рекомендует делать проверки реализованного
метода compare(Е а, Е b) как показано ниже
 */
public class MenuComparator {
    public static void run() {

        Person person = new Person("Konstantin", 25);
        Person person1 = new Person("Marina", 14);
        Person person2 = new Person("Andre", 45);
        Person person3 = new Person("Kiril", 12);
        Person person4 = new Person("Maks", 25);

        Comparator<Person> comparator = new PersonComparator();

        System.out.println("Проверка антисимметричности: " + (
                comparator.compare(person, person1) == -comparator.compare(person1, person)));

        System.out.println("Проверка на транзитивность: " + (
                comparator.compare(person, person1) > 0
                        && comparator.compare(person1, person3) > 0
                        && comparator.compare(person, person3) > 0));

        System.out.println("Проверка равенства знаков: " + (
                comparator.compare(person, person4) == 0
                        && (comparator.compare(person, person1) > 0
                        && comparator.compare(person4, person1) > 0)));

        Person[] people = {person1, person, person2, person3, person4};
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));

        Comparator<Integer> comparator1 = Comparator.comparingInt(Math::abs);
        Comparator<Person> comparator2 = MenuComparator::getComparator;

        Integer[] numbers = {1, -2, -10, 12, -223, -3, -2, 52, 3, -5};

        Arrays.sort(numbers, comparator1);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(people, comparator2.reversed());
        System.out.println(Arrays.toString(people));
    }

    private static int getComparator(Person p1, Person p2) {
        if (p1.age() > p2.age()) return 1;
        if (p2.age() > p1.age()) return -1;
        return 0;
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age() > o2.age()) return 1;
        if (o2.age() > o1.age()) return -1;
        return 0;
    }
}
