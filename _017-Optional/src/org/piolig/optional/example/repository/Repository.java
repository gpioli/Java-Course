package org.piolig.optional.example.repository;

import org.piolig.optional.example.models.Computer;

import java.util.Optional;

public interface Repository<T> {

    Optional<Computer> filter(String name);

}
