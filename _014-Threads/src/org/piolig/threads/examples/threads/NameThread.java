package org.piolig.threads.examples.threads;

public class NameThread extends Thread {

    public NameThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Run method of the thread started " + getName());

        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName());
        };
        System.out.println("Thread finished");

    }
}
