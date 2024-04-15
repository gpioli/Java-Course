package org.piolig.java.jdbc;

import org.piolig.java.jdbc.model.Category;
import org.piolig.java.jdbc.model.Product;
import org.piolig.java.jdbc.repository.CategoryRepositoryImpl;
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
        try (Connection conn = DBConnection.getConnection()) {
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }


            try {
                Repository<Category> categoryRepository = new CategoryRepositoryImpl(conn);
                System.out.println("==================== Insert new category ==================== ");
                Category category = new Category();
                category.setName("Whitelabel");
                Category newCategory = categoryRepository.save(category);
                System.out.println("Category successfully saved: " + newCategory.getId());

                Repository<Product> repository = new ProductRepository(conn);
                System.out.println("==================== list / findAll ==================== ");
                repository.findAll().forEach(System.out::println);

                System.out.println("\n==================== Searching for id = 2 ==================== ");
                System.out.println(repository.byId(2L));

                System.out.println("\n==================== inserting new product ==================== ");
                Product product = new Product();
                product.setName("Samsung fridge");
                product.setPrice(9900);
                product.setDate(new Date());
                product.setSku("12");

                product.setCategory(newCategory);
                repository.save(product);
                System.out.println("Product successfully saved" + product.getId());

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


