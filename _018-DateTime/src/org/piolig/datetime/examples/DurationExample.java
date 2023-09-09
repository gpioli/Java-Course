package org.piolig.datetime.examples;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void main(String[] args) {
        
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);

        // PT -> Period of Time | Analog to a Crono
        Duration lapsus = Duration.between(dateTime1, dateTime2);
        System.out.println("lapsus = " + lapsus);
        System.out.println("lapsus.toMinutes() = " + lapsus.toMinutes());
        System.out.println("We add 5 hours = " + lapsus.plusHours(5));

        /*
        lapsus = PT27H20M0.000205S
        lapsus.toMinutes() = 1640
        We add 5 hours = PT32H20M0.000205S
         */

    }
}
