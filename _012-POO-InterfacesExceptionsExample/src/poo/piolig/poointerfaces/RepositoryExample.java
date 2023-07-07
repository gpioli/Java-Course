package poo.piolig.poointerfaces;

import poo.piolig.poointerfaces.model.Client;
import poo.piolig.poointerfaces.repository.*;
import poo.piolig.poointerfaces.repository.exceptions.DataAccessException;
import poo.piolig.poointerfaces.repository.exceptions.DuplicateRegistryDataAccessException;
import poo.piolig.poointerfaces.repository.exceptions.ReadDataAccessException;
import poo.piolig.poointerfaces.repository.exceptions.WriteDataAccessException;
import poo.piolig.poointerfaces.repository.list.ClientListRepository;

import java.util.List;

public class RepositoryExample {
    public static void main(String[] args) {

        try {

            SortablePaginableCrudRepository<Client> repo = new ClientListRepository();
            repo.create(new Client("Jano", "Perez"));
            repo.create(new Client("Bea", "Gonzalez"));
            repo.create(new Client("Luci", "Martinez"));
            Client andres = new Client("Andres", "Guzman");
            repo.create(andres);
            repo.create(andres);

            //repo.create(null);

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

            Client bea = repo.getById(2);
            System.out.println(bea);

            System.out.println("\n===== delete =====");
            repo.delete(2);
            repo.list().forEach(System.out::println);

            System.out.println("\n===== Total =====");
            System.out.println("Total de registros: " + repo.total());
        } catch (DuplicateRegistryDataAccessException d) {
            System.out.println("Write error: " + d.getMessage());
            d.printStackTrace();
        } catch (ReadDataAccessException r) {
            System.out.println("Read error: " + r.getMessage());
            r.printStackTrace();
        } catch (WriteDataAccessException w) {
            System.out.println("Write error: " + w.getMessage());
            w.printStackTrace();
        } catch (DataAccessException e) {
            System.out.println("Generic error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
