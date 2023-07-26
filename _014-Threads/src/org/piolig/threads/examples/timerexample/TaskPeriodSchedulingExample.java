package org.piolig.threads.examples.timerexample;


import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskPeriodSchedulingExample {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger atomicCounter = new AtomicInteger(3);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            //private int counter = 3;

            @Override
            public void run() {
                int i = atomicCounter.getAndDecrement();
                if (i > 0) {
                    toolkit.beep();
                    System.out.println("Periodic task n°: " + i  + " executed on: " + new Date() + ". Name of the thread: " +
                            Thread.currentThread().getName());
                    //counter--;
                } else {
                    System.out.println("Time finished");
                    timer.cancel();
                }
            }


        }, 1000, 5000);


        System.out.println("We are scheduling a task that will start in a second (literally): ");

    }
}
