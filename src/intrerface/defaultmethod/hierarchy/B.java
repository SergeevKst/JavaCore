package intrerface.defaultmethod.hierarchy;

public interface B extends A {

    @Override
    default String getMessage() {
        return "Interface B";
    }
}
