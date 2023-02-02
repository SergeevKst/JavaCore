package patterns.behavioral.mediator;

public class Admin implements User{
    private final Chat<User> chat;

    private final String name;

    public Admin(Chat<User> chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name+" receiving message: "+message+".");
    }
}
