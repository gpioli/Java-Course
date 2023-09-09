package org.piolig.datetime.examples;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2011, 9, 23);
        LocalDate date2 = LocalDate.of(2020, 11, 25);
        // modifying a date (remember that these methods are inmutables, so we need to re-assign them)
        date2 = date2.withMonth(12);

        Period period = Period.between(date1, date2);
        System.out.println("period = " + period);
        System.out.printf("Period between: %s y %s. There are %s years, %s months and %s days.",
                date1, date2, period.getYears(), period.getMonths(), period.getDays());

        /*
        * period = P9Y2M2D
            Period between: 2011-09-23 y 2020-11-25. There are 9 years, 2 months and 2 days.
        * */

    }
}
