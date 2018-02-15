package com.kodilla.testing.shape;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return PI*r*r;
    }
}
