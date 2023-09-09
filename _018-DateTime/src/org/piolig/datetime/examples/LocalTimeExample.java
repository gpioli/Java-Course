package org.piolig.datetime.examples;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        System.out.println("Hour = " + now.getHour());
        System.out.println("Minute = " + now.getMinute());
        System.out.println("Sec = " + now.getSecond());
        
        
        LocalTime halfPastSix = LocalTime.of(6,30, 59);
        System.out.println("halfPastSix = " + halfPastSix);


        // Adding and subtracting

        LocalTime oneHourAfter = halfPastSix.plusHours(1);
        System.out.println("oneHourAfter = " + oneHourAfter);

        boolean isPrevious = LocalTime.of(6,30).isBefore(LocalTime.parse("07:30"));
        System.out.println("isPrevious = " + isPrevious);

        // Creating a pattern
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a"); // a corresponds to AM / PM
        // also, hh corresponds to AM / PM -> and HH corresponds to 24H time
        
        String nowFormatted = now.format(df);
        System.out.println("nowFormatted = " + nowFormatted);

        System.out.println("halfPastSix am = " + halfPastSix.format(df));
        halfPastSix = LocalTime.of(18,30, 45);
        System.out.println("halfPastSix pm = " + halfPastSix.format(df));

        LocalTime max = LocalTime.MAX;
        System.out.println("max = " + max);
        LocalTime min = LocalTime.MIN;

        System.out.println("min = " + min);

    }

}
