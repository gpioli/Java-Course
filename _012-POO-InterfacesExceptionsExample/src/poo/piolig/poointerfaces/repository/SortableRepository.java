package poo.piolig.poointerfaces.repository;

import java.util.List;

public interface SortableRepository<T> {

    // lists clients by a certain field, and in a certain direction
    List<T> list(String field, Direction dir);


}
