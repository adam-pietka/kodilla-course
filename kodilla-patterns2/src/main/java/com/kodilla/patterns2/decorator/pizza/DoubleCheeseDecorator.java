package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleCheeseDecorator extends AbstractPizzaOrderDecorator {
    public DoubleCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalPrice() {
        return super.getTotalPrice().add(new BigDecimal("4"));
    }

    @Override
    public String getPizzaDesc() {
        return super.getPizzaDesc() + " + double cheese";
    }
}
