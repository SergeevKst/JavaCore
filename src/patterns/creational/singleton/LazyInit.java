package patterns.creational.singleton;

public final class LazyInit {
    private static LazyInit instance;


    public static synchronized LazyInit getInstance() {
        if (instance == null) {
            instance = new LazyInit();
        }
        return instance;
    }

    private LazyInit() {
    }
}
