package org.piolig.threads.examples.executorexample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Running a task in main method");

        executor.schedule(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" Hello world task!");
        }, 2000, TimeUnit.MILLISECONDS);

        System.out.println("Some other task in main method");
        executor.shutdown();


    }
}
