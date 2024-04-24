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

        try (Connection conn = DBConnection.getConnection()) {
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                Repository<Category> categoryRepository = new CategoryRepositoryImpl(conn);
                System.out.println("============= Insert new category =============");
                Category category = new Category();
                category.setName("Electrohogar");
                Category newCategory = categoryRepository.save(category);
                System.out.println("Category updated successfully: " + newCategory.getId());

                Repository<Product> repository = new ProductRepository(conn);
                System.out.println("============= list / findAll =============");
                repository.findAll().forEach(System.out::println);

                System.out.println("============= get by id =============");
                System.out.println(repository.byId(1L));

                System.out.println("============= insert new product =============");
                Product product = new Product();
                product.setName("Samsung Fridge");
                product.setDate(new Date());
                product.setPrice(10000);
                product.setCategory(newCategory);
                product.setSku("abcde12458");
                repository.save(product);
                System.out.println("Product successfully saved");

                System.out.println("============= Update product =============");
                product = new Product();
                product.setName("Cosair Keyboard k95");
                product.setPrice(1000);
                product.setSku("abcdef123f");
                product.setCategory(newCategory);
                product.setDate(new Date());
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



