package intrerface.functional.predicate;

import java.util.function.IntPredicate;

public class MenuPrimitivePredicate {
    public static void run(){

        IntPredicate intPredicate=a->a%2==0;

        System.out.println(intPredicate.test(100));

        int[] array={1,2,3,-3,-4,56,8,9};

        int count=doCount(array,a->a<0);
        System.out.println(count);
    }
    private static int doCount(int[] array,IntPredicate intPredicate){
        int count=0;
        for (int j : array) {
            if (intPredicate.test(j)) count += 1;
        }
        return count;
    }
}
