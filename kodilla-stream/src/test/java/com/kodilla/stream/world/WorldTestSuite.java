package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testOfContinent (){
       // given
        World world = new World();
        Continent continentAsia = new Continent("Asia");
        Continent continentEurope = new Continent("Europe");
        Continent continentSouthAmerica = new Continent("South America");

        //when
        world.addContinent(continentAsia);
        world.addContinent(continentEurope);
        world.addContinent(continentSouthAmerica);

        continentAsia.addCountryToContinent(new Country ( new BigDecimal("565"), "Japan"));
        continentAsia.addCountryToContinent(new Country ( new BigDecimal("435"), "China"));

        continentEurope.addCountryToContinent(new Country(new BigDecimal("101"), "Poland"));
        continentEurope.addCountryToContinent(new Country(new BigDecimal("301"), "Denmark"));

        continentSouthAmerica.addCountryToContinent(new Country(new BigDecimal("1001"), "Brazil"));
        continentSouthAmerica.addCountryToContinent(new Country(new BigDecimal("301"), "Argentina"));

        //then
        world.quantityPeopleInWord();
        BigDecimal correctResult = new BigDecimal("2704");
        Assertions.assertEquals(correctResult, world.quantityPeopleInWord());
    }

}
