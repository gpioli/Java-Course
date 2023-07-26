package org.piolig.threads.examples;

import org.piolig.threads.examples.threads.NameThread;

public class ExtendThreadExample {
    public static void main(String[] args) throws InterruptedException {

    Thread thread = new NameThread("John Doe");

    // NEW
    System.out.println(thread.getState());

    thread.start();
    //Thread.sleep(2);

    Thread thread2 = new NameThread("Maria");
    thread2.start();


    Thread thread3 = new NameThread("Pepe");
    thread3.start();
    // RUNNABLE
    System.out.println(thread.getState());




    }
}
