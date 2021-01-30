package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int ID;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int postCounter;

    public ForumUser(int ID, String userName, char sex, LocalDate dateOfBirth, int postCounter) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCounter = postCounter;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCounter() {
        return postCounter;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "User ID= " + ID +
                ", User Name= '" + userName + '\'' +
                ", sex= " + sex +
                ", date Of Birth= " + dateOfBirth +
                ", post Counter= " + postCounter +
                '}';
    }
}
