package intrerface.defaultmethod.sample;

public class ClassB implements SampleInterface{
    private final String message;

    public ClassB(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "message='" + message + '\'' +
                '}';
    }
}
