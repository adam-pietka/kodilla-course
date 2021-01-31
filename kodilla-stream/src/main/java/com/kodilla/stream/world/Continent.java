package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continent;
    private final Set<Country> continents = new HashSet<>();

    public Continent(String continent) {
        this.continent = continent;
    }

    public void addCountryToContinent (Country country){
        continents.add(country);
    }

    public String getContinent() {
        return continent;
    }

    public Set<Country> getContinents() {
        return continents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent1 = (Continent) o;

        if (continent != null ? !continent.equals(continent1.continent) : continent1.continent != null) return false;
        return continents != null ? continents.equals(continent1.continents) : continent1.continents == null;
    }

    @Override
    public int hashCode() {
        return continent != null ? continent.hashCode() : 0;
    }
}
