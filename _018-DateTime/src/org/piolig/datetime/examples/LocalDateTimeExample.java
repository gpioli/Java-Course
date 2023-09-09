package org.piolig.datetime.examples;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        // This class combines LocalDate and LocalTime

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        dateTime = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("dateTime = " + dateTime);

        dateTime = LocalDateTime.parse("2022-12-25T21:45:59.821339800");
        System.out.println("dateTime = " + dateTime);

        LocalDateTime dateTime2 = dateTime.plusDays(1).plusHours(3);
        System.out.println("dateTime2 = " + dateTime2);
        System.out.println("dateTime = " + dateTime);
        System.out.println("dateTime3 = " + dateTime.minusHours(5));

        Month month = LocalDateTime.now().getMonth();
        System.out.println("month = " + month);

        int monthDay = LocalDateTime.now().getDayOfMonth();
        System.out.println("monthDay = " + monthDay);

        String format1 = dateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println("format1 = " + format1);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM//dd hh:mm:ss a");
        String format2 = dateTime.format(df);
        System.out.println("format2 = " + format2);

        String format3 = df.format(dateTime);
        System.out.println("format3 = " + format3);

    }
}
