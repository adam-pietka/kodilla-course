package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMac(){

        //G
        BigMac bigMacADam = new BigMac.BigMacBuilder("with Sezam",1)
                .ingredient("Onion")
                .sauceType("mexic")
                .ingredient("bacon")
                .ingredient("jalapenion")
                .sauceType("garlic")
                .buildBigMAc();
        System.out.println(bigMacADam);
        //W
        int howManyIngredients = bigMacADam.getIngredients().size();
        int howManySuces = bigMacADam.getSauce().size();

        //T
        assertEquals(3,howManyIngredients);
        assertEquals(2, howManySuces);

    }
}
