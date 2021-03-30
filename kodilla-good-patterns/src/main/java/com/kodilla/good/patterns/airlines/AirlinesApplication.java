package com.kodilla.good.patterns.airlines;

public class AirlinesApplication {
    public static void main(String[] args) {
        FlyFinder flyFinder = new FlyFinder();

//        flyFinder.findFlyForArrivals("Radom");
//        flyFinder.findFlyForDepartureHASH("Krakow");
        flyFinder.findFlyCinnectionFromTo("Warszawa", "Radom");
    }
}
