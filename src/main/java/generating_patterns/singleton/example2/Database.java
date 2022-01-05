package generating_patterns.singleton.example2;

public class Database {
    private static volatile Database instance;
    private Database(){}
    public static Database getInstance() {
        if(instance == null) {
            synchronized (Database.class) {
                if(instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}
