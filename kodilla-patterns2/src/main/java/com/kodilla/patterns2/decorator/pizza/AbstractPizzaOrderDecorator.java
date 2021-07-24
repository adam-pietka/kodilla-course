package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return pizzaOrder.getTotalPrice();
    }

    @Override
    public String getPizzaDesc() {
        return pizzaOrder.getPizzaDesc();
    }
}