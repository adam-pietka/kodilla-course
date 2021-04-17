package com.kodilla.spring.portfolio;


import java.util.ArrayList;
import java.util.List;

public final class Board {
    List<TaskList> toDoList =new ArrayList<>();
    List<TaskList> inProgressList =new ArrayList<>();
    List<TaskList> doneList = new ArrayList<>();

//    final TaskList taskList;

//    public Board(final TaskList taskList){
//        this.taskList = taskList;
//    }

    public void addToDoList(TaskList newTask){
        toDoList.add(newTask);
    }

    public void addInProgress(TaskList newTask){
        inProgressList.add(newTask);
    }
    public void addDoneList(TaskList newTask){
        doneList.add(newTask);
    }

    public List<TaskList> getToDoList() {
        return toDoList;
    }

    public List<TaskList> getInProgressList() {
        return inProgressList;
    }

    public List<TaskList> getDoneList() {
        return doneList;
    }
}
