package poo.piolig.poointerfaces.repository;

public interface SortablePaginableCrudRepository<T> extends SortableRepository<T>,
        PaginableRepository<T>, CrudRepository<T>, CountableRepository {
}
