package org.piolig.threads.model;


import java.util.concurrent.TimeUnit;

public class AlphaNumericTask implements Runnable{

    Type type;

    String alphabet = "abcdefghijlmnopqrstuvwxyz";

    public AlphaNumericTask(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public void run() {
        if (type.equals(Type.LETTER)){
            for (char c : alphabet.toCharArray()) {
                System.out.println(c);
                if (c == 'd'){
                    try {
                        TimeUnit.MILLISECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        else {
            for(int i = 0; i < 10; i++){
                System.out.println(i);
                if (i % 2 == 0) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
