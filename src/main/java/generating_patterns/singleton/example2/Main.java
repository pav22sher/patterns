package generating_patterns.singleton.example2;

public class Main {
    public static void main(String[] args) {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
    }
}
