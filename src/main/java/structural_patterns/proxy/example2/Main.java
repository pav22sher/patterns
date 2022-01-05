package structural_patterns.proxy.example2;

import structural_patterns.proxy.example2.database.MySqlDatabaseProxy;

public class Main {
    public static void main(String[] args) {
        MySqlDatabaseProxy database = new MySqlDatabaseProxy("admin", "admin");
        database.query("select * from users");
    }
}
