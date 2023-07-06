package org.piolig.pooexceptions.example;

public class Calculator {

    public double divide(int dividend, int divisor) throws ZeroDivisionException {
        if (divisor == 0) {
            throw new ZeroDivisionException("Can't divide by zero!");
        }
        return dividend / (double)divisor;
    }

    public double divide(String dividend, String divisor) throws
            ZeroDivisionException, FormatNumberException {
        try {
            int intDividend = Integer.parseInt(dividend);
            int intDivisor = Integer.parseInt(divisor);
            return this.divide(intDividend, intDivisor);
        } catch (NumberFormatException nfe) {
            throw new FormatNumberException("Only numbers allowed for dividend and divisor");
        }


    }

}
