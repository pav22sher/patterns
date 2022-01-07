package behavioral_patterns.strategy.example2.auth;

public class Basic implements AuthStrategy{
    @Override
    public void auth() {
        System.out.println("Authenticating using Basic Strategy!");
    }
}