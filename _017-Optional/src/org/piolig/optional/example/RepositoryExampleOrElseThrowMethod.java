package org.piolig.optional.example;

import org.piolig.optional.example.models.Computer;
import org.piolig.optional.example.repository.ComputerRepository;
import org.piolig.optional.example.repository.Repository;

import java.util.NoSuchElementException;
import java.util.Optional;

public class RepositoryExampleOrElseThrowMethod {
    public static void main(String[] args) {
        Repository<Computer> repository = new ComputerRepository();


        Computer pc = repository.filter("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);


        String archive = "documentpdf";
        String extension = Optional.ofNullable(archive)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archive.lastIndexOf(".") + 1))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(extension);

    }


}
