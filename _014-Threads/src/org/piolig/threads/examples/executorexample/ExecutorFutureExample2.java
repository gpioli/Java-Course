package org.piolig.threads.examples.executorexample;

import java.util.concurrent.*;

public class ExecutorFutureExample2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        //ExecutorService executor = Executors.newSingleThreadExecutor();
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);

        System.out.println("--------------------");
        System.out.println("Size of the threads pool: " + executor.getPoolSize());
        System.out.println("Amount of tasks in the queue: " + executor.getQueue().size());

        Callable<String> task = () -> {
            System.out.println("Starting task 1...");

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

        Callable<Integer> task2 = () -> {
            System.out.println("Starting task number 2...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };


        Future<String> result = executor.submit(task);

        Future<String> result2 = executor.submit(task);
        Future<Integer> result3 = executor.submit(task2);

        // Once all tasks are finished (including polled ones)
        executor.shutdown();

        System.out.println("Continuing main method execution (1)");

        //System.out.println(result.isDone());
        // get() methods awaits for the result to be available to continue with the execution of the program
        while( !(result.isDone() && result2.isDone() && result3.isDone())){
            System.out.println(String.format("Result of task 1: %s - Result of task 2: %s - Result of task 3: %s",
                    result.isDone()? "finished" : "in process",
                    result2.isDone() ? "finished" : "in process",
                    result3.isDone() ? "finished" : "in process"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("Obtaining result of the task 1: " + result.get());
        System.out.println("Task 1 finished: " + result.isDone());

        System.out.println("Obtaining result of the task 2: " + result.get());
        System.out.println("Task 1 finished: " + result.isDone());

        System.out.println("Obtaining result of the task 3: " + result.get());
        System.out.println("Task 1 finished: " + result.isDone());

    }
}
