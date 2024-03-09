package org.piolig.java.jdbc;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3307/java_course?serverTimezone=America/Montevideo";
        String username = "root";
        String password = "sasa";
        // try with auto-close
        // this help us avoid handling closing all the used resources, they close automatically
        // also exceptions are handled automatically
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ResultSet result = stmt.executeQuery("SELECT * FROM products");
                ) {

            while (result.next()){
                System.out.print(result.getInt("id"));
                System.out.print(" | ");
                System.out.print(result.getString("name"));
                System.out.print(" | ");
                System.out.print(result.getInt("price"));
                System.out.print(" | ");
                System.out.println(result.getDate("registry_date"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }
}
