package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getTotalPrice();
    String getPizzaDesc();
}
