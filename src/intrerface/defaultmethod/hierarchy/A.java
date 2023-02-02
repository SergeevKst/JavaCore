package intrerface.defaultmethod.hierarchy;

public interface A {
    default String getMessage() {
        return "Interface A";
    }
}
