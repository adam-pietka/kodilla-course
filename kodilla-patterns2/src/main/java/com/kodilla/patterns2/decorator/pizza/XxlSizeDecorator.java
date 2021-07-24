package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class XxlSizeDecorator extends AbstractPizzaOrderDecorator {
    public XxlSizeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getTotalPrice() {
        return super.getTotalPrice().add(new BigDecimal("8"));
    }

    @Override
    public String getPizzaDesc() {
        return super.getPizzaDesc() + " + XXL size";
    }
}
