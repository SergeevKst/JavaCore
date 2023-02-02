package patterns.behavioral.chain;

public abstract class Notifier {
    private final int priority;
    private Notifier notifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
    public void notifyManager(String message, int level){
        if (level>=priority) {
            write(message);
        }
        if (notifier!=null) {
            notifier.notifyManager(message, level);
        }
    }
    public abstract void write(String message);
}
