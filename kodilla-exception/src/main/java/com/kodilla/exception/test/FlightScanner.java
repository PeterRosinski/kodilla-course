package com.kodilla.exception.test;

import java.util.Map;

public class FlightScanner {

    private Map<String,Boolean> flightsMap;

    public FlightScanner(Map<String, Boolean> flightsMap) {
        this.flightsMap = flightsMap;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Boolean searchedFlight = flightsMap.get(flight.getArrivalAirport());

        if(searchedFlight!=null) {
            if(searchedFlight) {
                System.out.println("jest lot bezposredni na wskazane lotnisko");
            } else {
                System.out.println("brak mozliwosci lotu bezposredniego na wskazane lotnisko.");
            }
        } else {
            throw new RouteNotFoundException();
        }

    }
}
