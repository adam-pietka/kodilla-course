package com.kodilla.patterns.factory.tasks;

public class PaintingTask  implements  Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println( taskName + " task is paint on " + color
        +" of " + whatToPaint + ".");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if ((taskName.length() + color.length() )< 10){
            return true;
        } else {
            return false;
        }
    }

    /*public PaintingTask(String taskName, String color, String whatToPaint){

    }*/
}
