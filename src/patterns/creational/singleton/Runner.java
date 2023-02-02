package patterns.creational.singleton;

public class Runner {
    public static void main(String[] args) {
        System.out.println(LazyInit.getInstance());
        System.out.println(LazyInit.getInstance());
        System.out.println(LazyInit.getInstance());
        System.out.println(LazyInit.getInstance());
    }
}
