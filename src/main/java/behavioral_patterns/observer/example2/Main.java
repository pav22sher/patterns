package behavioral_patterns.observer.example2;

import behavioral_patterns.observer.example2.chat.Admin;
import behavioral_patterns.observer.example2.chat.Chat;
import behavioral_patterns.observer.example2.chat.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Admin admin = new Admin();
        Chat chat = new Chat();
        chat.addObserver(admin);
        chat.addObserver(user);
        chat.addMessage("Hi");
        chat.addMessage("Buy");
    }
}
