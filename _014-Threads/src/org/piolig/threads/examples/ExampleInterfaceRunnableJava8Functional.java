package org.piolig.threads.examples;

import org.piolig.threads.examples.runnable.JourneyTask;

public class ExampleInterfaceRunnableJava8Functional {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();

        // lambda
        Runnable journey = () -> {

            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finally, im going on a trip to: " + Thread.currentThread().getName());
            System.out.println(main.getState());
        };

        Thread v1 = new Thread(journey, "Easter Island");
        Thread v2 = new Thread(journey, "Robinson Crusoe");
        Thread v3 = new Thread(journey, "Juan Fernandez");
        Thread v4 = new Thread(journey, "Isla de Chiloe");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        // join -> waits for this thread to die
        v1.join();
        v2.join();
        v3.join();
        v4.join();

        //Thread.sleep(10000);
        System.out.println("Continuing main method execution: " + main.getName());


    }
}
