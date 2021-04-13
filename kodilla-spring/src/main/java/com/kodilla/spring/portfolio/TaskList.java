package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList(String notesContent) {
        tasks = new ArrayList<>();
        tasks.add(notesContent);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String readTask() {
        return "Task: " + tasks ;
    }
}
