package intrerface.defaultmethod.hierarchy2;

public class RealizationA implements A{
    private final String text;

    public RealizationA() {
        this.text = "class A";
    }

    @Override
    public String getMessage() {
        return text+" "+ text;
    }
}
