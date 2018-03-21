package com.kodilla.patterns.strategy.social;

public class User {

    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public SocialPublisher getPublisher() {
        return socialPublisher;
    }

    public void setPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

}
