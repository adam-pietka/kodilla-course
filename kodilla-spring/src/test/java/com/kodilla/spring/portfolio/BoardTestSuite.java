package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testReadTask(){
        TaskList taskList = new TaskList("Testing reading task.");
        System.out.println(taskList.readTask());

       /* Arrays.stream(taskList.readTask())
                .forEach(System.out::println);*/

    }
}
