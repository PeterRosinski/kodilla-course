package com.kodilla.flightsscanner;

import java.util.ArrayList;
import java.util.List;

public class ConnectionsRetriever {
    public List<Connection> retrieve() {

        List<Connection> connectionsList = new ArrayList<>();

        connectionsList.add(new Flight("",""));
        connectionsList.add(new Flight("Warsaw","Moscow"));
        connectionsList.add(new Flight("Warsaw","Tokyo"));
        connectionsList.add(new Flight("Warsaw","Barcelona"));
        connectionsList.add(new Flight("Warsaw","Berlin"));
        connectionsList.add(new Flight("Warsaw","Paris"));
        connectionsList.add(new Flight("Warsaw","Rome"));
        connectionsList.add(new Flight("Warsaw","Oslo"));
        connectionsList.add(new Flight("Warsaw","London"));
        connectionsList.add(new Flight("Warsaw","Cracow"));
        connectionsList.add(new Flight("Warsaw","Stockholm"));
        connectionsList.add(new Flight("Moscow","Warsaw"));
        connectionsList.add(new Flight("Moscow","Tokyo"));
        connectionsList.add(new Flight("Moscow","Berlin"));
        connectionsList.add(new Flight("Moscow","London"));
        connectionsList.add(new Flight("Cracow","Warsaw"));
        connectionsList.add(new Flight("Tokyo","Warsaw"));
        connectionsList.add(new Flight("Tokyo","Moscow"));
        connectionsList.add(new Flight("Tokyo","Barcelona"));
        connectionsList.add(new Flight("Tokyo","Rome"));
        connectionsList.add(new Flight("Tokyo","Oslo"));
        connectionsList.add(new Flight("Berlin","Warsaw"));
        connectionsList.add(new Flight("Berlin","Moscow"));
        connectionsList.add(new Flight("Berlin","Barcelona"));
        connectionsList.add(new Flight("Berlin","Paris"));
        connectionsList.add(new Flight("Berlin","Rome"));
        connectionsList.add(new Flight("Barcelona","Warsaw"));
        connectionsList.add(new Flight("Barcelona","Moscow"));
        connectionsList.add(new Flight("Barcelona","Tokyo"));
        connectionsList.add(new Flight("Barcelona","Paris"));
        connectionsList.add(new Flight("Barcelona","Rome"));
        connectionsList.add(new Flight("Paris","Warsaw"));
        connectionsList.add(new Flight("Paris","Berlin"));
        connectionsList.add(new Flight("Paris","Barcelona"));
        connectionsList.add(new Flight("Paris","Rome"));
        connectionsList.add(new Flight("Paris","London"));
        connectionsList.add(new Flight("Rome","Warsaw"));
        connectionsList.add(new Flight("Rome","Tokyo"));
        connectionsList.add(new Flight("Rome","Berlin"));
        connectionsList.add(new Flight("Rome","Barcelona"));
        connectionsList.add(new Flight("Rome","Stockholm"));
        connectionsList.add(new Flight("Rome","London"));
        connectionsList.add(new Flight("Oslo","Warsaw"));
        connectionsList.add(new Flight("Oslo","Tokyo"));
        connectionsList.add(new Flight("Oslo","Stockholm"));
        connectionsList.add(new Flight("Oslo","London"));
        connectionsList.add(new Flight("Stockholm","Rome"));
        connectionsList.add(new Flight("London","Oslo"));
        connectionsList.add(new Flight("London","Tokyo"));
        connectionsList.add(new Flight("London","Warsaw"));
        connectionsList.add(new Flight("London","Cracow"));

        return connectionsList;

    }

}
