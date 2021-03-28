package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlyFinder {

    private AirConnectionsList airConnectionsList = new AirConnectionsList() ;

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
//        System.out.println("\nTo " + arrivalCity + " you can fry from:");
        airConnectionsList.getConnectionList().entrySet().stream()
                .forEach(e-> {
                    if (e.getValue().contains(arrivalCity.toUpperCase()))
//                        System.out.println("-> " + e.getKey());
                        flyToFrom.add(e.getKey());
                });
        return flyToFrom;
    }

    public List<String> findFlyForDeparture(String departureCity){
        List<String> flyFromTo = new ArrayList<>();
//        System.out.println("For " + departureCity +  " city, are available destination.");
        airConnectionsList.getConnectionList().entrySet().stream()
                .filter(i -> i.getKey().startsWith(departureCity.toUpperCase()))
                .collect(Collectors.toList())
                .forEach(e-> e.getValue().stream()
                        .forEach(p-> {
//                            System.out.println(" * " + p.toUpperCase());
                            flyFromTo.add(p.toUpperCase());
                        }));

        System.out.println("************* forEach");
        for (Map.Entry<String,List<String>> i : airConnectionsList.getConnectionList().entrySet()) {
            System.out.println("Klucz: " + i.getKey() + " -value: " + i.getValue() );
        }
        return flyFromTo;
    }
}