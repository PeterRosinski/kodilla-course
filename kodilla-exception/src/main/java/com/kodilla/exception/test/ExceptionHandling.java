package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String text = secondChallenge.probablyIWillThrowException(0, 1.5);
            System.out.println(text);
        } catch (Exception e) {
            System.out.println("Error!!!");
        } finally {
            System.out.println("But Ok;-)");
        }

    }

}
