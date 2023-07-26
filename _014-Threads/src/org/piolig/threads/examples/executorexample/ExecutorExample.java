package org.piolig.threads.examples.executorexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
            System.out.println("Begin of the task");
            try {
                System.out.println("Name of the current thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Task finished.");
        };


        executor.submit(task);

        // Once all tasks are finished (including polled ones)
        executor.shutdown();

        System.out.println("Continuing main method execution (1)");
        // This awaits the finishing of all tasks before continuing the main method execution
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Continuing main method execution (2)");

    }
}
