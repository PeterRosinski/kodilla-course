package com.kodilla.exception.test;

import java.util.Map;

public class FlightScanner {

    private Map<String,Boolean> flightsMap;

    public FlightScanner(Map<String, Boolean> flightsMap) {
        this.flightsMap = flightsMap;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        try {
            if(flightsMap.get(flight.getArrivalAirport())) {
                System.out.println("jest lot bezposredni na wskazane lotnisko");
            } else {
                System.out.println("brak mozliwosci lotu bezposredniego na wskazane lotnisko.");
            }
        } catch (NullPointerException e) {
            throw new RouteNotFoundException();
        }

    }
}
