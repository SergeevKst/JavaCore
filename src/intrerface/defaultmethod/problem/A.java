package intrerface.defaultmethod.problem;

public interface A {
    default String getMessage() {
        return "Interface A";
    }
}
