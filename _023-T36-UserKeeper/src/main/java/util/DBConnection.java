package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBConnection {

    private static String url = "jdbc:mysql://localhost:3307/java_course?serverTimezone=America/Montevideo";

    private static String user = "root";
    private static String password = "sasa";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

    public static void closeInstance() throws SQLException {
        if (connection != null) {
            connection.close();
            System.out.println("Connection to DB closed");
        }
    }

}
