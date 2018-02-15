package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        System.out.println("------------------------------");
    }

    @Test
    public void testAddFiguresToListAndGetFigures() {

        //Given
        ShapeCollector shapes = new ShapeCollector();
        Shape circle1 = new Circle(5.3);
        Shape circle2 = new Circle(2.7);
        Shape square1 = new Square(1.1);
        Shape square2 = new Square(1.2);
        Shape triangle1 = new Triangle(1.0,2.0);
        Shape triangle2 = new Triangle(2.0,1.0);

        //When
        shapes.addFigure(circle1);
        shapes.addFigure(circle2);
        shapes.addFigure(square1);
        shapes.addFigure(square2);
        shapes.addFigure(triangle1);
        shapes.addFigure(triangle2);
        Shape figure1 = shapes.getFigure(0);
        Shape figure2 = shapes.getFigure(1);
        Shape figure3 = shapes.getFigure(2);
        Shape figure4 = shapes.getFigure(3);
        Shape figure5 = shapes.getFigure(4);
        Shape figure6 = shapes.getFigure(5);

        //Then
        Assert.assertEquals("1",circle1, figure1);
        Assert.assertEquals("2",circle2, figure2);
        Assert.assertEquals("3",square1, figure3);
        Assert.assertEquals("4",square2, figure4);
        Assert.assertEquals("5",triangle1, figure5);
        Assert.assertEquals("6",triangle2, figure6);

    }

    @Test
    public void testRemoveFigureFromList() {

        //Given
        ShapeCollector shapes = new ShapeCollector();
        Shape circle1 = new Circle(5.3);
        Shape circle2 = new Circle(2.7);
        Shape square1 = new Square(1.1);
        Shape square2 = new Square(1.2);
        Shape triangle1 = new Triangle(1.0,2.0);
        Shape triangle2 = new Triangle(2.0,1.0);

        //When
        shapes.addFigure(circle1);
        shapes.addFigure(circle2);
        shapes.addFigure(square1);
        shapes.addFigure(square2);
        shapes.addFigure(triangle1);
        shapes.addFigure(triangle2);
        shapes.addFigure(circle2);

        shapes.removeFigure(circle2);
        shapes.removeFigure(triangle1);

        Shape figure1 = shapes.getFigure(0);
        Shape figure2 = shapes.getFigure(1);
        Shape figure3 = shapes.getFigure(2);
        Shape figure4 = shapes.getFigure(3);
        Shape figure5 = shapes.getFigure(4);

        //Then
        Assert.assertEquals("1",circle1, figure1);
        Assert.assertEquals("2",square1, figure2);
        Assert.assertEquals("3",square2, figure3);
        Assert.assertEquals("4",triangle2, figure4);
        Assert.assertEquals("5",circle2, figure5);

    }

    @Test
    public void testRemoveFigureThatIsNotOnTheList() {

        //Given
        ShapeCollector shapes = new ShapeCollector();
        Shape circle1 = new Circle(5.3);
        Shape circle2 = new Circle(2.7);
        Shape square1 = new Square(1.1);
        Shape square2 = new Square(1.2);
        Shape triangle1 = new Triangle(1.0,2.0);
        Shape triangle2 = new Triangle(2.0,1.0);

        //When
        shapes.addFigure(circle1);
        shapes.addFigure(circle2);
        shapes.addFigure(square1);
        shapes.addFigure(square2);
        shapes.addFigure(triangle1);

        shapes.removeFigure(triangle2);

        Shape figure1 = shapes.getFigure(0);
        Shape figure2 = shapes.getFigure(1);
        Shape figure3 = shapes.getFigure(2);
        Shape figure4 = shapes.getFigure(3);
        Shape figure5 = shapes.getFigure(4);

        //Then
        Assert.assertEquals("1",circle1, figure1);
        Assert.assertEquals("2",circle2, figure2);
        Assert.assertEquals("3",square1, figure3);
        Assert.assertEquals("4",square2, figure4);
        Assert.assertEquals("5",triangle1, figure5);

    }

}
