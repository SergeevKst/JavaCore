package intrerface.functional.predicate;

import java.util.function.BiPredicate;

public class MenuBiPredicate {
    public static void run(){

        BiPredicate<String,Integer> biPredicate=(a,b)->a.length()>b;
        System.out.println(biPredicate.test("Hello",10));

        BiPredicate<String,Integer> biPredicate1=(a,b)->a.length()>b+5;
        BiPredicate<String,Integer> biPredicate2=(a,b)->a.length()>b-5;

        System.out.println(biPredicate1.and(biPredicate2).test("Konstantin", 5));

    }
}
