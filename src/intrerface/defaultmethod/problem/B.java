package intrerface.defaultmethod.problem;

public interface B {

    default String getMessage() {
        return "Interface B";
    }
}
