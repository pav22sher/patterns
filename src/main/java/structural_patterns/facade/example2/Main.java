package structural_patterns.facade.example2;

import structural_patterns.facade.example2.security.Database;
import structural_patterns.facade.example2.security.SecurityInterface;

public class Main {
    public static void main(String[] args) {
        SecurityInterface securityInterface = new SecurityInterface(new Database());
        securityInterface.sign("admin","admin");
        securityInterface.login("admin","admin");
    }
}
