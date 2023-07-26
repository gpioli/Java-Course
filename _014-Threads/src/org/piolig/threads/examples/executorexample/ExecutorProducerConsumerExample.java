package org.piolig.threads.examples.executorexample;

import org.piolig.threads.examples.syncexample.Bakery;
import org.piolig.threads.examples.syncexample.runnable.Baker;
import org.piolig.threads.examples.syncexample.runnable.Consumer;

import java.util.concurrent.*;

public class ExecutorProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        //ExecutorService executor = Executors.newSingleThreadExecutor();
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("--------------------");
        System.out.println("Size of the threads pool: " + executor.getPoolSize());
        System.out.println("Amount of tasks in the queue: " + executor.getQueue().size());


        Bakery bakery = new Bakery();
        Runnable producer = new Baker(bakery);
        Runnable consumer = new Consumer(bakery);

        Future<?> future1 = executor.submit(producer);
        Future<?> future2 = executor.submit(consumer);


        // Once all tasks are finished (including polled ones)
        executor.shutdown();

    }
}
