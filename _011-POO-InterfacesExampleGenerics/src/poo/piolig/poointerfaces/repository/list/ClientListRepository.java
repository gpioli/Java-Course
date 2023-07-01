package poo.piolig.poointerfaces.repository.list;

import poo.piolig.poointerfaces.model.Client;
import poo.piolig.poointerfaces.repository.AbstractListRepository;
import poo.piolig.poointerfaces.repository.Direction;

import java.util.ArrayList;
import java.util.List;

public class ClientListRepository extends AbstractListRepository<Client> {


    @Override
    public void edit(Client client) {
        Client clientToEdit = this.getById(client.getId());
        clientToEdit.setName(client.getName());
        clientToEdit.setLastName(client.getLastName());
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


}
