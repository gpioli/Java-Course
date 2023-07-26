package org.piolig.threads.examples.syncexample;

import org.piolig.threads.examples.syncexample.runnable.Baker;
import org.piolig.threads.examples.syncexample.runnable.Consumer;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        new Thread(new Baker(bakery)).start();
        new Thread(new Consumer(bakery)).start();
    }

}
