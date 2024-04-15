package org.piolig.java.jdbc.repository;

import org.piolig.java.jdbc.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    List<T> findAll() throws SQLException;
    T byId(Long id) throws SQLException;
    T save(T t) throws SQLException;
    void delete(Long id) throws SQLException;

}
