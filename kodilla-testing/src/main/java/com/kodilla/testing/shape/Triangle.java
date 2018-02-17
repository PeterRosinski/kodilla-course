package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a,h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;

    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 0.5*a*h;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Triangle)) return false;
        final Triangle e = (Triangle) o;
        return Double.doubleToLongBits(this.a)==Double.doubleToLongBits(e.a) && Double.doubleToLongBits(this.h)==Double.doubleToLongBits(e.h);
    }
}
