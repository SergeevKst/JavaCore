package intrerface.defaultmethod.hierarchy2;

public class C extends RealizationA implements B {
    private final String text;

    public C(String text) {
        super();
        this.text = text;
    }

    @Override
    public String toString() {
        return "C{" +
                "text='" + text + '\'' +
                '}';
    }
}
