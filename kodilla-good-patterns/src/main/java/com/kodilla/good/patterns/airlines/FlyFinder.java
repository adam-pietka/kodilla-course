package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlyFinder {

    private final AirConnectionsList airConnectionsList = new AirConnectionsList() ;

    public List<String> findFlyCinnectionFromTo(String fromCity, String toCity){
        List<String> listFrom = findFlyForDeparture(fromCity) ;
        List<String> listTo = findFlyForArrivals(toCity);
        List<String> resultList = new ArrayList<>();
        for ( String f : listFrom ) {
            for (String t: listTo) {
                if (t == f) {
                    resultList.add(t);
                }
            }
        }
        return resultList;
    }

    public List<String> findFlyForArrivals(String arrivalCity){
        List<String> flyToFrom = new ArrayList<>();
        airConnectionsList.getConnectionList().entrySet().stream()
                .forEach(e-> {
                    if (e.getValue().contains(arrivalCity.toUpperCase()))
                        flyToFrom.add(e.getKey());
                });
        return flyToFrom;
    }

    public List<String> findFlyForDeparture(String departureCity){
        List<String> flyFromTo = new ArrayList<>();
        airConnectionsList.getConnectionList().entrySet().stream()
                .filter(i -> i.getKey().startsWith(departureCity.toUpperCase()))
                .collect(Collectors.toList())
                .forEach(e-> e.getValue().stream()
                        .forEach(p-> {
                            flyFromTo.add(p.toUpperCase());
                        }));
        return flyFromTo;
    }

    public List<String> findFlyForDepartureHASH(String departureCity){
        List<String> flyFromToHASH = new ArrayList<>();
        airConnectionsList.getConnectionListHash().entrySet().stream()
                .filter(i -> i.getKey().getAirport().startsWith(departureCity.toUpperCase()))
                .collect(Collectors.toList())
                .forEach(e-> e.getValue().stream()
                        .forEach(p-> {
                            flyFromToHASH.add(p.toUpperCase());
                        }));
        return flyFromToHASH;
    }

}