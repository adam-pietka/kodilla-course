package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigMac(){

        //G
        BigMac bigMacADam = new BigMac.BigMacBuilder()
                .bunType("with Sezam")
                .burgersQuantity(2)
                .ingredient("Onion")
                .ingredient("bacon")
                .ingredient("jalapenion")
                .sauceType("mexic")
                .buildBigMAc();
        System.out.println(bigMacADam);
        //W
//        int howManyIngredients = bigMacADam.getIngredients().size();
        //T

    }
}
