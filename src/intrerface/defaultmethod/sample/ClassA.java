package intrerface.defaultmethod.sample;

public class ClassA implements SampleInterface{
    private final String message;

    public ClassA(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
