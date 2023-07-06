package org.piolig.pooexceptions.example;

import javax.swing.*;

public class ExceptionsExample {
    public static void main(String[] args) {


        // This will throw an ArithmeticException and will break the app (RuntimeException)
/*        int division = 10/0;
        System.out.println(division);*/

        // But we can solve this by using handling the exception

        Calculator cal = new Calculator();

        String dividendInput = JOptionPane.showInputDialog("Please, enter an integer value for the dividend");
        String divisorInput = JOptionPane.showInputDialog("Please, enter an integer value for the divisor");
        int divisor;
        double division;

        //double division = cal.divide(10, divisor);

        try {
            /*divisor = Integer.parseInt(value);
            division = cal.divide(10, divisor);
            System.out.println("division = " + division);*/

            double division2 = cal.divide(dividendInput, divisorInput);
            System.out.println("division2 = " + division2);

        } catch (NumberFormatException nfe) {
            System.out.println("An exception occured. Please enter an integer numeric value. Exception:" + nfe.getMessage());
            main(args);
        } catch (FormatNumberException e) {
            System.out.println("An exception occurred: " + e.getMessage());
            e.printStackTrace(System.out);
        } catch (ZeroDivisionException zde) {
            System.out.println(String.format("We captured the exception at runtime: %s", zde.getMessage()));
        } finally {
            System.out.println("***This is optional and will run always, with or without exception***");
        }
        System.out.println("***Despite having exceptions, we will able to continue running the application");

        /*We captured the exception at runtime: / by zero
        This is optional and will run always, with or without exception
        Despite this, we were able to continue running the application*/


    }
}
