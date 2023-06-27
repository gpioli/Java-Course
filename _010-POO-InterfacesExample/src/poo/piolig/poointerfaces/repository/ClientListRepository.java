package poo.piolig.poointerfaces.repository;

import poo.piolig.poointerfaces.model.Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientListRepository implements SortablePaginableCrudRepository {

    private List<Client> dataSource;

    public ClientListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Client> list() {
        return dataSource;
    }

    @Override
    public Client getClientById(Integer id) {
        Client result = null;
        for (Client cli : dataSource) {
            if (id != null && cli.getId().equals(id)) {
                result = cli;
                break;
            }
        }
        return result;
    }

    @Override
    public void create(Client client) {
        this.dataSource.add(client);
    }

    @Override
    public void edit(Client client) {
        Client clientToEdit = this.getClientById(client.getId());
        clientToEdit.setName(client.getName());
        clientToEdit.setLastName(client.getLastName());
    }

    @Override
    public void delete(Integer id) {
        this.dataSource.remove(getClientById(id));

    }

    @Override
    public List<Client> list(String field, Direction dir) {
        List<Client> orderedList = new ArrayList<>(this.dataSource);
        orderedList.sort((Client a, Client b) -> {
                int result = 0;
                if (dir == Direction.ASC) {
                    result = this.order(field, a, b);
                } else if (dir == Direction.DESC) {
                    result = this.order(field, b, a);

                }

                return result;

        });
        return orderedList;
    }

    @Override
    public List<Client> list(int from, int to) {

        return dataSource.subList(from, to);
    }

    public static int order(String field, Client a, Client b) {
        int result = 0;
        switch (field) {
            case "id":
                result = a.getId().compareTo(b.getId());
                break;
            case "name":
                result = a.getName().compareTo(b.getName());
                break;
            case "lastName":
                result = a.getLastName().compareTo(b.getLastName());
                break;
        }
        return result;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
