package poo.piolig.poointerfaces.repository;

import poo.piolig.poointerfaces.model.GenericEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends GenericEntity> implements SortablePaginableCrudRepository<T> {

    protected List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> list() {
        return dataSource;
    }

    @Override
    public T getById(Integer id) {
        T result = null;
        for (T element : dataSource) {
            if (element.getId() != null && element.getId().equals(id)) {
                result = element;
                break;
            }
        }
        return result;
    }

    @Override
    public void create(T t) {
        this.dataSource.add(t);
    }


    @Override
    public void delete(Integer id) {
        this.dataSource.remove(getById(id));

    }


    @Override
    public List<T> list(int from, int to) {

        return dataSource.subList(from, to);
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
