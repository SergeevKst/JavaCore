package intrerface.functional.function;

import java.util.Date;
import java.util.function.LongFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class MenuPrimitiveFunction {
    public static void run() {
        LongFunction<Date> dateLongFunction= Date::new;
        System.out.println(dateLongFunction.apply(550050505362163852L));

        ToIntFunction<String> function= String::hashCode;
        System.out.println(function.applyAsInt("Konstantin"));

        ToIntBiFunction<Character,Character> biFunction= Integer::sum;
        System.out.println(biFunction.applyAsInt('a', 'b'));
    }
}
