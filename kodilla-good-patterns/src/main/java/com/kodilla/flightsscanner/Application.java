package com.kodilla.flightsscanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Początek procesu wyszukiwania lotów...");

        //inicjacja mapy lotów - miejsce startu : miejsce lądowania
        FlightsRetriever flightsRetriever = new FlightsRetriever();
        FlightsScanner flightsScanner = new FlightsScanner(flightsRetriever.retrieve());
        //flightsRetriever.retrieve() -> to powinno zwracać mapę wszystkich możliwych lotów i ją przekazujemy dalej do serwisu

        //utworzenie obiektu poszukiwanego lotu
        //zdefiniujmy miejsce startu i lądowania

        //serwis do wyszukiwania
        //- wszystkich lotów z podanego miasta - zwracamy i wyświetlamy wszystkie kierunki lotów z danej lokalizacji w postaci listy
        //- wszystkich lotów do danego miasta - zwracamy wszystkie loty do danego miasta w postaci listy
        //- znalezienie lotów poprzez inne miasto
        //- znalezienie lotu bezpośredniego

        //serwis powinien mieć 4 metody do osobnego szukania, ale samo przeszukiwanie mapy powinno być w osobnej klasie lub serwisie

        System.out.println("...koniec procesu wyszukiwania lotów!");

    }
}


