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
        String username1Post = username1.sharePost();
        String username2Post = username2.sharePost();
        String username3Post = username3.sharePost();

        //Then
        Assert.assertEquals("Facebook", username1Post);
        Assert.assertEquals("Twitter", username2Post);
        Assert.assertEquals("Snapchat", username3Post);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User username = new Millenials("username");

        //When
        String usernamePostBeforeChange = username.sharePost();
        username.setPublisher(new TwitterPublisher());
        String usernamePostAfterChange = username.sharePost();

        //Then
        Assert.assertEquals("Facebook", usernamePostBeforeChange);
        Assert.assertEquals("Twitter", usernamePostAfterChange);

    }
}
