package org.piolig.patterns.observer.repository;

import org.piolig.patterns.observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class UserRepository extends Observable {
    private List<String> repository = new ArrayList<>();
    public void createUser(String user){
        repository.add(user);
        notifyObservers(user);
    }

}
