package org.piolig.optional.example;

import org.piolig.optional.example.models.Computer;
import org.piolig.optional.example.repository.ComputerRepository;
import org.piolig.optional.example.repository.Repository;

import java.util.Optional;

public class RepositoryExample {
    public static void main(String[] args) {
        Repository<Computer> repository = new ComputerRepository();
        Optional<Computer> pc = repository.filter("asus");

        // tipically null validation
        /*
        if(pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("Not found.");
        }*/

        repository.filter("asus").ifPresent(System.out::println);
        // with java 9+ we could use ifPresentOrElse


        repository.filter("pack").ifPresent(System.out::println);
    }


}
