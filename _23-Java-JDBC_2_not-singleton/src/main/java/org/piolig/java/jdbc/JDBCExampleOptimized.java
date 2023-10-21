package org.piolig.java.jdbc;

import org.piolig.java.jdbc.model.Category;
import org.piolig.java.jdbc.model.Product;
import org.piolig.java.jdbc.repository.ProductRepository;
import org.piolig.java.jdbc.repository.Repository;
import org.piolig.java.jdbc.util.DBConnection;

import java.sql.*;
import java.util.Date;

public class JDBCExampleOptimized {
    public static void main(String[] args) {

        // try with auto-close
        // this help us avoid handling closing all the used resources, they close automatically
        // also exceptions are handled automatically

        Repository<Product> repository = new ProductRepository();

        System.out.println("==================== list / findAll ==================== ");
        repository.findAll().forEach(System.out::println);

        System.out.println("\n==================== Searching for id = 2 ==================== ");
        System.out.println(repository.byId(2L));

        System.out.println("\n==================== inserting new product ==================== ");
        Product product = new Product();
        product.setName("Notebook ASUS ROG");
        product.setPrice(2250);
        product.setDate(new Date());
        Category category = new Category();
        category.setId(3L);
        product.setCategory(category);
        repository.save(product);
        System.out.println("Product successfully saved");

        System.out.println("==================== list / findAll ==================== ");
        repository.findAll().forEach(System.out::println);


    }
}
