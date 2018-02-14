package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}

class StatisticsCalculator {

    private int usersAmount;
    private int postsAmount;
    private int commentsAmount;
    private double avgPostsAmountPerUser = 0.0;
    private double avgCommentsAmountPerUser = 0.0;
    private double avgCommentsAmountPerPost = 0.0;

    public void calculateAdvStatistics(Statistics statistics) {

        usersAmount = statistics.usersNames().size();
        postsAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();
        if(usersAmount!=0) {
            avgPostsAmountPerUser = (double) postsAmount / (double) usersAmount;
            avgCommentsAmountPerUser = (double) commentsAmount / (double) usersAmount;
        }
        if(postsAmount!=0) {
            avgCommentsAmountPerPost = (double) commentsAmount / (double) postsAmount;
        }

    }

    public void showStatistics() {

        System.out.println("The amount of users: " + usersAmount);
        System.out.println("The amount of posts: " + postsAmount);
        System.out.println("The amount of comments: " + commentsAmount);
        System.out.println("The average amount of posts per user: " + avgPostsAmountPerUser);
        System.out.println("The average amount of comments per user: " + avgCommentsAmountPerUser);
        System.out.println("The average amount of comments per post: " + avgCommentsAmountPerPost);

    }

    public int getUsersAmount() {
        return usersAmount;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    public int getCommentsAmount() {
        return commentsAmount;
    }

    public double getAvgPostsAmountPerUser() {
        return avgPostsAmountPerUser;
    }

    public double getAvgCommentsAmountPerUser() {
        return avgCommentsAmountPerUser;
    }

    public double getAvgCommentsAmountPerPost() {
        return avgCommentsAmountPerPost;
    }
}
