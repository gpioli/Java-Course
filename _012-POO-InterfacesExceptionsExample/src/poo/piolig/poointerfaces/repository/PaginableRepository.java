package poo.piolig.poointerfaces.repository;

import java.util.List;

public interface PaginableRepository<T> {

    // list clients in a certain range
    List<T> list(int from, int to);

}
