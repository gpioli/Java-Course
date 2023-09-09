package org.piolig.datetime.examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate actualDate = LocalDate.now();
        System.out.println("Actual date: " + actualDate);
        System.out.println("Day: " + actualDate.getDayOfMonth());
        System.out.println("Month: " + actualDate.getMonth());
        System.out.println("Year: " + actualDate.getYear());
        System.out.println("Day of the year: " + actualDate.getDayOfYear());
        System.out.println("Era: " + actualDate.getEra());
        
        actualDate = LocalDate.of(2020, 1, 25);
        System.out.println("actualDate = " + actualDate);

        actualDate = LocalDate.of(2020, Month.NOVEMBER, 11);
        System.out.println("actualDate = " + actualDate);
        
        
        actualDate = LocalDate.parse("2020-02-01");
        System.out.println("actualDate = " + actualDate);

        LocalDate tomorrowDay = LocalDate.now().plusDays(1);
        System.out.println("tomorrowDay = " + tomorrowDay);

        LocalDate previousMonthSameDay = LocalDate.now().minusMonths(1);
        System.out.println("previousMonthSameDay = " + previousMonthSameDay);

        // Another way of doing the same
        previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("previousMonthSameDay = " + previousMonthSameDay);

        DayOfWeek wednesday = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("wednesday = " + wednesday);

        int eleven = LocalDate.of(2020, 11, 11).getDayOfMonth();
        System.out.println("eleven = " + eleven);

        // How to know if a year is leap (biciesto)
        boolean isThisLeapYear = LocalDate.now().isLeapYear();
        System.out.println("leapYear = " + isThisLeapYear);

        // Is a date before another?
        boolean isBefore = LocalDate.of(2020, 11, 11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("isBefore = " + isBefore);

        // Is a date after another?
        boolean isAfter = LocalDate.parse("2020-11-11").isAfter(LocalDate.now().minusDays(1));
        System.out.println("isAfter = " + isAfter);


        // What if we want to obtain the same info, but for example in spanish?
        Month month = actualDate.getMonth();
        System.out.println("month = " + month);
        System.out.println("month in spanish = " + month.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
        DayOfWeek dayOfWeek = actualDate.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("dayOfWeek in spanish = " + dayOfWeek.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

    }

}
