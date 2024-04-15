package org.piolig.java.jdbc.repository;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();
    T byId(Long id);
    void save(T t);
    void delete(Long id);

}
