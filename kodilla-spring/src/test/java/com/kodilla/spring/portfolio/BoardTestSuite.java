package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testReadTask(){
        TaskList taskList = new TaskList();
        taskList.addTask("test");
        Board board = new Board();
        board.addToDoList(taskList);
        System.out.println(board.getToDoList());
    }

    @Test
    void testTaskAdd(){
        //given

        //when

        //then

    }

    /*W katalogu src/test/java utwórz pakiet com.kodilla.spring.portfolio, a w nim zestaw testów BoardTestSuite.
    Utwórz też test testTaskAdd(), który doda do każdej z list po jednym zadaniu
    (wcześniej uzyskując dostęp do beana klasy Board).
    Test powinien sprawdzać, czy dodane zadania da się odczytać.*/
}
