package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(ObserverHomeworks observerHomeworks);
    void notifyObservers();
    void deleteObserver(ObserverHomeworks observerHomeworks);
}