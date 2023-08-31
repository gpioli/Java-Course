package org.piolig.optional.example;

import org.piolig.optional.example.models.Computer;
import org.piolig.optional.example.repository.ComputerRepository;
import org.piolig.optional.example.repository.Repository;

import java.util.Optional;

public class RepositoryExampleOrElseMethod {
    public static void main(String[] args) {
        Repository<Computer> repository = new ComputerRepository();

        Computer def = new Computer("Default PC", "Clon");

        Computer pc = repository.filter("rog").orElse(defaultValue());

        System.out.println(pc);

        // using lambda
        pc = repository.filter("macbook pro").orElseGet(RepositoryExampleOrElseMethod::defaultValue);
        System.out.println(pc);

    }

    // lets create a static method

    public static Computer defaultValue(){
        System.out.println("Obtaining default value");
        return new Computer("HP Omen", "LA001");
    }


}
