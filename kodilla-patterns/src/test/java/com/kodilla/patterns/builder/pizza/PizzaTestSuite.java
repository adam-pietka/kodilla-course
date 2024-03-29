package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }

    /*@Test **  // old version
    void testPizzaNew() {
        // *********** old version
        //Given
//        Pizza pizza = new Pizza("Thin", "Spicy", "Mushrooms", "Onion", "Ham");
//        System.out.println(pizza);
        //When
//        int howManyIngredients = pizza.getIngredients().size();
        //Then
//        assertEquals(3, howManyIngredients);
    }*/
}
