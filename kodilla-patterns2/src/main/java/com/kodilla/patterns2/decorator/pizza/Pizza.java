package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Pizza implements PizzaOrder {

    @Override
    public BigDecimal getTotalPrice() {
        return new  BigDecimal("15");
    }

    @Override
    public String getPizzaDesc() {
        return "Pizza";
    }
}
