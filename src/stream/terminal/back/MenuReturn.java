package stream.terminal.back;

import stream.Cat;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/*
В данном классе рассмотрены терминальные операции генерирующие результат
на основании данных потока
 */
public class MenuReturn {
    public static void run() {
        List<String> list = List.of("Java", "C++", "C", "Python", "Ruby");
        List<String> iKnow = List.of("Java", "Spring");

        Predicate<String> predicate = getPredicate(iKnow);

        boolean canIwork = list.stream().anyMatch(predicate);
        if (canIwork) System.out.println("You can work");
        else System.out.println("You should learn new programming leng.");


        boolean canIdoFull = list.stream().allMatch(predicate);
        if (canIdoFull) System.out.println("Yes!!");
        else System.out.println("No!!");

        List<Integer> integers = List.of(2, 4, 6, 8, 9);

        Optional<Integer> first = integers.stream().filter(e -> e % 2 != 0).findFirst();
        first.ifPresent(System.out::println);

        long count = integers.stream().count();
        System.out.println(count);

        Cat cat = new Cat("Vasil", 1, 3);
        Cat cat1 = new Cat("Grisha", 12, 6);
        Cat cat2 = new Cat("Vasil", 7, 2);
        Cat cat3 = new Cat("Tom", 2, 1);

        List<Cat> cats = List.of(cat1, cat, cat2, cat3);

        Comparator<Cat> comparator = Comparator.comparing(Cat::getAge);

        cats.stream()
                .max(comparator.thenComparing(Cat::getName))
                .ifPresent(System.out::println);

    }

    public static <T> Predicate<T> getPredicate(List<T> list) {
        class SubPredicate implements Predicate<T> {

            @Override
            public boolean test(T t) {
                for (T el : list) {
                    if (el.equals(t)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return new SubPredicate();
    }
}