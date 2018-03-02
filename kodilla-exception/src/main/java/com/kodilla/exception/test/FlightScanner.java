package com.kodilla.exception.test;

import java.util.Map;

public class FlightScanner {

    private Map<String,Boolean> flightsMap;

    public FlightScanner(Map<String, Boolean> flightsMap) {
        this.flightsMap = flightsMap;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        boolean isInMap = false;
        String txt = "";
        for (Map.Entry<String, Boolean> flightEntry : flightsMap.entrySet()) {
            if (flightEntry.getKey().equals(flight.getArrivalAirport())) {
                isInMap=true;
                if (flightEntry.getValue()) {
                    txt = "jest lot bezposredni na wskazane lotnisko";
                } else {
                    txt = "brak mozliwosci lotu bezposredniego na wskazane lotnisko.";
                }
            }
        }
        if (isInMap) {
            System.out.println("Znalazlem rekord, " + txt);
        } else {
            throw new RouteNotFoundException();
        }
    }
}
