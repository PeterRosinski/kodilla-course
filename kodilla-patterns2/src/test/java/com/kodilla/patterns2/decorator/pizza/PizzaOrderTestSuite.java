package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Standard pizza", description);
    }

    @Test
    public void testPizzaWithBaconOnionOnThickDoughWithAdditionalCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThickDoughDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(29), theCost);
    }

    @Test
    public void testPizzaWithBaconOnionOnThickDoughWithAdditionalCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThickDoughDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Standard pizza (thick dough) + bacon + onion - with additional cheese", description);
    }

}