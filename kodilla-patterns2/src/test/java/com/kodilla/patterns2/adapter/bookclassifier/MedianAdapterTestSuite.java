package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

//    public  Statistics statistics;

    @Test
    void libraryBTestSuite(){
        //G
        Book bookB0 = new Book("MAx 00", "Krzyrzacy", 2000);
        Book bookB1 = new Book("MAx 11", "Krzyrzacy", 2020);
        Book bookB2 = new Book("MAx 22", "Krzyrzacy", 2001);
        Book bookB3 = new Book("MAx 33", "Krzyrzacy", 2019);
        Book bookB4 = new Book("MAx 44", "Krzyrzacy", 2020);

        BookSignature bookSignature0 = new BookSignature("CEN/20254/00");
        BookSignature bookSignature1 = new BookSignature("CEN/20254/01");
        BookSignature bookSignature2 = new BookSignature("CEN/20254/02");
        BookSignature bookSignature3 = new BookSignature("CEN/20254/03");
        BookSignature bookSignature4 = new BookSignature("CEN/20254/04");

        Map<BookSignature, Book> mapLibrB = new HashMap<>() ;
        mapLibrB.put(bookSignature0, bookB0);
        mapLibrB.put(bookSignature1, bookB1);
        mapLibrB.put(bookSignature2, bookB2);
        mapLibrB.put(bookSignature3, bookB3);
        mapLibrB.put(bookSignature4, bookB4);

        //w
        BookStatistics bookStatistics = new Statistics();

        //T
        assertEquals(2012, bookStatistics.averagePublicationYear(mapLibrB));
        assertEquals(2019, bookStatistics.medianPublicationYear(mapLibrB));

    }

    @Test
    void libraryATestSuite(){
        //G
        com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookB0 = new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Author 00", "Title 1", 2000, "CEN/LIB/A/00");
        com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookB1 = new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Author 01", "Title 1", 2020, "CEN/LIB/A/01");
        com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookB2 = new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Author 02", "Title 1", 2001, "CEN/LIB/A/02");
        com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookB3 = new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Author 03", "Title 1", 2019, "CEN/LIB/A/03");
        com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookB4 = new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("Author 04", "Title 1", 2020, "CEN/LIB/A/04");

        //W
        Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> setBookLibraryA = new HashSet<>();
        setBookLibraryA.add(bookB0);
        setBookLibraryA.add(bookB1);
        setBookLibraryA.add(bookB2);
        setBookLibraryA.add(bookB3);
        setBookLibraryA.add(bookB4);

        MedianAdapter medianAdapter = new MedianAdapter();

        //T
        assertEquals(2012, medianAdapter.publicationYearAverage(setBookLibraryA));
        assertEquals(2019, medianAdapter.publicationYearMedian(setBookLibraryA));
    }
}