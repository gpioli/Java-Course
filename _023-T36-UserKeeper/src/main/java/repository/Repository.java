package repository;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    public void update(T t);
    public void delete(int id) throws SQLException;
    public void addNew(T t);
    public List<T> findAll();

}
