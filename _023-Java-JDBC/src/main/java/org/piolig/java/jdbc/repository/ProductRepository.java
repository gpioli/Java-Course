package org.piolig.java.jdbc.repository;

import org.piolig.java.jdbc.model.Category;
import org.piolig.java.jdbc.model.Product;
import org.piolig.java.jdbc.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product> {

    private Connection getConnection() throws SQLException {
        return DBConnection.getInstance();
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();

        try (Statement stmt = getConnection().createStatement();
             ResultSet resultSet = stmt.executeQuery("SELECT p.*, c.name as category FROM products as p " +
                     "JOIN categories as c ON p.category_id = c.id")) {

            while (resultSet.next()){
                Product p = createProduct(resultSet);
                products.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    @Override
    public Product byId(Long id) {
        Product product = null;
        try(PreparedStatement preparedStatement = getConnection().
                prepareStatement(
                "SELECT p.*, c.name as category FROM products as p " +
                        "JOIN categories as c ON p.category_id = c.id WHERE p.id = ?")) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                if (resultSet.next()) {
                    product = createProduct(resultSet);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return product;
    }

    // save method does both things: updates registries or adds new registries
    @Override
    public void save(Product product) {
        String sql;
        if (product.getId() != null && product.getId() > 0) {
            sql = "UPDATE products set name= ?, price= ?, category_id= ? WHERE id= ?";
        } else {
            sql = "INSERT INTO products(name, price, category_id, registry_date) VALUES(?, ?, ?, ?)";
        }
        try(
                PreparedStatement stmt = getConnection().prepareStatement(sql);
                ) {

            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getPrice());
            stmt.setLong(3, product.getCategory().getId());
            if (product.getId() != null && product.getId() > 0) {
                stmt.setLong(4, product.getId());
            } else {
                stmt.setDate(4, new Date(product.getDate().getTime()));
            }

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(Long id) {
        try (PreparedStatement statement = getConnection().prepareStatement("DELETE FROM products WHERE id=?")) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Product createProduct(ResultSet resultSet) throws SQLException {
        Product p = new Product();
        p.setId(resultSet.getLong("id"));
        p.setName(resultSet.getString("name"));
        p.setPrice(resultSet.getInt("price"));
        p.setDate(resultSet.getDate("registry_date"));
        Category category = new Category();
        category.setId(resultSet.getLong("category_id"));
        category.setName(resultSet.getString("category"));
        p.setCategory(category);
        return p;
    }

}
