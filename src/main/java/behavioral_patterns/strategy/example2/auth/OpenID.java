package behavioral_patterns.strategy.example2.auth;

public class OpenID implements AuthStrategy{
    @Override
    public void auth() {
        System.out.println("Authenticating using OpenID Strategy!");
    }
}