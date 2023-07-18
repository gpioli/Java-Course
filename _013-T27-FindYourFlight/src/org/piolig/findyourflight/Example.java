package org.piolig.findyourflight;

import org.piolig.findyourflight.model.Flight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Example {
    public static void main(String[] args) {

        List<Flight> flights = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        flights.add(new Flight("AAL 933", "New York", "Santiago", LocalDateTime.parse("2021-08-29 05:39", formatter), 62));
        flights.add(new Flight("LAT 755", "Sao Paulo", "Santiago", LocalDateTime.parse("2021-08-31 04:45", formatter), 47));
        flights.add(new Flight("SKU 621", "Rio De Janeiro", "Santiago", LocalDateTime.parse("2021-08-30 16:00", formatter), 52));
        flights.add(new Flight("DAL 147", "Atlanta", "Santiago", LocalDateTime.parse("2021-08-29 13:22", formatter), 59));
        flights.add(new Flight("AVA 241", "Bogota", "Santiago", LocalDateTime.parse("2021-08-31 14:05", formatter), 25));
        flights.add(new Flight("AMX 10", "Mexico City", "Santiago", LocalDateTime.parse("2021-08-31 05:20", formatter), 29));
        flights.add(new Flight("IBE 6833", "Londres", "Santiago", LocalDateTime.parse("2021-08-30 08:45", formatter), 55));
        flights.add(new Flight("LAT 2479", "Frankfurt", "Santiago", LocalDateTime.parse("2021-08-29 07:41", formatter), 51));
        flights.add(new Flight("SKU 803", "Lima", "Santiago", LocalDateTime.parse("2021-08-30 10:35", formatter), 48));
        flights.add(new Flight("LAT 533", "Los Angeles", "Santiago", LocalDateTime.parse("2021-08-29 09:14", formatter), 59));
        flights.add(new Flight("LAT 1447", "Guayaquil", "Santiago", LocalDateTime.parse("2021-08-31 08:33", formatter), 31));
        flights.add(new Flight("CMP 111", "Panama City", "Santiago", LocalDateTime.parse("2021-08-31 15:15", formatter), 29));
        flights.add(new Flight("LAT 705", "Madrid", "Santiago", LocalDateTime.parse("2021-08-30 08:14", formatter), 47));
        flights.add(new Flight("AAL 957", "Miami", "Santiago", LocalDateTime.parse("2021-08-29 22:53", formatter), 60));
        flights.add(new Flight("ARG 5091", "Buenos Aires", "Santiago", LocalDateTime.parse("2021-08-31 09:57", formatter), 32));
        flights.add(new Flight("LAT 1283", "Cancun", "Santiago", LocalDateTime.parse("2021-08-31 04:00", formatter), 35));
        flights.add(new Flight("LAT 579", "Barcelona", "Santiago", LocalDateTime.parse("2021-08-29 07:45", formatter), 61));
        flights.add(new Flight("AAL 945", "Dallas-Fort Worth", "Santiago", LocalDateTime.parse("2021-08-30 07:12", formatter), 58));
        flights.add(new Flight("LAT 501", "Paris", "Santiago", LocalDateTime.parse("2021-08-29 18:29", formatter), 49));
        flights.add(new Flight("LAT 405", "Montevideo", "Santiago", LocalDateTime.parse("2021-08-30 15:45", formatter), 39));

        System.out.println("=== Initial elements ===");
        flights.forEach(System.out::println);

        System.out.println("\n=====================================\n");

        System.out.println("\nOrdering flights by arrival ASC");
        // See comment in the Flight Class, line 66
        /*List<Flight> flightsByDateAsc = new ArrayList<>((Collection) Comparator.comparing(Flight::getDate));
        flightsByDateAsc.addAll(flights);
        flightsByDateAsc.forEach(System.out::println);*/

        List<Flight> flightsByDateAsc = new ArrayList<>();
        flightsByDateAsc.addAll(flights);
        flightsByDateAsc.sort(Comparator.comparing(Flight::getDate));
        flightsByDateAsc.forEach(System.out::println);

        System.out.println("\n=====================================\n");

        System.out.println("\nLast arriving flight is: ");
        Flight lastArrivingFlight = flightsByDateAsc.get(flightsByDateAsc.size()-1);
        System.out.println("lastArrivingFlight = " + lastArrivingFlight);

        System.out.println("\n\n=====================================\n");

        System.out.println("\nOrdering flights by paxNumber DESC: \n");
        List<Flight> flightsByPaxNumberDesc = new ArrayList<>(flights);
        //flightsByPaxNumberDesc.sort(Comparator.comparing(Flight::getPaxNumber));
        // Another way with lambda functions:
        flightsByPaxNumberDesc.sort((f1, f2) -> Integer.valueOf(f1.getPaxNumber()).compareTo(f2.getPaxNumber()));
        flightsByPaxNumberDesc.forEach(System.out::println);

        System.out.println("\n=====================================\n");
        System.out.println("FLight with the least number of passengers: " + flightsByPaxNumberDesc.get(0));

    }
}
