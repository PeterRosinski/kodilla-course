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

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Circle)) return false;
        final Circle e = (Circle) o;
        return Double.doubleToLongBits(this.r)==Double.doubleToLongBits(e.r);
    }
}
