package intrerface.functional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MenuPredicate {
    public static void run() {

        Cat cat = new Cat("Vasil", 23);
        Cat cat2 = new Cat("Mira", 5);
        Cat cat3 = new Cat("Nill", 3);
        Cat cat4 = new Cat("Misha", 10);
        Cat cat5 = new Cat("Pety", 18);

        List<Cat> list = new ArrayList<>(List.of(cat2, cat3, cat4, cat5, cat));

        Predicate<Cat> predicate = a -> a.getName().endsWith("l");
        Predicate<Cat> predicate1 = a -> a.getAge() > 5;
        Predicate<Cat> negate = a -> a.getAge() > 3;

        System.out.println(list);

        list.removeIf(Predicate.not(a -> a.getAge() < 23));
        list.removeIf(Predicate.isEqual(cat4));

        System.out.println(list);

        list.removeIf(negate.negate());
        System.out.println(list);

        list.removeIf(predicate.and(predicate1));
        list.removeIf(predicate.or(predicate1));

        System.out.println(list);

        list.removeIf(e -> e.getName().startsWith("N"));

        System.out.println(list);

        list.removeIf(MenuPredicate::getPredicate);

        System.out.println(list);
    }

    private static boolean getPredicate(Cat cat) {
        return cat.getName().length() == 4;
    }
}
