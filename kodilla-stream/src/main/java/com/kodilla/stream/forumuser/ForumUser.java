package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final Sex sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPublishedPosts;

    public ForumUser(final int userId, final String userName, final Sex sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPublishedPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Sex getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
}
