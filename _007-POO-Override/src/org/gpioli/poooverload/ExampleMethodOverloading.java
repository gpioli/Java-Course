package org.gpioli.poooverload;

import static org.gpioli.poooverload.Calculator.sum;

public class ExampleMethodOverloading {
    public static void main(String[] args) {

        //Calculator cal = new Calculator();

        System.out.println("Sum int: " + sum(10, 5));
        System.out.println("Sum float: " + sum(10.0f, 5f));
        System.out.println("Sum float-int: " + sum(10.0f, 5));
        System.out.println("Sum int-float: " + sum(10, 5.0F));
        System.out.println("Sum double: " + sum(10.0, 5.0));
        System.out.println("Sum String: " + sum("10", "5"));
        System.out.println("Sum three int: " + sum(10, 5, 3));
        System.out.println("Sum three int: " + sum(10, 5, 3, 4, 5, 6));
        System.out.println("Sum three int: " + sum(10.5F, 5, 3, 4, 5, 6));
        System.out.println("Sum three int: " + sum(10.0, 5.0, 3, 4, 5, 6));

        // What happens when we pass parameters that don't match with any method?
        // Type automatic conversion
        System.out.println("Sum long: " + sum(10L, 5L));
        System.out.println("Sum int: " + sum(10, '@')); // Here we input a char, and what happens is that
        // we are summing the decimal representation:
        // https://en.wikipedia.org/wiki/List_of_Unicode_characters
        // @ -> decimal rep: 64
        System.out.println("Sum float-int: " + sum(10F, '@'));

    }
}
