package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {
    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent){
        continentList.add(continent);
    }
    public boolean removeContinent(Continent continent){
        return continentList.remove(continent);
    }
    public BigDecimal quantityPeopleInWord(){
        return  continentList.stream()
                .flatMap(counry -> counry.getContinents().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public List<Continent> getContinentList() {
        return continentList;
    }
}