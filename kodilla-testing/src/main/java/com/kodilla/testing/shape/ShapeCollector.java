package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures;

    public ShapeCollector() {
        this.figures = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        int i=0;
        for(Shape figure: figures) {
            if(figure.equals(shape)) {
                figures.remove(i);
                break;
            }
            i++;
        }
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public void showFigures() {
        //to do
    }

}
