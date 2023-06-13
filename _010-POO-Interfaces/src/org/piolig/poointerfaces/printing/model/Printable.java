package org.piolig.poointerfaces.printing.model;

public interface Printable {

    final static String DEFAULT_TEXT = "Printing default value";

    default String print() {
        return DEFAULT_TEXT;
    };

    public static void print(Printable printable) {
        System.out.println(printable.print());
    }



}
