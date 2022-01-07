package behavioral_patterns.mediator.example1;

import behavioral_patterns.mediator.example1.chat.ChatMediator;
import behavioral_patterns.mediator.example1.chat.User;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();
        User user1 = new User("Pankaj", mediator);
        User user2 = new User("Lisa", mediator);
        User user3 = new User("Saurabh", mediator);
        User user4 = new User("David", mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("Hi All");
    }
}
