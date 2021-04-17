package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    private static Library library;

    @BeforeAll
    public static void testAddBook(){

        Book bookKrzyzacy = new Book("Krzyżacy", "Sienkiewicz", LocalDate.of(2012, 02, 01));
        Book bookAnia = new Book("Ania z zielonego wzgorza", "Anna", LocalDate.of(1912, 04, 11));
        Book bookDon = new Book("Don Jones", "Don ", LocalDate.of(1012, 10, 13));

        library = new Library("Turquoise in L.A. inc.");
        library.getBooks().add(bookKrzyzacy);
        library.getBooks().add(bookAnia);
        library.getBooks().add(bookDon);
    }

    @Test
    void testGetBooks(){
        // given
        //when
        int result =  library.getBooks().size();

        //then
        assertEquals(3, result);
    }

    @Test
    void testGetName(){
        //Given
        //when
        String result = library.getName();

        //Then
        assertEquals("Turquoise in L.A. inc.",result );
    }

    @Test
    void testRemoveGetBooks(){
        // given
        //when
        Book bookDonKichot = new Book("Don Kichot", "Don ", LocalDate.of(1012, 10, 13));
        library.getBooks().add(bookDonKichot);
        int result =  library.getBooks().size();
        assertEquals(4, result);

        library.getBooks().remove(bookDonKichot);
        result =  library.getBooks().size();
        assertEquals(4, result);
        //then

    }



}