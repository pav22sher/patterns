package structural_patterns.proxy.example2.database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Database {
    protected String username;
    protected String password;

    public abstract void query(String query);
}
