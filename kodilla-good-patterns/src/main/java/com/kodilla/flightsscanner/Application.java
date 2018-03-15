package com.kodilla.flightsscanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Początek procesu wyszukiwania lotów...\n");

        ConnectionsRetriever connectionsRetriever = new ConnectionsRetriever();
        ConnectionsScanner connectionsScanner = new ConnectionsScanner(connectionsRetriever.retrieve());
        ConnectionsViewer connectionsViewer = new ConnectionsViewer();

        System.out.println("- Odloty -");
        connectionsViewer.view(connectionsScanner.searchConnectionsFromDepartureLocation("Warsaw"));

        System.out.println("- Przyloty -");
        connectionsViewer.view(connectionsScanner.searchConnectionsToArrivalLocation("Warsaw"));

        Flight searchedFlight = new Flight("Moscow","Rome");
        System.out.println("- Loty bezpośrednie -");
        connectionsViewer.view(connectionsScanner.searchDirectConnection(searchedFlight));
        System.out.println("- Loty pośrednie -");
        connectionsViewer.view(connectionsScanner.searchIndirectConnection(searchedFlight));

        System.out.println("\n...koniec procesu wyszukiwania lotów!");

    }
}


