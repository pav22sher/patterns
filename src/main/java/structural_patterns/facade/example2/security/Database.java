package structural_patterns.facade.example2.security;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String, User> users = new HashMap<>();
    public void add(User user) {
        users.put(user.getUsername(), user);
    }
    public void remove(User user){
        users.remove(user.getUsername(),user);
    }
    public User search(String username) {
        return users.get(username);
    }
}
