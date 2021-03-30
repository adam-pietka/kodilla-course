package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlyFinder{

    private final AirConnectionsList airConnectionsList = new AirConnectionsList() ;
    private final PrintResultForFlyFinder printResultForFlyFinder = new PrintResultForFlyFinder();

    public List<String> findFlyCinnectionFromTo(String fromCity, String toCity){
        List<String> listFrom = findFlyForDepartureHASH(fromCity) ;
        List<String> listTo = findFlyForArrivals(toCity);
        List<String> resultList = new ArrayList<>();
        for ( String f : listFrom ) {
            for (String t: listTo) {
                if (t == f) {
                    resultList.add(t);
                }
            }
        }
        printResultForFlyFinder.printThroughAirport(fromCity, toCity, resultList);
        return resultList;
    }

    public List<String> findFlyForArrivals(String arrivalCity){
        List<String> flyToFrom = new ArrayList<>();
        airConnectionsList.getConnectionList().entrySet().stream()
                .forEach(e-> {
                    if (e.getValue().contains(arrivalCity.toUpperCase()))
                        flyToFrom.add(e.getKey().toUpperCase());
                });
        printResultForFlyFinder.printForArrival(arrivalCity, flyToFrom);
        return flyToFrom;
    }

    public List<String> findFlyForDepartureHASH(String departureCity){
        List<String> flyFromTo = new ArrayList<>();
        airConnectionsList.getConnectionList().entrySet().stream()
                .filter(i -> i.getKey().startsWith(departureCity.toUpperCase()))
                .collect(Collectors.toList())
                .forEach(e-> e.getValue().stream()
                        .forEach(p-> {
                            flyFromTo.add(p.toUpperCase());
                        }));
        printResultForFlyFinder.printForDeparture(departureCity, flyFromTo);
        return flyFromTo;
    }
}