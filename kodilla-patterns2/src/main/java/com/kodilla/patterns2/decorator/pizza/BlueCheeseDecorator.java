package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BlueCheeseDecorator extends AbstractPizzaOrderDecorator {

    public BlueCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + blue cheese";
    }
}
