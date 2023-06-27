package poo.piolig.poointerfaces.repository;

import poo.piolig.poointerfaces.model.Client;

import java.util.List;

public interface CrudRepository {

    // list all registers:
    List<Client> list();

    // get a certain client by its id
    Client getClientById(Integer id);
    // create a client
    void create(Client client);
    // edit a client
    void edit(Client client);
    // delete a client
    void delete(Integer id);

}
