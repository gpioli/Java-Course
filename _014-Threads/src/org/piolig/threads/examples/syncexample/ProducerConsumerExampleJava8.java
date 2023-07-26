package org.piolig.threads.examples.syncexample;

import org.piolig.threads.examples.syncexample.runnable.Baker;
import org.piolig.threads.examples.syncexample.runnable.Consumer;

import java.util.concurrent.ThreadLocalRandom;

public class ProducerConsumerExampleJava8 {

    public static void main(String[] args) {

        Bakery bakery = new Bakery();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bakery.bake("Bread n°: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bakery.consume();
            }
        }).start();
    }

}
