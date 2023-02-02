package patterns.behavioral.mediator;

public class Runner {
    public static void main(String[] args) {
        SimpleChat simpleChat=new SimpleChat();

        User admin=new Admin(simpleChat, "Admin");
        User user1=new SimpleUser(simpleChat, "User1");
        User user2=new SimpleUser(simpleChat, "User2");

        simpleChat.setAdmin(admin);
        simpleChat.addUserToChat(user1);
        simpleChat.addUserToChat(user2);

        user1.sendMessage("User 1");
        admin.sendMessage("Admin");
    }
}
