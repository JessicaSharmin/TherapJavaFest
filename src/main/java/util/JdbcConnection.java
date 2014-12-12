package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcConnection 
{
     public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl ="jdbc:mysql://localhost/eventplanning?user=root&password=";
            return DriverManager.getConnection(connectionUrl);
        } catch (ClassNotFoundException | SQLException e) {
        }

        return null;
    }

    public static void close(Statement statement) 
    {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ignore) {
            }
        }
    }
}