package poo.piolig.poointerfaces;

import poo.piolig.poointerfaces.model.Client;
import poo.piolig.poointerfaces.repository.*;

import java.util.List;

public class RepositoryExample {
    public static void main(String[] args) {

        SortablePaginableCrudRepository repo = new ClientListRepository();
        repo.create(new Client("Jano", "Perez"));
        repo.create(new Client("Bea", "Gonzalez"));
        repo.create(new Client("Luci", "Martinez"));
        repo.create(new Client("Andres", "Guzman"));

        List<Client> clients = repo.list();
        clients.forEach(System.out::println);

        System.out.println("\n=====Paginable=====");

        // This should show Jano, Bea and Luci
        List<Client> paginable = repo.list(0, 3);
        paginable.forEach(System.out::println);

        System.out.println("\n===== sort name ASC =====");
        List<Client> clientsAscOrder = repo.list("name", Direction.ASC);
        clientsAscOrder.forEach(System.out::println);

        System.out.println("\n===== sort name DESC =====");
        repo.list("name", Direction.DESC).forEach(System.out::println);

        System.out.println("\n===== sort lastName ASC =====");
        repo.list("lastName", Direction.ASC).forEach(System.out::println);

        System.out.println("\n===== sort lastName DESC =====");
        repo.list("lastName", Direction.DESC).forEach(System.out::println);


        System.out.println("\n===== edit =====");
        Client beaEdit = new Client("Bea", "Mena");
        beaEdit.setId(2);

        repo.edit(beaEdit);

        Client bea = repo.getClientById(2);
        System.out.println(bea);

        System.out.println("\n===== delete =====");
        repo.delete(2);
        repo.list().forEach(System.out::println);

        System.out.println("\n===== Total =====");
        System.out.println("Total de registros: " + repo.total());
    }
}
