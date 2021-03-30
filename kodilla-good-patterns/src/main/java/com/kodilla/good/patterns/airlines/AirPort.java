package com.kodilla.good.patterns.airlines;

public class AirPort {
    private String airport ;

    public AirPort(String airport) {
        this.airport = airport.toUpperCase();
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirPort)) return false;

        AirPort that = (AirPort) o;

        return airport.equals(that.airport);
    }

    @Override
    public int hashCode() {
        return airport.hashCode();
    }

    @Override
    public String toString() {
        return   "Airport City: " + airport ;
    }
}