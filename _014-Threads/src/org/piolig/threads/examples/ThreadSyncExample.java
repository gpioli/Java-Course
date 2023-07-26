package org.piolig.threads.examples;

import org.piolig.threads.examples.runnable.PrintPhrases;

public class ThreadSyncExample {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new PrintPhrases("Hello! ", "Whats up!?")).start();
        new Thread(new PrintPhrases("Who are ", "you!?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new PrintPhrases("Thank ", "you friend!"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());



    }

    // Here we modify the modifier, adding synchronized. This indicates that the threads must run in order, one at a
    // time:
    public synchronized static void printPhrases(String phrase1, String phrase2){
        System.out.print(phrase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(phrase2);
    }

}
