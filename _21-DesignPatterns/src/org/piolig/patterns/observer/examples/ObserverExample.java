package org.piolig.patterns.observer.examples;

import org.piolig.patterns.observer.Corporation;

public class ObserverExample {
    public static void main(String[] args) {

        Corporation google = new Corporation("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("John:" + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Andres:" + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Maria:" + observable);
        });

        google.modifyPrice(2000);

    }
}
