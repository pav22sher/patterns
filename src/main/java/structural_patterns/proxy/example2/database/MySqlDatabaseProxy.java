package structural_patterns.proxy.example2.database;

public class MySqlDatabaseProxy extends Database{
    private MySqlDataBase proxy;
    public MySqlDatabaseProxy(String username, String password) {
        super(username, password);
    }

    @Override
    public String getUsername() {
        return proxy == null ? username : proxy.getUsername();
    }

    @Override
    public String getPassword() {
        return proxy == null ? password : proxy.getPassword();
    }

    @Override
    public void query(String query) {
        if(proxy == null) {
            proxy = new MySqlDataBase(username, password);
        }
        proxy.query(query);
    }
}
