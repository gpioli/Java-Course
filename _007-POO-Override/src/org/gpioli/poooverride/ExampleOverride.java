package org.gpioli.poooverride;

public class ExampleOverride {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("Sum int: " + cal.sum(10, 5));
        System.out.println("Sum float: " + cal.sum(10.0f, 5f));
        System.out.println("Sum float-int: " + cal.sum(10.0f, 5));
        System.out.println("Sum int-float: " + cal.sum(10, 5.0F));
        System.out.println("Sum double: " + cal.sum(10.0, 5.0));
        System.out.println("Sum String: " + cal.sum("10", "5"));
        System.out.println("Sum three int: " + cal.sum(10, 5, 3));
        System.out.println("Sum three int: " + cal.sum(10, 5, 3, 4, 5, 6));
        System.out.println("Sum three int: " + cal.sum(10.5F, 5, 3, 4, 5, 6));
        System.out.println("Sum three int: " + cal.sum(10.0, 5.0, 3, 4, 5, 6));

        // What happens when we pass parameters that don't match with any method?
        // Type automatic conversion
        System.out.println("Sum long: " + cal.sum(10L, 5L));
        System.out.println("Sum int: " + cal.sum(10, '@')); // Here we input a char, and what happens is that
        // we are summing the decimal representation:
        // https://en.wikipedia.org/wiki/List_of_Unicode_characters
        // @ -> decimal rep: 64
        System.out.println("Sum float-int: " + cal.sum(10F, '@'));

    }
}
