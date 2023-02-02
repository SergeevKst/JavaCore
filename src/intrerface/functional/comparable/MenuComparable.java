package intrerface.functional.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
/*
Для корректной работы нужно проверить отношение полного порядка
(Рефлексивность, Антисимметричность, Транзитивность) что и представлено в примере
Так же согласование с equals
 */
public class MenuComparable {
    public static void run() {

        Cat cat = new Cat("Misha", 22);
        Cat cat1 = new Cat("Lera", 2);
        Cat cat2 = new Cat("Vitalik", 1);
        Cat cat3 = new Cat("Croul", 7);
        Cat cat4 = new Cat("Misha", 22);
        Cat cat5 = new Cat("Barsic", 22);

        System.out.println(sgn(cat.compareTo(cat1)) == -sgn(cat1.compareTo(cat)));
        System.out.println((cat.compareTo(cat1) > 0 && cat1.compareTo(cat2) > 0 && cat.compareTo(cat2) > 0));
        System.out.println(cat.compareTo(cat4) == 0 && (sgn(cat.compareTo(cat3)) == sgn(cat4.compareTo(cat3))));

        System.out.println((cat.equals(cat4) == true && cat.compareTo(cat4) == 0));
        System.out.println((cat.equals(cat1) == false && cat.compareTo(cat1) != 0));
        System.out.println((cat.equals(cat5) == false && cat.compareTo(cat5) != 0));

        Cat[] cats={cat,cat1,cat2,cat3,cat5};
        Arrays.stream(cats).forEach(System.out::println);

        Arrays.sort(cats);
        Arrays.stream(cats).forEach(System.out::println);

        Function<String,Integer> function= String::length;
        Comparator<String> comparator=Comparator.comparing(function);
        System.out.println(comparator.compare("Konstantin", "Maria"));
    }

    private static int sgn(int x) {
        return Integer.compare(x, 0);
    }
}
