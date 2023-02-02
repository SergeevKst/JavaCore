package intrerface.defaultmethod.hierarchy;

public class C implements B{
    private final String text;

    public C(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "C{" +
                "text='" + text + '\'' +
                '}';
    }
}
