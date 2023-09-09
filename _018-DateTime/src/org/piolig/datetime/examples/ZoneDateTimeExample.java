package org.piolig.datetime.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zoneNy = ZonedDateTime.of(localDate, newYork);
        System.out.println("Departure time at NY: " + zoneNy);


        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zoneMadrid = zoneNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Arrival time at Madrid = " + zoneMadrid);


        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Spain trip details: ");
        System.out.println("New York Departure: " + f.format(zoneNy));
        System.out.println("Madrid arrival: " + f.format(zoneMadrid.plusHours(8)));


        System.out.println(" ");
        System.out.println("--------------------------------------");
        System.out.println("Example using offset instead of ZoneId / Zona horaria");
        ZonedDateTime zoneNy2 = ZonedDateTime.of(localDate, ZoneOffset.of("-04:00"));
        ZonedDateTime zoneMadrid2 = zoneNy2.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Spain trip details: ");
        System.out.println("New York Departure: " + f.format(zoneNy2));
        System.out.println("Madrid arrival: " + f.format(zoneMadrid2.plusHours(8)));


        System.out.println(" ");
        System.out.println("--------------------------------------");
        System.out.println("All available ZoneIds");
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        // Another way of creating the ZonedDateTime
        ZonedDateTime zoneNy3 = localDate.atZone(newYork);

        /*

        Departure time at NY: 2021-09-23T12:45-04:00[America/New_York]
        Arrival time at Madrid = 2021-09-24T02:45+02:00[Europe/Madrid]
        Spain trip details:
        New York Departure: 12:45, 23 sept. 2021
        Madrid arrival: 10:45, 24 sept. 2021

        --------------------------------------
        Example using offset instead of ZoneId / Zona horaria
        Spain trip details:
        New York Departure: 12:45, 23 sept. 2021
        Madrid arrival: 10:45, 24 sept. 2021

        --------------------------------------
        All available ZoneIds
        Asia/Aden
        America/Cuiaba
        ...


         */

    }
}
