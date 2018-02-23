package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given
        int[] array = new int[]{2,4,6,8,10,44,51,65,676,12,543,234,29,1777,2,56,761,345,987,1000};

        //When
        double average = ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(330.6,average,0.01);
    }

}
