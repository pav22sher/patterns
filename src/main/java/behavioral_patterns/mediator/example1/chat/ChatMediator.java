package behavioral_patterns.mediator.example1.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator {
    private final List<User> users = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
    }
    public void sendMessage(String msg, User user) {
        for(User u : users){
            if(u != user){
                u.receive(msg);
            }
        }
    }
}
