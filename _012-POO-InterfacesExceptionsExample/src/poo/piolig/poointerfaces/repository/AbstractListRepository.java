package poo.piolig.poointerfaces.repository;

import poo.piolig.poointerfaces.model.GenericEntity;
import poo.piolig.poointerfaces.repository.exceptions.*;

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
    public T getById(Integer id) throws ReadDataAccessException {
        if (id == null || id <= 0) {
            throw new ReadDataAccessException("Not valid id. It must be greater than 0. ");
        }
        T result = null;
        for (T element : dataSource) {
            if (element.getId() != null && element.getId().equals(id)) {
                result = element;
                break;
            }
        }
        if (result == null) {
            throw new ReadDataAccessException("Registry with id: " + id + " doesnt exists.");
        }
        return result;
    }

    @Override
    public void create(T t) throws WriteDataAccessException {
        if (t == null) {
            throw new WriteDataAccessException("Error trying to write null data.");
        }
        if (this.dataSource.contains(t)){
            throw new DuplicateRegistryDataAccessException("Error: object with id " + t.getId() +
                    " already exists in the repository");
        }
        this.dataSource.add(t);
    }


    @Override
    public void delete(Integer id) throws ReadDataAccessException{
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
