package com.kodilla.flightsscanner;

import java.util.Objects;

public class Flight implements Connection {

    private String departureLocation;
    private String arrivalLocation;

    public Flight(String departureLocation, String arrivalLocation) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }

    @Override
    public String getDepartureLocation() {
        return departureLocation;
    }

    @Override
    public String getArrivalLocation() {
        return arrivalLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureLocation, flight.departureLocation) &&
                Objects.equals(arrivalLocation, flight.arrivalLocation);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureLocation, arrivalLocation);
    }

    @Override
    public String toString() {
        return departureLocation + " -> " + arrivalLocation;
    }

}
