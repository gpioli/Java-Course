package poo.piolig.poointerfaces.repository;

import poo.piolig.poointerfaces.model.Client;

import java.util.List;

public interface PaginableRepository {

    // list clients in a certain range
    List<Client> list(int from, int to);

}
