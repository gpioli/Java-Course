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
        try (Connection conn = DBConnection.getInstance()) {
            if(conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                Repository<Product> repository = new ProductRepository();
                System.out.println("============= list / find all =============");
                repository.findAll().forEach(System.out::println);

                System.out.println("============= get by id =============");
                System.out.println(repository.byId(1L));

                System.out.println("============= insert new product =============");
                Product product = new Product();
                product.setName("IBM mechanical keyboard - Advanced");
                product.setPrice(1865);
                product.setDate(new Date());
                Category category = new Category();
                category.setId(3L);
                product.setCategory(category);
                product.setSku("abcde12348");
                repository.save(product);
                System.out.println("Product successfully saved");

                System.out.println("============= Update product =============");
                product = new Product();
                product.setId(5L);
                product.setName("Cosair Keyboard k95");
                product.setPrice(1000);
                product.setSku("abcdef1234");
                category = new Category();
                category.setId(2L);
                product.setCategory(category);
                repository.save(product);
                System.out.println("Product updated successfully");

                repository.findAll().forEach(System.out::println);
                conn.commit();
            } catch (SQLException exception) {
                conn.rollback();
                exception.printStackTrace();
            }
        }
    }
}