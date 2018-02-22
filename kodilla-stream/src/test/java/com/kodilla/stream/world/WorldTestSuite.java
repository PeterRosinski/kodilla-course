package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("China",new BigDecimal("1379302771"));
        Country country2 = new Country("India",new BigDecimal("1281935911"));
        Country country3 = new Country("Pakistan",new BigDecimal("204924861"));
        Country country4 = new Country("Poland",new BigDecimal("38476269"));
        Country country5 = new Country("Germany",new BigDecimal("80594017"));
        Country country6 = new Country("Spain",new BigDecimal("48958159"));
        Country country7 = new Country("USA",new BigDecimal("326625791"));

        Continent asia = new Continent();
        asia.addCountry(country1);
        asia.addCountry(country2);
        asia.addCountry(country3);

        Continent europe = new Continent();
        europe.addCountry(country4);
        europe.addCountry(country5);
        europe.addCountry(country6);

        Continent northAmerica = new Continent();
        northAmerica.addCountry(country7);

        World earth = new World();
        earth.addContinent(asia);
        earth.addContinent(europe);
        earth.addContinent(northAmerica);

        //When
        BigDecimal totalQuantityOfPeopleOnEarth = earth.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalQuantityOfPeopleOnEarth = new BigDecimal("3360817779");
        Assert.assertEquals(expectedTotalQuantityOfPeopleOnEarth,totalQuantityOfPeopleOnEarth);

    }
}
