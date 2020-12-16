package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection instance = null;
    private Connection connection;

    private DbConnection() {
        try {
            this.connection = DriverManager.getConnection(" ");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static DbConnection getInstance() {
        if (DbConnection.instance == null) {
            DbConnection.instance = new DbConnection();
        }
        return DbConnection.instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
