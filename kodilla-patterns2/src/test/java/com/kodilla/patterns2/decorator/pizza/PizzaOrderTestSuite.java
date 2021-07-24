package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testBasicPricePizza() {
        //G
        PizzaOrder basicPizza = new Pizza();
        //W
        BigDecimal calculatedPrice = basicPizza.getTotalPrice();
        System.out.println(" ========  calculatedPrice: " + calculatedPrice + " PLN");
        //T
        assertEquals(new BigDecimal("15"), calculatedPrice);
    }

    @Test
    void testBasicDescPizza() {
        //G
        PizzaOrder basicPizza = new Pizza();
        //W
        String pizzaPizzaDesc = basicPizza.getPizzaDesc();
        System.out.println(" ========  pizzaPizzaDesc: " + pizzaPizzaDesc + "\n");
        //T
        assertEquals("Pizza", pizzaPizzaDesc);
    }

    @Test
    void testBottomPizzaPrice() {
        //G
        PizzaOrder basicPizza = new Pizza();
        basicPizza = new BottomDecorator(basicPizza);
        //W
        BigDecimal calculatedPrice = basicPizza.getTotalPrice();
        System.out.println(" ========  calculatedPrice: " + calculatedPrice + " PLN");
        //T
        assertEquals(new BigDecimal("30"), calculatedPrice);
    }

    @Test
    void testBottomDescPizza() {
        //G
        PizzaOrder basicPizza = new Pizza();
        basicPizza = new BottomDecorator(basicPizza);

        //W
        String pizzaPizzaDesc = basicPizza.getPizzaDesc();
        System.out.println(" ========  Thick TEST: ' " + pizzaPizzaDesc + "'\n");
        //T
        assertEquals("Pizza on the thick bottom", pizzaPizzaDesc);
    }

    @Test
    void testDoubleCheesePizzaPrice() {
        //G
        PizzaOrder basicPizza = new Pizza();
        basicPizza = new BottomDecorator(basicPizza);
        basicPizza = new DoubleCheeseDecorator(basicPizza);
        //W
        BigDecimal calculatedPrice = basicPizza.getTotalPrice();
        System.out.println(" ========  calculatedPrice: " + calculatedPrice + " PLN");
        //T
        assertEquals(new BigDecimal("34"), calculatedPrice);
    }

    @Test
    void testDoubleCheeseDescPizza() {
        //G
        PizzaOrder basicPizza = new Pizza();
        basicPizza = new BottomDecorator(basicPizza);
        basicPizza = new DoubleCheeseDecorator(basicPizza);

        //W
        String pizzaPizzaDesc = basicPizza.getPizzaDesc();
        System.out.println(" ========  Thick TEST: ' " + pizzaPizzaDesc + "'\n");
        //T
        assertEquals("Pizza on the thick bottom + double cheese", pizzaPizzaDesc);
    }

    @Test
    void testXxlSizePizzaPrice() {
        //G
        PizzaOrder basicPizza = new Pizza();
        basicPizza = new BottomDecorator(basicPizza);
        basicPizza = new DoubleCheeseDecorator(basicPizza);
        basicPizza = new XxlSizeDecorator(basicPizza);
        //W
        BigDecimal calculatedPrice = basicPizza.getTotalPrice();
        System.out.println(" ========  calculatedPrice: " + calculatedPrice + " PLN");
        //T
        assertEquals(new BigDecimal("42"), calculatedPrice);
    }

    @Test
    void testXxlSizePizzaDesc() {
        //G
        PizzaOrder basicPizza = new Pizza();
        basicPizza = new BottomDecorator(basicPizza);
        basicPizza = new DoubleCheeseDecorator(basicPizza);
        basicPizza = new XxlSizeDecorator(basicPizza);

        //W
        String pizzaPizzaDesc = basicPizza.getPizzaDesc();
        System.out.println(" ========  Thick TEST: ' " + pizzaPizzaDesc + "'\n");
        //T
        assertEquals("Pizza on the thick bottom + double cheese + XXL size", pizzaPizzaDesc);
    }
}
