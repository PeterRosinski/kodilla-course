package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User username1 = new Millenials("username1");
        User username2 = new YGeneration("username2");
        User username3 = new ZGeneration("username3");

        //When
        String username1Publisher = username1.getPublisher();
        String username2Publisher = username2.getPublisher();
        String username3Publisher = username3.getPublisher();

        //Then
        Assert.assertEquals("Facebook", username1Publisher);
        Assert.assertEquals("Twitter", username2Publisher);
        Assert.assertEquals("Snapchat", username3Publisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User username = new Millenials("username");

        //When
        String usernameBeforeChange = username.getPublisher();
        username.sharePost(new TwitterPublisher());
        String usernameAfterChange = username.getPublisher();

        //Then
        Assert.assertEquals("Facebook", usernameBeforeChange);
        Assert.assertEquals("Twitter", usernameAfterChange);

    }
}
