package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testTaskFactoryShopping(){
        //G
        TaskFactory factory = new TaskFactory();
        //W
        Task shoping = factory.makeTask(TaskFactory.SHOPPING);
        shoping.executeTask();
        System.out.println( "Is task complete: " + shoping.isTaskExecuted());
        //T
        assertEquals("Amazon shopping.", shoping.getTaskName());

    }

    @Test
    void testTaskFactoryDriving(){
        //G
        TaskFactory factory = new TaskFactory();
        //W
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        System.out.println( "Is task complete: "  + driving.isTaskExecuted());
        //T
        assertEquals("Important drive.", driving.getTaskName());

    }

    @Test
    void testTaskFactoryPainting(){
        //G
        TaskFactory factory = new TaskFactory();
        //W
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        System.out.println( "Is task complete: "  + painting.isTaskExecuted());
        //T
        assertEquals("Big paint", painting.getTaskName());
    }
}

/*

stwórz zestaw testów TaskFactoryTestSuite

Napisz testy sprawdzające, czy fabryka w poprawny sposób tworzy różne typy zadań.

Stworzony kod prześlij do repozytorium GitHub.*/