package com.kodilla.patterns.factory.tasks;

public class DrivingTask  implements  Task{
    private final String taskName;
    private final  String where;
    private final String using ;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName + " task is, drive to: "
        + where + ", chosen vehicle is: " + using + ".");


    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if ( where.length() % 2 == 0){
            return  true;
        } else {
            return false;
        }

    }

}