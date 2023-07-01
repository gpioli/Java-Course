package poo.piolig.poointerfaces;

import poo.piolig.poointerfaces.model.Client;
import poo.piolig.poointerfaces.model.Product;
import poo.piolig.poointerfaces.repository.Direction;
import poo.piolig.poointerfaces.repository.SortablePaginableCrudRepository;
import poo.piolig.poointerfaces.repository.list.ClientListRepository;
import poo.piolig.poointerfaces.repository.list.ProductListRepository;

import java.util.List;

public class ProductRepositoryExample {
    public static void main(String[] args) {

        SortablePaginableCrudRepository<Product> repo = new ProductListRepository();
        repo.create(new Product("chair", 50.52));
        repo.create(new Product("table", 18));
        repo.create(new Product("lamp", 20));
        repo.create(new Product("notebook", 500));

        List<Product> products = repo.list();

        System.out.println("\n===== Total =====");
        System.out.println("Total de registros: " + repo.total() + "\n");
        products.forEach(System.out::println);

        System.out.println("\n===== Paginable =====");
        System.out.println("\nPrinting 2-4 registres:");

        // This should show Jano, Bea and Luci
        List<Product> paginable = repo.list(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("\n===== Sort descr ASC =====");
        List<Product> clientsAscOrder = repo.list("description", Direction.ASC);
        clientsAscOrder.forEach(System.out::println);

        System.out.println("\n===== Sort descr DESC =====");
        repo.list("description", Direction.DESC).forEach(System.out::println);

        System.out.println("\n===== Sort price ASC =====");
        repo.list("price", Direction.ASC).forEach(System.out::println);

        System.out.println("\n===== Sort price DESC =====");
        repo.list("price", Direction.DESC).forEach(System.out::println);


        System.out.println("\n===== Edit =====");
        Product lampEdit = new Product("Desk lamp", 23);
        lampEdit.setId(3);

        repo.edit(lampEdit);

        Product lamp = repo.getById(3);
        System.out.println(lamp);

        System.out.println("");
        products.forEach(System.out::println);

        System.out.println("\n===== Delete =====");
        System.out.println("\nDeleting 3rd registre: ");
        repo.delete(3);
        repo.list().forEach(System.out::println);

        System.out.println("\n===== Total =====");
        System.out.println("Total de registros: " + repo.total());
    }
}
