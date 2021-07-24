package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BottomDecorator extends AbstractPizzaOrderDecorator {
    public BottomDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalPrice() {
        return super.getTotalPrice().add(new BigDecimal("15"));
    }

    @Override
    public String getPizzaDesc() {
        return super.getPizzaDesc() + " on the thick bottom";
    }
}
