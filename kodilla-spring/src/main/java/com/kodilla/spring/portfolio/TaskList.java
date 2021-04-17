package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {


    private List<TaskList> toDoList;

    public TaskList(String notesContent) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add(notesContent);
    }
    public void saveToDoTask(){
        System.out.println("I sava task to list toDoList.");
    }


/*    public List<String> getTasks() {
        return tasks;
    }*/
/*
    public String readTask() {
        return "Task: " + tasks ;
    }*/
}
