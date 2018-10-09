package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        // Given
        Book book = new Book("Book #1", "Author #1", LocalDate.of(1990, 6, 8));
        Book book2 = new Book("Book #2", "Author #2", LocalDate.of(2001, 5, 15));
        Book book3 = new Book("Book #3", "Author #3", LocalDate.of(2006, 2, 28));
        Book book4 = new Book("Book #4", "Author #4", LocalDate.of(1870, 10, 1));

        Library library = new Library("Prototype Library");
        library.getBooks().add(book);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library copiedLibrary = null;
        try {
            copiedLibrary = library.shallowCopy();
            copiedLibrary.setName("Library's shallow clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopiedLibrary = null;
        try {
            deepCopiedLibrary = library.deepCopy();
            deepCopiedLibrary.setName("Library's deep clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book4);

        //then
        System.out.println(library);
        System.out.println(copiedLibrary);
        System.out.println(deepCopiedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, copiedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), copiedLibrary.getBooks().size());
        Assert.assertEquals(4, deepCopiedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), deepCopiedLibrary.getBooks().size());
    }
}
