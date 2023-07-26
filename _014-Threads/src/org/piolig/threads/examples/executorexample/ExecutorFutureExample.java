package org.piolig.threads.examples.executorexample;

import java.util.concurrent.*;

public class ExecutorFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            System.out.println("Begin of the task");
            try {
                System.out.println("Name of the current thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Task finished.");
            return "Some important result of the task";
        };


        Future<String> result = executor.submit(task);

        // Once all tasks are finished (including polled ones)
        executor.shutdown();

        System.out.println("Continuing main method execution (1)");

        //System.out.println(result.isDone());
        // get() methods awaits for the result to be available to continue with the execution of the program
        while(!result.isDone()){
            System.out.println("Executing task...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println("Obtaining result of the task: " + result.get());

        System.out.println("Task finished: " + result.isDone());


    }
}
