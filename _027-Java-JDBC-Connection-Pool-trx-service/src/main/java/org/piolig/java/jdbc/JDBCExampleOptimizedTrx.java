package org.piolig.java.jdbc;

import org.piolig.java.jdbc.model.Category;
import org.piolig.java.jdbc.model.Product;
import org.piolig.java.jdbc.service.CatalogService;
import org.piolig.java.jdbc.service.Service;

import java.sql.SQLException;
import java.util.Date;

public class JDBCExampleOptimizedTrx {
    public static void main(String[] args) throws SQLException {

        Service service = new CatalogService();
        System.out.println("============= list / findAll =============");
        service.findAll().forEach(System.out::println);
        System.out.println("============= Insert new category =============");
        Category category = new Category();
        category.setName("Lighting");


        System.out.println("============= insert new product =============");
        Product product = new Product();
        product.setName("Desktop LED lamp");
        product.setDate(new Date());
        product.setPrice(990);
        product.setSku("abcdhg2458");
        service.saveProductWithCategory(product, category);

        System.out.println("Product updated successfully");
        service.findAll().forEach(System.out::println);
    }


}



