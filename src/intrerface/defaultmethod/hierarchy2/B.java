package intrerface.defaultmethod.hierarchy2;

public interface B extends A {

    @Override
    default String getMessage() {
        return "Interface B";
    }
}
