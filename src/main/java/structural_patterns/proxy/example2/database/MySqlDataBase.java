package structural_patterns.proxy.example2.database;

public class MySqlDataBase extends Database{
    public MySqlDataBase(String username, String password) {
        super(username, password);
    }

    @Override
    public void query(String query) {
        System.out.println(query);
    }
}