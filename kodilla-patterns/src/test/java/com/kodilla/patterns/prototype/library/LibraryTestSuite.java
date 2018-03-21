package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    private static Library library;
    private static Book book;
    private static Library clonedLibrary;
    private static Library deepClonedLibrary;

    public void makeLibrary() {

        library = new Library("Library number 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> library.getBooks().add(new Book("Book number " + n, "Author number " + n, LocalDate.of(2000,1,1))));

        book = new Book("Book number 10", "Author number 10", LocalDate.of(2000,1,1));
        library.getBooks().add(book);

    }

    public void makeShallowCopy() {

        clonedLibrary = null;
        try {
            clonedLibrary =  library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book);

    }

    public void makeDeepLibrary() {

        deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().remove(book);

    }

    @Test
    public void testGetBooksWithLibrary() {

        //Given & When
        makeLibrary();
        System.out.println(library);
        //Then
        Assert.assertEquals("Library number 1",library.getName());
        Assert.assertEquals(10,library.getBooks().size());

    }

    @Test
    public void testGetBooksWithClonedLibrary() {

        //Given
        makeLibrary();
        //When
        makeShallowCopy();
        System.out.println(clonedLibrary);
        //Then
        Assert.assertEquals("Library number 2",clonedLibrary.getName());
        Assert.assertEquals(9,clonedLibrary.getBooks().size());

    }

    @Test
    public void testGetBooksWithDeepClonedLibrary() {

        //Given
        makeLibrary();
        //When
        makeDeepLibrary();
        System.out.println(deepClonedLibrary);
        //Then
        Assert.assertEquals("Library number 3",deepClonedLibrary.getName());
        Assert.assertEquals(10,deepClonedLibrary.getBooks().size());

    }

}
