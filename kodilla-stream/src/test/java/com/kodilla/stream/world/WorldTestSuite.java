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

        //when
        world.addContinent(continentAsia);
        world.addContinent(continentEurope);

        continentAsia.addCountryToContinent(new Country ( new BigDecimal("565"), "Japan"));
        continentAsia.addCountryToContinent(new Country ( new BigDecimal("435"), "China"));

        continentEurope.addCountryToContinent(new Country(new BigDecimal("101"), "Poland"));
        continentEurope.addCountryToContinent(new Country(new BigDecimal("301"), "Denmark"));

        //then
        world.quantityPeopleInWord();
        int i =   world.getContinentList().size();
        System.out.println(i);

        Assertions.assertEquals(5, world.quantityPeopleInWord());



    }

}
