package org.gpioli.poooverride;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(float x, float y) {
        return x + y;
    }

    public float sum(int i, float j) {
        return i + j;
    }

    public float sum(float i, int j) {
        return i + j;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(String i, String j) {
        int result;
        try {
            result = Integer.parseInt(i) + Integer.parseInt(j);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;

    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

}
