package patterns.behavioral.mediator;

public interface Chat<E> {
    void sendMessage(String message, E user);
}
