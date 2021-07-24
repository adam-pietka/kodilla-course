package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentsHomework implements Observable {
    private final List<String> homeworksList;
    private final List<ObserverHomeworks> observers;
    private final String studentsClassID;

    public StudentsHomework(String studentClass) {
        homeworksList = new ArrayList<>();
        observers = new ArrayList<>();
        this.studentsClassID = studentClass;
    }

    public void addHomework(String homework){
        homeworksList.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomeworks observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for (ObserverHomeworks observerHomeworks: observers) {
            observerHomeworks.update(this);
        }
    }

    @Override
    public void deleteObserver(ObserverHomeworks observer) {
        observers.remove(observer);
    }

    public String getStudentsClassID() {
        return studentsClassID;
    }

    public List<String> getHomeworksList() {
        return homeworksList;
    }

    public List<ObserverHomeworks> getObservers() {
        return observers;
    }
}