package org.piolig.threads.examples;

import org.piolig.threads.examples.runnable.JourneyTask;

public class ExampleInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new JourneyTask("Easter Island")).start();
        new Thread(new JourneyTask("Robinson Crusoe")).start();
        new Thread(new JourneyTask("Juan Fernandez")).start();
        new Thread(new JourneyTask("Isla de Chiloe")).start();

    }
}
