package org.piolig.java.jdbc.repository;

import org.piolig.java.jdbc.model.Category;
import org.piolig.java.jdbc.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements Repository<Product> {

    private Connection conn;

    public ProductRepository() {
    }

    @Override
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public ProductRepository(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Product> findAll() throws SQLException {
        List<Product> products = new ArrayList<>();

        try (
                Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery("SELECT p.*, c.name as category FROM products as p " +
                     "JOIN categories as c ON p.category_id = c.id")) {

            while (resultSet.next()){
                Product p = createProduct(resultSet);
                products.add(p);
            }

        }

        return products;
    }

    @Override
    public Product byId(Long id) throws SQLException {
        Product product = null;
        try(PreparedStatement preparedStatement = conn.
                prepareStatement(
                "SELECT p.*, c.name as category FROM products as p " +
                        "JOIN categories as c ON p.category_id = c.id WHERE p.id = ?")) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                if (resultSet.next()) {
                    product = createProduct(resultSet);
                }
            }
        }

        return product;
    }

    // save method does both things: updates registries or adds new registries
    @Override
    public Product save(Product product) throws SQLException {
        String sql;
        if (product.getId() != null && product.getId() > 0) {
            sql = "UPDATE products set name= ?, price= ?, category_id= ?, sku= WHERE id= ?";
        } else {
            sql = "INSERT INTO products(name, price, category_id, sku, registry_date) VALUES(?, ?, ?, ?, ?)";
        }
        try(
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ) {

            stmt.setString(1, product.getName());
            stmt.setInt(2, product.getPrice());
            stmt.setLong(3, product.getCategory().getId());
            stmt.setString(4, product.getSku());
            if (product.getId() != null && product.getId() > 0) {
                stmt.setLong(5, product.getId());
            } else {
                stmt.setDate(5, new Date(product.getDate().getTime()));
            }

            stmt.executeUpdate();

            if (product.getId() != null) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        product.setId(rs.getLong(1));
                    }
                }
            }

        }
        return product;

    }

    @Override
    public void delete(Long id) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("DELETE FROM products WHERE id=?")) {
            statement.setLong(1, id);
            statement.executeUpdate();
        }
    }

    private Product createProduct(ResultSet resultSet) throws SQLException {
        Product p = new Product();
        p.setId(resultSet.getLong("id"));
        p.setName(resultSet.getString("name"));
        p.setPrice(resultSet.getInt("price"));
        p.setDate(resultSet.getDate("registry_date"));
        p.setSku(resultSet.getString("sku"));
        Category category = new Category();
        category.setId(resultSet.getLong("category_id"));
        category.setName(resultSet.getString("category"));
        p.setCategory(category);
        return p;
    }

}
