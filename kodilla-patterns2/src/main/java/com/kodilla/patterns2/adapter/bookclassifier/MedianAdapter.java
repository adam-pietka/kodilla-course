package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    private Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> mapSetToMap (Set<Book> bookSet){
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookALibrary;
        bookALibrary = new HashMap<>();
        bookSet.stream()
                .forEach( i -> {
                    bookALibrary.put(
                            new BookSignature(i.getSignature()),
                            new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                                    i.getAuthor(),
                                    i.getTitle(),
                                    i.getPublicationYear()
                            )
                    );
                });
        return bookALibrary;
    }


    public int publicationYearMedian(Set<Book> bookSet) {
        return medianPublicationYear(mapSetToMap(bookSet));
    }

    public int publicationYearAverage(Set<Book> bookSet) {
        return averagePublicationYear(mapSetToMap(bookSet));
    }
}
