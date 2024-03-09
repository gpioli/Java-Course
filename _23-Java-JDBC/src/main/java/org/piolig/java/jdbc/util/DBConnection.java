package org.piolig.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static String url = "jdbc:mysql://localhost:3307/java_course?serverTimezone=America/Montevideo";
    private static String username = "root";
    private static String password = "sasa";

    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

}
