package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Library library = new Library("Library number 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> library.getBooks().add(new Book("Book number " + n, "Author number " + n, LocalDate.of(2000,1,1))));

        Book book = new Book("Book number 10", "Author number 10", LocalDate.of(2000,1,1));
        library.getBooks().add(book);

        Library clonedLibrary = null;
        try {
            clonedLibrary =  library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book);

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals("Library number 1",library.getName());
        Assert.assertEquals(9,library.getBooks().size());
        Assert.assertEquals("Library number 2",clonedLibrary.getName());
        Assert.assertEquals(9,clonedLibrary.getBooks().size());
        Assert.assertEquals("Library number 3",deepClonedLibrary.getName());
        Assert.assertEquals(10,deepClonedLibrary.getBooks().size());

    }

}
