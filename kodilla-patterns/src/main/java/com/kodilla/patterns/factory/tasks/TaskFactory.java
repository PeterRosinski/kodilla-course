package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {

        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving task", "Warsaw", "Driving");
            case PAINTING:
                return new PaintingTask("Painting task", "black&white", "natur");
            case SHOPPING:
                return new ShoppingTask("Shopping task", "vegetables", 10.0);
            default:
                return null;
        }

    }

}
