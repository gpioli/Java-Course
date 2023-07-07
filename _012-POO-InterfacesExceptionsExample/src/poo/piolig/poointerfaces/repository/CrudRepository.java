package poo.piolig.poointerfaces.repository;

import poo.piolig.poointerfaces.repository.exceptions.DataAccessException;
import poo.piolig.poointerfaces.repository.exceptions.ReadDataAccessException;

import java.util.List;

public interface CrudRepository<T> {

    // list all registers:
    List<T> list();

    // get a certain client by its id
    T getById(Integer id) throws DataAccessException;
    // create a client
    void create(T element) throws DataAccessException;
    // edit a client
    void edit(T element) throws DataAccessException;
    // delete a client
    void delete(Integer id) throws DataAccessException;

}
