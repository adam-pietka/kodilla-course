package com.kodilla.spring.portfolio;


public final class Board {
//    private TaskList taskList;
//    List<TaskList> toDoList = new ArrayList<>();
//    private TaskList toDoList;

    final TaskList taskList;

    public Board(final TaskList taskList){
        this.taskList = taskList;
    }

    public void toDoList(){
        taskList.saveToDoTask();
    }


}
