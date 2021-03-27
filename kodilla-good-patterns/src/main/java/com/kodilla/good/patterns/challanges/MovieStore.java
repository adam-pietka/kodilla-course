package com.kodilla.good.patterns.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MovieStore {

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);


        booksTitlesWithTranslations.entrySet().stream()
                .flatMap(x-> x.getValue().stream())
                .collect(Collectors.toSet())
                .forEach(x-> System.out.print(x + "! "));

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies();

    }
}