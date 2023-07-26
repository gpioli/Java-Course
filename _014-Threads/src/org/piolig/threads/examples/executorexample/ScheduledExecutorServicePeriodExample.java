package org.piolig.threads.examples.executorexample;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutorServicePeriodExample {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Running a task in main method");

        AtomicInteger counter = new AtomicInteger(5);

        //CountDownLatch lock = new CountDownLatch(5);

        Future<?> future = executor.scheduleAtFixedRate(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //lock.countDown();
                counter.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" Hello world task!");
        }, 1000, 2000, TimeUnit.MILLISECONDS);

        //lock.await();
        //future.cancel(true);

        //TimeUnit.SECONDS.sleep(10);
       while(counter.get() >= 0) {
           if(counter.get()==0){
               future.cancel(true);
               counter.getAndDecrement();
           }
       }
        System.out.println("Some other task in main method");
        executor.shutdown();


    }
}
