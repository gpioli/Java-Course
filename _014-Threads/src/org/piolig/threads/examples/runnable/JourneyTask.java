package org.piolig.threads.examples.runnable;

public class JourneyTask implements Runnable {

    private String name;

    public JourneyTask(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for(int i=0; i < 10; i++) {
            System.out.println(i + " - " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finally, im going on a trip to: " + name);
    }
}
