package org.piolig.threads;

import org.piolig.threads.model.AlphaNumericTask;
import org.piolig.threads.model.Type;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Example {
    public static void main(String[] args) {

        AlphaNumericTask task1 = new AlphaNumericTask(Type.LETTER);
        AlphaNumericTask task2= new AlphaNumericTask(Type.NUMBER);


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("Size of the threads pool: " + executor.getPoolSize());
        System.out.println("Amount of tasks in the queue: " + executor.getQueue().size());
        System.out.println("----------------------------------------------------------------\n");

        System.out.println("---Starting first task---");

        Future<?> future1 = executor.submit(task1);

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("Size of the threads pool: " + executor.getPoolSize());
        System.out.println("Amount of tasks in the queue: " + executor.getQueue().size());
        System.out.println("----------------------------------------------------------------\n");

        System.out.println("---Starting second task---");
        Future<?> future2 = executor.submit(task2);

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("Size of the threads pool: " + executor.getPoolSize());
        System.out.println("Amount of tasks in the queue: " + executor.getQueue().size());
        System.out.println("----------------------------------------------------------------\n");

        System.out.println("Shutdown initiated. Ending tasks");
        executor.shutdown();

    }
}
