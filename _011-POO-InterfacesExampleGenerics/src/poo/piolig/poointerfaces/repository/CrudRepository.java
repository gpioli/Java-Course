package poo.piolig.poointerfaces.repository;

import java.util.List;

public interface CrudRepository<T> {

    // list all registers:
    List<T> list();

    // get a certain client by its id
    T getById(Integer id);
    // create a client
    void create(T element);
    // edit a client
    void edit(T element);
    // delete a client
    void delete(Integer id);

}
