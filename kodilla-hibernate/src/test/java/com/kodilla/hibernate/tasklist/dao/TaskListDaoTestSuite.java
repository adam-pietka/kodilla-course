package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCR = "It's a task to do - Test. - ADAM" ;

    @Test
    void TaskListDaoTestSuite(){
        //G
        TaskList taskListToDo = new TaskList("ToDo", DESCR);

        //W
        taskListDao.save(taskListToDo);

        //T
        int id = taskListToDo.getId();
        Optional<TaskList> readTasks = taskListDao.findById(id);
        assertTrue(readTasks.isPresent());

        //CleanUp
        taskListDao.deleteById(id);

    }

    @Test
    void  testFindByListName(){
        //G
        TaskList listDone = new TaskList("Done", "Register new user.");
        TaskList listDoneSec = new TaskList("Done", "Delete old user.");
        TaskList taskListToDo = new TaskList("ToDo", DESCR);

        String nameDoneList = listDone.getListName();

        taskListDao.save(listDone);
        taskListDao.save(taskListToDo);
        taskListDao.save(listDoneSec);

        //W
        List<TaskList> readTaskList = taskListDao.findByListName(nameDoneList);

        //T
        assertEquals(2,readTaskList.size());

        //Clean
        taskListDao.deleteAll();
    }
}
