package com.kodilla.flightsscanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Początek procesu wyszukiwania lotów...\n");

        ConnectionsRetriever connectionsRetriever = new ConnectionsRetriever();
        ConnectionsScanner connectionsScanner = new ConnectionsScanner(connectionsRetriever.retrieve());
        ConnectionsViewer connectionsViewer = new ConnectionsViewer();

        System.out.println("\n- Odloty -");
        connectionsViewer.view(connectionsScanner.searchConnectionsFromDepartureLocation("Warsaw"));

        System.out.println("\n- Przyloty -");
        connectionsViewer.view(connectionsScanner.searchConnectionsToArrivalLocation("Warsaw"));

        Flight searchedFlight = new Flight("Moscow","Rome");
        System.out.println("\n- Loty bezpośrednie -");
        connectionsViewer.view(connectionsScanner.searchDirectConnection(searchedFlight));
        System.out.println("\n- Loty pośrednie -");
        connectionsViewer.view(connectionsScanner.searchIndirectConnections(searchedFlight));

        System.out.println("\n...koniec procesu wyszukiwania lotów!");

    }
}


