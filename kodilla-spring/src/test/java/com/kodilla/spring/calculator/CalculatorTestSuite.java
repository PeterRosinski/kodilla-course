package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddCalculation() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator)context.getBean("calculator");
        //When
        double addCalculation = calculator.add(5.0,15.0);
        //Then
        Assert.assertEquals(20.0,addCalculation,0.1);

    }

    @Test
    public void testSubCalculation() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator)context.getBean("calculator");
        //When
        double subCalculation = calculator.sub(15.0,5.0);
        //Then
        Assert.assertEquals(10.0,subCalculation,0.1);

    }

    @Test
    public void testMulCalculation() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator)context.getBean("calculator");
        //When
        double mulCalculation = calculator.mul(10.0,5.0);
        //Then
        Assert.assertEquals(50.0,mulCalculation,0.1);

    }

    @Test
    public void testDivCalculation() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator)context.getBean("calculator");
        //When
        double divCalculation=0.0;
        try {
            divCalculation = calculator.div(10.0, 2.5);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

        //Then
        Assert.assertEquals(4.0,divCalculation,0.1);

    }

}
