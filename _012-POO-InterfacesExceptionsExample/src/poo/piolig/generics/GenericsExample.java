package poo.piolig.generics;

import poo.piolig.poointerfaces.model.Client;
import poo.piolig.poointerfaces.model.PremiumClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Andres", "Guzman"));

        Client andres = clients.iterator().next();

        Client[] clientsArray = {new Client("Luci", "Martinez"),
                new Client("Andres", "Guzman")};

        Integer[] integersArray = {1, 2, 3};

        List<Client> clientsList = fromArrayToList(clientsArray);
        List<Integer> integersList = fromArrayToList(integersArray);

        clientsList.forEach(System.out::println);
        integersList.forEach(System.out::println);

        List<String> names = fromArrayToList(new String[]{"Andres", "Pepe", "Luci", "Bea", "John"}, integersArray);
        names.forEach(System.out::println);

        List<PremiumClient> premiumClientList = fromArrayToList(
                new PremiumClient[]{new PremiumClient("Paco", "Fernandez")});

        printClients(clients);
        printClients(clientsList);
        printClients(premiumClientList);

        System.out.println("Max of 1, 9 and 4 is: " + max(1, 9, 4));
        System.out.println("Max of 3.9, 11.6 and 7.78 is: " + max(3.9, 11.6, 7.78));
        System.out.println("Max of carrot, strawberries and apple is: " + max("carrot", "strawberries", "apple"));

    }

    // method with generics for converting data
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }


    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }


    public static <T extends Client & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }



    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G element: x){
            System.out.println(element);
        }
        return Arrays.asList(c);
    }

    public static void printClients(List<? extends Client> clients){
        clients.forEach(System.out::println);
    }

    public static <T extends Comparable<T>>  T max(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
