package org.piolig.optional.example;

import org.piolig.optional.example.models.Computer;
import org.piolig.optional.example.models.Manufacturer;
import org.piolig.optional.example.models.Processor;
import org.piolig.optional.example.repository.ComputerRepository;
import org.piolig.optional.example.repository.Repository;

import java.util.NoSuchElementException;

public class RepositoryExampleMapFilter {
    public static void main(String[] args) {

        Repository<Computer> repository = new ComputerRepository();


        String f = repository.filter("asus")
                .flatMap(Computer::getProcessor)
                .flatMap(Processor::getManufacturer)
                .filter(manuf -> "intel".equalsIgnoreCase(manuf.getName()))
                .map(Manufacturer::getName)
                .orElse("Unknown");

        System.out.println(f);


    }
}
