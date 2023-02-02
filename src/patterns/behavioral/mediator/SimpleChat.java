package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat<User>{
    private User admin;
    private final List<User> userList=new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }
    public void addUserToChat(User user){
        this.userList.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        userList.stream()
                .filter(u->u!=user)
                .forEach(e->e.getMessage(message));

        admin.getMessage(message);
    }
}
