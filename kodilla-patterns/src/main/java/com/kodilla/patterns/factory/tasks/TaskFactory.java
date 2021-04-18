package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING:
                return new ShoppingTask("Amazon shopping.", "Oil", 2);
            case PAINTING:
                return new PaintingTask("Big paint", "Red", "Wall Street");
            case DRIVING:
                return new DrivingTask("Important drive.", "Cracow", "Mazda NSX 5.0");
            default:
                return null;
        }
    }

}
/*Następnie wymyśl, w jaki sposób przechowywać informację o tym,
 czy zadanie jest już wykonane
 i napisz fabrykę TaskFactory,
  która będzie tworzyła zadania zgodnie ze wzorcem Factory.
 */