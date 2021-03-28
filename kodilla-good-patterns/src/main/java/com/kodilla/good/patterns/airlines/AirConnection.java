package com.kodilla.good.patterns.airlines;

public class AirConnection {
    private String departureCity ;
    private String arrivalCity ;

    public AirConnection(String departureCity, String arrivalCity) {
        this.departureCity =  arrivalCity.toUpperCase();
        this.arrivalCity = arrivalCity.toUpperCase();
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirConnection)) return false;

        AirConnection that = (AirConnection) o;

        if (!departureCity.equals(that.departureCity)) return false;
        return arrivalCity.equals(that.arrivalCity);
    }

    @Override
    public int hashCode() {
        return departureCity.hashCode();
    }
}