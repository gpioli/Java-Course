package org.piolig.java.jdbc;

import org.piolig.java.jdbc.model.Category;
import org.piolig.java.jdbc.model.Product;
import org.piolig.java.jdbc.repository.CategoryRepositoryImpl;
import org.piolig.java.jdbc.repository.ProductRepository;
import org.piolig.java.jdbc.repository.Repository;
import org.piolig.java.jdbc.service.CatalogService;
import org.piolig.java.jdbc.service.Service;
import org.piolig.java.jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class JDBCExampleOptimizedTrx {
    public static void main(String[] args) throws SQLException {

        Service service = new CatalogService();
        System.out.println("==================== list / findAll ==================== ");
        service.listAll().forEach(System.out::println);
        System.out.println("==================== Insert new category ==================== ");
        Category category = new Category();
        category.setName("Lighting");

        System.out.println("\n==================== inserting new product ==================== ");
        Product product = new Product();
        product.setName("Desktop led lamp");
        product.setPrice(990);
        product.setDate(new Date());
        product.setSku("18");
        service.saveProductWithCategory(product, category);
        System.out.println("Product successfully saved" + product.getId());

        System.out.println("==================== list / findAll ==================== ");
        service.listAll().forEach(System.out::println);

    }

}



