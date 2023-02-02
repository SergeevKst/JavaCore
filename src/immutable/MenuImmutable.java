package immutable;

public class MenuImmutable {
    public static void run() {
        ImmutablePoint point=new ImmutablePoint();
        ImmutablePoint point1=new ImmutablePoint(1.0,2.0);

        System.out.println(point1);
        System.out.println(point);
    }
}
