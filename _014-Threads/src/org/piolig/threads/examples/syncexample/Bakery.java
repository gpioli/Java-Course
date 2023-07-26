package org.piolig.threads.examples.syncexample;

public class Bakery {

    private String bread;
    private boolean available;

    public synchronized void bake(String flour){
        while(available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.bread = flour;
        System.out.println("Bakery bakes: " + this.bread);
        this.available = true;
        notify();
    }

    public synchronized String consume(){
        while (!available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Client consumes: " + this.bread);
        this.available = false;
        notify();
        return bread;
    }


}
