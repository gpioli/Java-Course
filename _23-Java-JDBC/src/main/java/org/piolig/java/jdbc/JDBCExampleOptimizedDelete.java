package org.piolig.java.jdbc;

import org.piolig.java.jdbc.model.Product;
import org.piolig.java.jdbc.repository.ProductRepository;
import org.piolig.java.jdbc.repository.Repository;
import org.piolig.java.jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExampleOptimizedDelete {
    public static void main(String[] args) {

        // try with auto-close
        // this help us avoid handling closing all the used resources, they close automatically
        // also exceptions are handled automatically
        try (Connection conn = DBConnection.getInstance() ) {

            Repository<Product> repository = new ProductRepository();

            System.out.println("==================== list / findAll ==================== ");
            repository.findAll().forEach(System.out::println);

            System.out.println("\n==================== Searching for id = 2 ==================== ");
            System.out.println(repository.byId(3L));

            System.out.println("\n==================== update product ==================== ");
            Product product = new Product();
            product.setId(3L);
            product.setName("Razr Keyboard");
            product.setPrice(700);
            repository.save(product);
            System.out.println("Product successfully updated");

            System.out.println("==================== list / findAll ==================== ");
            repository.findAll().forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }
}
