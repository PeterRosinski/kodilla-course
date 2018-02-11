package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int a=756;
        int b=457;
        int resultAdd = calculator.add(a,b);
        if (resultAdd==1213) {
            System.out.println("Test calculator.add OK");
        } else {
            System.out.println("Test calculator.add Error!");
        }
        int resultSubtract = calculator.subtract(a,b);
        if (resultSubtract==299) {
            System.out.println("Test calculator.subtract OK");
        } else {
            System.out.println("Test calculator.subtract Error!");
        }
    }
}
