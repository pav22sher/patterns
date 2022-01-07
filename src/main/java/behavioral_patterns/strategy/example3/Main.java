package behavioral_patterns.strategy.example3;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(() -> System.out.println("Video playing"));
        computer1.runTask();
        Computer computer2 = new Computer(() -> System.out.println("Music playing"));
        computer2.runTask();
    }
}
