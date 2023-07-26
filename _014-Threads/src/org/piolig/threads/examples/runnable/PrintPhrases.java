package org.piolig.threads.examples.runnable;


import static org.piolig.threads.examples.ThreadSyncExample.*;

public class PrintPhrases implements Runnable {

    String phrase1, phrase2;

    public PrintPhrases(String phrase1, String phrase2) {
        this.phrase1 = phrase1;
        this.phrase2 = phrase2;
    }

    @Override
    public void run() {
        printPhrases(this.phrase1, this.phrase2);
    }
}
