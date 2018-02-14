package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Start");
    }

    @After
    public void after() {
        System.out.println("----------------------------");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Testing " + numbers);
        //When
        ArrayList<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);
        //Then
        //Assert.assertEquals(numbers,oddNumbers);
        Assert.assertTrue(oddNumbers.size()==0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,5,7,243,244,356));
        System.out.println("Testing " + numbers);
        //When
        ArrayList<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(Arrays.asList(3,5,7,243),oddNumbers);
    }
}
