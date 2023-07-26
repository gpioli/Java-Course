package org.piolig.threads.examples.syncexample.runnable;

import org.piolig.threads.examples.syncexample.Bakery;

import java.util.concurrent.ThreadLocalRandom;

public class Baker implements Runnable{

    private Bakery bakery;

    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bakery.bake("Bread n°: " + i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
