package org.piolig.findyourflight;

import java.util.Date;

public class Flight {

    private String flightCode;
    private String origin;
    private String destination;
    private Date date;
    private int paxNumber;

    public Flight(String flightCode, String origin, String destination, Date date, int paxNumber) {
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

    public Date getDate() {
        return date;
    }

    public int getPaxNumber() {
        return paxNumber;
    }
}
