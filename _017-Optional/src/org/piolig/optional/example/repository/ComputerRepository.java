package org.piolig.optional.example.repository;

import org.piolig.optional.example.models.Computer;
import org.piolig.optional.example.models.Manufacturer;
import org.piolig.optional.example.models.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerRepository implements Repository<Computer>{

    private List<Computer> dataSource;

    public ComputerRepository() {
        dataSource = new ArrayList<>();
        Processor proc = new Processor("Ryzen 9", new Manufacturer("AMD"));
        Computer asus = new Computer("Asus ROG", "Strix G512");
        asus.setProcessor(proc);
        dataSource.add(asus);
        dataSource.add(new Computer("MacBook Pro", "MVVK2CI"));
    }

    @Override
    public Optional<Computer> filter(String name) {
        return dataSource.stream().filter(c -> c.getName().toLowerCase().contains(name.toLowerCase())).findFirst();
        /*for(Computer c: dataSource){
            if(c.getName().equalsIgnoreCase(name)){
                return Optional.of(c);
            }
        }

        return Optional.empty();*/
    }
}
