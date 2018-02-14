package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("------------------------------");
        System.out.println("Preparing to execute test #" + testCounter);
        System.out.println("------------------------------");
    }

    @Test
    public void testPostsAmountEqualsZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        userNames.add("User 1");
        userNames.add("User 2");
        userNames.add("User 3");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println("Testing usersAmount");
        Assert.assertEquals(3,statisticsCalculator.getUsersAmount());
        System.out.println("Testing postsAmount");
        Assert.assertEquals(0,statisticsCalculator.getPostsAmount());
        System.out.println("Testing commentsAmount");
        Assert.assertEquals(0,statisticsCalculator.getCommentsAmount());
        System.out.println("Testing avgPostsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgPostsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerPost");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerPost()));

    }

    @Test
    public void testPostsAmountEqualsOneThousand() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for(int i=1;i<=30;i++) {
            userNames.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println("Testing usersAmount");
        Assert.assertEquals(30,statisticsCalculator.getUsersAmount());
        System.out.println("Testing postsAmount");
        Assert.assertEquals(1000,statisticsCalculator.getPostsAmount());
        System.out.println("Testing commentsAmount");
        Assert.assertEquals(0,statisticsCalculator.getCommentsAmount());
        System.out.println("Testing avgPostsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(33.333333333333333),Double.doubleToLongBits(statisticsCalculator.getAvgPostsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerPost");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerPost()));

    }

    @Test
    public void testCommentsAmountEqualsOne() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for(int i=1;i<=30;i++) {
            userNames.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(30);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println("Testing usersAmount");
        Assert.assertEquals(30,statisticsCalculator.getUsersAmount());
        System.out.println("Testing postsAmount");
        Assert.assertEquals(30,statisticsCalculator.getPostsAmount());
        System.out.println("Testing commentsAmount");
        Assert.assertEquals(0,statisticsCalculator.getCommentsAmount());
        System.out.println("Testing avgPostsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(1.0),Double.doubleToLongBits(statisticsCalculator.getAvgPostsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerPost");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerPost()));

    }

    @Test
    public void testCommentsAmountLessThanPostsAmount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for(int i=1;i<=10;i++) {
            userNames.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(30);
        when(statisticsMock.commentsCount()).thenReturn(15);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println("Testing usersAmount");
        Assert.assertEquals(10,statisticsCalculator.getUsersAmount());
        System.out.println("Testing postsAmount");
        Assert.assertEquals(30,statisticsCalculator.getPostsAmount());
        System.out.println("Testing commentsAmount");
        Assert.assertEquals(15,statisticsCalculator.getCommentsAmount());
        System.out.println("Testing avgPostsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(3.0),Double.doubleToLongBits(statisticsCalculator.getAvgPostsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(1.5),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerPost");
        Assert.assertEquals(Double.doubleToLongBits(0.5),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerPost()));

    }

    @Test
    public void testCommentsAmountMoreThanPostsAmount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for(int i=1;i<=10;i++) {
            userNames.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(30);
        when(statisticsMock.commentsCount()).thenReturn(60);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println("Testing usersAmount");
        Assert.assertEquals(10,statisticsCalculator.getUsersAmount());
        System.out.println("Testing postsAmount");
        Assert.assertEquals(30,statisticsCalculator.getPostsAmount());
        System.out.println("Testing commentsAmount");
        Assert.assertEquals(60,statisticsCalculator.getCommentsAmount());
        System.out.println("Testing avgPostsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(3.0),Double.doubleToLongBits(statisticsCalculator.getAvgPostsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(6.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerPost");
        Assert.assertEquals(Double.doubleToLongBits(2.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerPost()));

    }

    @Test
    public void testUsersAmountEqualsZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        for(int i=1;i<=100;i++) {
            userNames.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println("Testing usersAmount");
        Assert.assertEquals(100,statisticsCalculator.getUsersAmount());
        System.out.println("Testing postsAmount");
        Assert.assertEquals(100,statisticsCalculator.getPostsAmount());
        System.out.println("Testing commentsAmount");
        Assert.assertEquals(1000,statisticsCalculator.getCommentsAmount());
        System.out.println("Testing avgPostsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(1.0),Double.doubleToLongBits(statisticsCalculator.getAvgPostsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(10.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerPost");
        Assert.assertEquals(Double.doubleToLongBits(10.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerPost()));

    }

    @Test
    public void testUsersAmountEqualsOneHundred() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println("Testing usersAmount");
        Assert.assertEquals(0,statisticsCalculator.getUsersAmount());
        System.out.println("Testing postsAmount");
        Assert.assertEquals(50,statisticsCalculator.getPostsAmount());
        System.out.println("Testing commentsAmount");
        Assert.assertEquals(100,statisticsCalculator.getCommentsAmount());
        System.out.println("Testing avgPostsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgPostsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerUser");
        Assert.assertEquals(Double.doubleToLongBits(0.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerUser()));
        System.out.println("Testing avgCommentsAmountPerPost");
        Assert.assertEquals(Double.doubleToLongBits(2.0),Double.doubleToLongBits(statisticsCalculator.getAvgCommentsAmountPerPost()));

    }

}
