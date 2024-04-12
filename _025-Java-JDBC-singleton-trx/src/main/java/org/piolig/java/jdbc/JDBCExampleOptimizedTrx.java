package org.piolig.java.jdbc;

import org.piolig.java.jdbc.model.Category;
import org.piolig.java.jdbc.model.Product;
import org.piolig.java.jdbc.repository.ProductRepository;
import org.piolig.java.jdbc.repository.Repository;
import org.piolig.java.jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class JDBCExampleOptimizedTrx {
    public static void main(String[] args) throws SQLException {

        // try with auto-close
        // this help us avoid handling closing all the used resources, they close automatically
        // also exceptions are handled automatically
        try (Connection conn = DBConnection.getInstance()) {
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }

            try {

                Repository<Product> repository = new ProductRepository();

                System.out.println("==================== list / findAll ==================== ");
                repository.findAll().forEach(System.out::println);

                System.out.println("\n==================== Searching for id = 2 ==================== ");
                System.out.println(repository.byId(2L));

                System.out.println("\n==================== inserting new product ==================== ");
                Product product = new Product();
                product.setName("IBM mechanical Keyboard");
                product.setPrice(1550);
                product.setDate(new Date());
                Category category = new Category();
                category.setId(3L);
                product.setCategory(category);
                product.setSku("10");
                repository.save(product);
                System.out.println("Product successfully saved");

                System.out.println("\n==================== update product ==================== ");
                product = new Product();
                product.setId(5L);
                product.setName("IBM mechanical Keyboard");
                product.setPrice(1000);
                category = new Category();
                category.setId(3L);
                product.setCategory(category);
                product.setSku("11");
                repository.save(product);
                System.out.println("Product successfully updated");

                System.out.println("==================== list / findAll ==================== ");
                repository.findAll().forEach(System.out::println);
                conn.commit();

            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }

        }
    }

}

