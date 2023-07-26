package org.piolig.threads.examples.timerexample;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TaskSchedulingExample {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask(){

            @Override
            public void run() {
                System.out.println("Task executed on: " + new Date() + ". Name of the thread: " +
                        Thread.currentThread().getName());
                System.out.println("Time finished");
                timer.cancel();
            }
        }, 5000);

        System.out.println("We are scheduling a task that will start in 5 seconds: ");

    }
}
