package org.piolig.threads.examples.syncexample.runnable;

import org.piolig.threads.examples.syncexample.Bakery;

public class Consumer implements Runnable {

    Bakery bakery;

    public Consumer(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            bakery.consume();
        }
    }
}
