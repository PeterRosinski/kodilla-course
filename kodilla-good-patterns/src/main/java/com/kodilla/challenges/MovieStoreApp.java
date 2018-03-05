package com.kodilla.challenges;

import java.util.stream.Collectors;

public class MovieStoreApp {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        System.out.println(movieStore.getMovies().entrySet().stream()
                .flatMap(translation->translation.getValue().stream())
                .collect(Collectors.joining("!")));

    }
}
