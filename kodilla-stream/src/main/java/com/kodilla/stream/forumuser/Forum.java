package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> listOfForumUser = new ArrayList<>();
    public Forum(){
        listOfForumUser.add(new ForumUser(1, "Adam Kowalski", 'M', LocalDate.of(1985,01,01), 35 ));
        listOfForumUser.add(new ForumUser(2, "Mariusz Szklarski", 'M', LocalDate.of(1980,01,01), 3 ));
        listOfForumUser.add(new ForumUser(3, "Anna Jorek", 'F', LocalDate.of(1990,01,01), 135 ));
        listOfForumUser.add(new ForumUser(4, "Violetta Kosa", 'F', LocalDate.of(1970,01,01), 201 ));
        listOfForumUser.add(new ForumUser(5, "Marek Komosa", 'M', LocalDate.of(1995,01,01), 404 ));
        listOfForumUser.add(new ForumUser(6, "Anna Anna", 'F', LocalDate.of(1997,01,01), 0 ));
        listOfForumUser.add(new ForumUser(6, "Anna Komosa", 'F', LocalDate.of(2002,01,01), 150 ));
    }

    public List<ForumUser> getListOfForumUser() {
        return listOfForumUser;
    }
}
