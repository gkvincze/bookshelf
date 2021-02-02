package com.codecool.bookshelf;

public class HardCoverBook extends Book {
    private final static int PAGEWEIGHT = 10;
    private final static int COVERWEIGHT = 100;

    public HardCoverBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages*PAGEWEIGHT+COVERWEIGHT);

    }
}



/*
1 pg = 10 gr
hardcover = 100 gr
weight = pgweight + cover
 */