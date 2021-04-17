package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        Book bookDonKichot = new Book("Don Kichot", "Don ", LocalDate.of(1012, 10, 13));
        library.getBooks().add(bookDonKichot);

        //when

        //then
        int result =  library.getBooks().size();
        assertEquals(4, result);
        //when
        library.getBooks().remove(bookDonKichot);
        //then
        result =  library.getBooks().size();
        assertEquals(3, result);
    }
    @Test
    void testToString(){
        System.out.println( library.toString());
    }

    @Test
    void testShallowCopy(){
        // given
        // was added  3 books below is 4'th book
        Book pokot = new Book("Pokot", "Pan X", LocalDate.of(2010,01,01));
        library.getBooks().add(pokot);

        //When
        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowCopy();
            shallowCloneLibrary.setName("Chicago Library at the corner 9'th and 10'th street.");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        library.getBooks().remove(pokot);

        //Then
        library.toString();
        shallowCloneLibrary.toString();
        assertEquals(3,library.getBooks().size());
        assertEquals(3,shallowCloneLibrary.getBooks().size());

        //then
    }
    @Test
    void testDeepCopy(){

        //Given (3 book was added BeforeAll, below is 4'th)
        Book tomSoyer = new Book("Tom Soyer Adventure.", "mr. Y", LocalDate.of(1810,01,01));
        library.getBooks().add(tomSoyer);

        //When
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Libbrary on Deep street.");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        library.getBooks().remove(tomSoyer);

        //Then
        library.toString();
        deepCloneLibrary.toString();
        assertNotEquals(library.getBooks().size(), deepCloneLibrary.getBooks().size());

    }
}