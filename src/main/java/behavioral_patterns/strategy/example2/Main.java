package behavioral_patterns.strategy.example2;

import behavioral_patterns.strategy.example2.auth.Basic;
import behavioral_patterns.strategy.example2.auth.OpenID;
import behavioral_patterns.strategy.example2.auth.SecurityService;

public class Main {
    public static void main(String[] args) {
        SecurityService security1 = new SecurityService(new Basic());
        security1.authenticate();
        SecurityService security2 = new SecurityService(new OpenID());
        security2.authenticate();
    }
}
