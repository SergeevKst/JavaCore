package mutable;

public class MenuMutable {

    public static void run() {
        MutablePoint point=new MutablePoint(1.0,1.0);
        System.out.println(point);

        point.setX(2.0);
        point.setY(2.0);

        System.out.println("X: "+point.getX()+"; Y: "+point.getY());
    }
}
