package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Piotr R.", "Zaginiony w akcji", 1999, "00056754"));
        books.add(new Book("Hubert R.", "Ania z zielonego", 2017, "00044464"));
        books.add(new Book("Piotr R.", "Java jest super", 2003, "00156754"));
        books.add(new Book("Anna Z.", "Matematyka", 2000, "03556764"));
        books.add(new Book("Marian P.", "Atlas zwierząt", 2010, "00556564"));
        books.add(new Book("Zdzisław K.", "Madzia w ogrodzie", 1968, "08676754"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(median, 2003);
    }

}
