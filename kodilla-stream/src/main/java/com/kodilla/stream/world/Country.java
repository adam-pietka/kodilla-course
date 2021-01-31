package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final BigDecimal peopleQuantity ;
    private final String countyName ;

    public Country(BigDecimal peopleQuantity, String countyName) {
        this.peopleQuantity = peopleQuantity;
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }

    public BigDecimal getPeopleQuantity(){
        //BigDecimal peopleQuantity = new BigDecimal("65565656545454");
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(peopleQuantity, country.peopleQuantity) && Objects.equals(countyName, country.countyName);
    }
}