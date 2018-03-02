package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightApp {
    public static void main(String args[]) {
        Map<String,Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Warsaw",true);
        flightsMap.put("London",false);
        flightsMap.put("Berlin",true);
        flightsMap.put("Paris",true);
        flightsMap.put("Praha",false);

        Flight flight = new Flight("Madrid", "Moscow");
        FlightScanner flightScanner = new FlightScanner(flightsMap);
        try {
            flightScanner.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Nie znaleziono rekordu w mapie");
        } finally {
            System.out.println("Zakonczono wyszukiwanie");
        }
    }
}
