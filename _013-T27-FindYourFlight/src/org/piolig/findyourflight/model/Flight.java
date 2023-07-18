package org.piolig.findyourflight.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {

    private String flightCode;
    private String origin;
    private String destination;
    private LocalDateTime date;
    private int paxNumber;

    public Flight(String flightCode, String origin, String destination, LocalDateTime date, int paxNumber) {
        this.flightCode = flightCode;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.paxNumber = paxNumber;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getPaxNumber() {
        return paxNumber;
    }

    @Override
    public String toString() {
        return "Flight information: " +
                "\n\tFLIGHTCODE:'" + flightCode + '\'' +
                ", ORIGIN: " + origin +
                ", DESTINATION: " + destination +
                ", DATE: " + date +
                ", PAXNUMBER: " + paxNumber;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return paxNumber == flight.paxNumber && flightCode.equals(flight.flightCode) && origin.equals(flight.origin) && destination.equals(flight.destination) && date.equals(flight.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightCode, origin, destination, date, paxNumber);
    }*/

    // We could implement the compareTo method that comes with the Comparable interface, but this would destroy
    // the initial order of the list, and its not the idea
/*    @Override
    public int compareTo(Flight f){
        if (this.date == null || f.date == null) {
            return 0;
        }
        return this.date.compareTo(f.date);
    }*/


}
