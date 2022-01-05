package structural_patterns.facade.example2.security;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityInterface {
    private Database database;

    public void sign(String username, String password) {
        User user = database.search(username);
        if(user != null) {
            throw new RuntimeException("Such a user already exists!");
        }
        database.add(new User(username, password));
        System.out.println("Successfully sign!");
    }

    public void login(String username, String password){
        User user = database.search(username);
        if(!user.getPassword().equals(password)) {
            throw new RuntimeException("Wrong password or username!");
        }
        System.out.println("Successfully login!");
    }
}
