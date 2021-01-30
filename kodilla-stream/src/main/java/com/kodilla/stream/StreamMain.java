package com.kodilla.stream;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import  com.kodilla.stream.beautifier.PoemBeautifier;
import  com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        // MAP ************* START
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultOfMarForForumUser = forum.getListOfForumUser().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPostCounter() > 10)
                .filter(forumUser ->(LocalDate.now().getYear() -  forumUser.getDateOfBirth().getYear() ) > 30 )
                .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));

        System.out.println("# elements in list: " + theResultOfMarForForumUser.size());
        theResultOfMarForForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out:: println);

        System.out.println("\n****************************************************************\n");

        // Lista ************************************************************ START
        forum.getListOfForumUser().stream()
                .filter(forumUser -> forumUser.getSex() == 'F')
                .filter(forumUser -> forumUser.getPostCounter() > 1)
                .filter(forumUser ->  (LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() )> 30 )
                .forEach(System.out::println);
    }
}

