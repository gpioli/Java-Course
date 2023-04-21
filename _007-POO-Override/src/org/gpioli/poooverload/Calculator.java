package org.gpioli.poooverload;

public class Calculator {

    // We declare private the constructor, in order it cannot be instantiated
    private Calculator(){

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // Adding several arguments
    public static int sum(int...arguments){
        int total = 0;
        for(int argument: arguments){
            total += argument;
        }
        return total;
    }

    // Adding several arguments, from different data types:
    public static float sum(float a, int...arguments){
        float total = a;
        for(int argument: arguments){
            total += argument;
        }
        return total;
    }

    public static double sum(double... varargs){
        double total = 0.0;
        for (double num: varargs){
            total += num;
        }
        return total;
    }

    public static float sum(float x, float y) {
        return x + y;
    }

    public static float sum(int i, float j) {
        return i + j;
    }

    public static float sum(float i, int j) {
        return i + j;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(String i, String j) {
        int result;
        try {
            result = Integer.parseInt(i) + Integer.parseInt(j);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
