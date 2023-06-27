package poo.piolig.poointerfaces.repository;

public interface SortablePaginableCrudRepository extends SortableRepository,
        PaginableRepository, CrudRepository, CountableRepository {
}
