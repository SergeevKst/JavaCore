package patterns.behavioral.chain;

public enum Priority {
    ROUTINE(1),
    IMPORTANT(2),
    ASAP(3);

    private final int i;

    Priority(int i) {
        this.i = i;
    }

    public int getPriority() {
        return i;
    }
}
