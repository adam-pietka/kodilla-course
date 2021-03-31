package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlyFinder{

    private final AirConnectionsList airConnectionsList = new AirConnectionsList() ;

    public List<String> findFlyCinnectionFromToHash(String fromCity, String toCity){
        List<String> listFrom = findFlyForDepartureHASH(fromCity) ;
        List<String> listTo = findFlyForArrivalsHASH(toCity);
        List<String> resultList = new ArrayList<>();

        for ( String i: listFrom) {
            for (String j: listTo) {
                if (i.equals(j)){
                    resultList.add(i) ;
                }
            }
        }

        return resultList;
    }

    /*public List<String> findFlyCinnectionFromTo(String fromCity, String toCity){
        List<String> listFrom = findFlyForDepartureHASH(fromCity) ;
        List<String> listTo = findFlyForArrivalsHASH(toCity);
        List<String> resultList = new ArrayList<>();
        for ( String f : listFrom ) { // EQUAL **************************
            for (String t: listTo) {
                if (t == f) {
                    resultList.add(t);
                }
            }
        }
        return resultList;
    }*/

    public List<String> findFlyForDepartureHASH(String departureCity){
        List<String> flyFromTo = new ArrayList<>();
        airConnectionsList.getConnectionListHash().entrySet().stream()
                .filter(i -> i.getKey().getAirport().startsWith(departureCity.toUpperCase()))
                .collect(Collectors.toList())
                .forEach(e-> e.getValue().stream()
                        .forEach(p-> {
                            flyFromTo.add(p.toUpperCase());
                        }));
        return flyFromTo;
    }


    public List<String> findFlyForArrivalsHASH(String arrivalCity){
        List<String> flyToFrom = new ArrayList<>();
        airConnectionsList.getConnectionListHash().entrySet().stream()
                .forEach(e-> {
                    if (e.getValue().contains(arrivalCity.toUpperCase()))
                        flyToFrom.add(e.getKey().getAirport().toUpperCase());
                });
        return flyToFrom;
    }
}