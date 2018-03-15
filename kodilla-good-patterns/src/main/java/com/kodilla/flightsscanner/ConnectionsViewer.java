package com.kodilla.flightsscanner;

import java.util.List;

public class ConnectionsViewer {

    public void view(List<Connection> viewedList) {

        if(viewedList.size()>0) {
            viewedList.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("Nie znaleziono połączeń!");
        }

    }

}
