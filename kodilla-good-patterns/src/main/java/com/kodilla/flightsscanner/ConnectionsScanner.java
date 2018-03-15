package com.kodilla.flightsscanner;

import java.util.List;
import java.util.stream.Collectors;

public class ConnectionsScanner {

    private List<Connection> connectionsList;

    public ConnectionsScanner(List<Connection> connectionsList) {
        this.connectionsList = connectionsList;
    }

    public List<Connection> searchConnectionsFromDepartureLocation(String departureLocation) {
        return connectionsList.stream()
                .filter(connectionEntry->connectionEntry.getDepartureLocation().equals(departureLocation))
                .collect(Collectors.toList());
    }

    public List<Connection> searchConnectionsToArrivalLocation(String arrivalLocation) {
        return connectionsList.stream()
                .filter(connectionEntry->connectionEntry.getArrivalLocation().equals(arrivalLocation))
                .collect(Collectors.toList());
    }

    public List<Connection> searchDirectConnection(Connection connection) {
        return connectionsList.stream()
                .filter(connectionEntry->connectionEntry.equals(connection))
                .collect(Collectors.toList());
    }
    /*
    public List<Connection> searchIndirectConnections(Connection connection) {
        return;
    } */

}
