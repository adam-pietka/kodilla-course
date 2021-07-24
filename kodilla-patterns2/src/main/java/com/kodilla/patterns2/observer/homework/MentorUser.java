package com.kodilla.patterns2.observer.homework;

public class MentorUser implements ObserverHomeworks {

    public MentorUser(String mentorName) {
        this.mentorName = mentorName;
    }

    private final String mentorName;
    private int updateCount;

    @Override
    public void update(StudentsHomework studentsHomework) {
        System.out.println(
                mentorName + " : New homeWork in students Class - " + studentsHomework.getStudentsClassID() +
                        "\n (total homeworks to check: " + studentsHomework.getHomeworksList().size() + " homeworks.");
        updateCount ++ ;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}