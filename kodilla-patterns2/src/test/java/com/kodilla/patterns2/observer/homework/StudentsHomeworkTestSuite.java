package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsHomeworkTestSuite {

    @Test
    void testUpdate(){

        //G
        MentorUser mentorFirst = new MentorUser("Blond Mentor");
        MentorUser mentorSecond = new MentorUser("Red head Mentor");
        StudentsHomework studentGroup2021_2022 = new StudentsHomework("Group 1A in year 2021/2022");
        StudentsHomework studentGroup2020_2021 = new StudentsHomework("Group 0A in year 2020/2021");

        studentGroup2020_2021.registerObserver(mentorFirst);
        studentGroup2020_2021.registerObserver(mentorSecond);

        studentGroup2021_2022.registerObserver(mentorSecond);
        //W
        studentGroup2020_2021.addHomework("Homework level 1");
        studentGroup2020_2021.addHomework("Homework level 2");
        studentGroup2020_2021.addHomework("Homework level 3");

        studentGroup2021_2022.addHomework("Homework level 22");
        studentGroup2021_2022.addHomework("Homework level 23");

        //T
        assertEquals(3, mentorFirst.getUpdateCount());
        assertEquals(5, mentorSecond.getUpdateCount());
    }

}
