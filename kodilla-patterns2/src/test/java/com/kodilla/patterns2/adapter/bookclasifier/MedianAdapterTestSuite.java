package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> bookCollection = new HashSet<>();
        Book book1 = new Book("Graham Masterton", "Nocna plaga", 1991, "12345");
        Book book2 = new Book("Graham Masterton", "Powrot Wojownikow Nocy", 2000, "67891");
        Book book3 = new Book("Graham Masterton", "Dziewiaty koszmar", 2009, "23456");
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int medianYear = medianAdapter.publicationYearMedian(bookCollection);

        // Then
        assertEquals(2000, medianYear);
    }
}
