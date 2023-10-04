package org.piolig.patterns.observer.examples;

import org.piolig.patterns.observer.repository.UserRepository;

public class ObserverExampleRepository {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        repo.addObserver((o, u) -> System.out.println("Sending mail to user " + u));
        repo.addObserver((o, u) -> System.out.println("Sending mail to admin"));
        repo.addObserver((o, u) -> System.out.println("Saving " + u + " user info into the log"));
        repo.createUser("Gaston");
    }
}
