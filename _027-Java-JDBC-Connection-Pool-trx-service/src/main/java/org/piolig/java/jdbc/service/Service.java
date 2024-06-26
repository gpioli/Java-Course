package org.piolig.java.jdbc.service;

import org.piolig.java.jdbc.model.Category;
import org.piolig.java.jdbc.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface Service {

    List<Product> findAll() throws SQLException;
    Product byId(Long id) throws SQLException;

    Product save(Product product) throws SQLException;

    void delete(Long id) throws SQLException;
    List<Category> listCategory() throws SQLException;
    Category byIdCategory(Long id) throws SQLException;
    Category saveCategory(Category category) throws SQLException;
    void deleteCategory(Long id) throws SQLException;

    void saveProductWithCategory(Product product, Category category) throws SQLException;

}

