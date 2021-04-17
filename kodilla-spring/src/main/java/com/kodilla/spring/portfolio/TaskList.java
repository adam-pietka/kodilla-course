package com.kodilla.spring.portfolio;

import java.util.ArrayList;

public class TaskList {
    Board board;

    private final ArrayList<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }
    public void addTask(String task){
        tasks.add(task);
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

}
/*Utwórz również klasę TaskList w tym samym pakiecie – powinna ona zawierać właściwość
        List<String> tasks.
 Jej zawartość powinna być inicjowana w konstruktorze przy pomocy polecenia
        tasks = new ArrayList<>();*/