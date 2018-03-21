package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given & When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                            .roll(Bigmac.BigmacBuilder.ROLL_WITHSESAME)
                            .burgers(2)
                            .sauce(Bigmac.BigmacBuilder.SAUCE_1000_ISLANDS)
                            .ingredient(Bigmac.BigmacBuilder.INGREDIENT_CHEESE)
                            .ingredient(Bigmac.BigmacBuilder.INGREDIENT_MUSHROOMS)
                            .ingredient(Bigmac.BigmacBuilder.INGREDIENT_CHILLI)
                            .build();
        System.out.println(bigmac);
        //Then
        Assert.assertEquals("ROLL WITH SESAME",bigmac.getRoll());
        Assert.assertEquals(2,bigmac.getBurgers());
        Assert.assertEquals("1000 ISLANDS",bigmac.getSauce());
        Assert.assertEquals(3,bigmac.getIngredients().size());
    }

}
