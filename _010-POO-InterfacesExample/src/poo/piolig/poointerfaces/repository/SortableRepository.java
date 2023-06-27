package poo.piolig.poointerfaces.repository;

import poo.piolig.poointerfaces.model.Client;

import java.util.List;

public interface SortableRepository {

    // lists clients by a certain field, and in a certain direction
    List<Client> list(String field, Direction dir);


}
