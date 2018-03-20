package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving task", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
        driving.executeTask();
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting task", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());
        painting.executeTask();
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping task", shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
        shopping.executeTask();
        Assert.assertTrue(shopping.isTaskExecuted());
    }

}
