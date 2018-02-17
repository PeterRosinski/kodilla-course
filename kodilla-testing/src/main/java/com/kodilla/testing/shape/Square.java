package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a*a;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Square)) return false;
        final Square e = (Square) o;
        return Double.doubleToLongBits(this.a)==Double.doubleToLongBits(e.a);
    }
}
