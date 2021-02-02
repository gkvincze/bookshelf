package com.codecool.bookshelf;

public class PaperbackBook extends Book{
    private final static int PAGEWEIGHT = 10;
    private final static int COVERWEIGHT = 20;

    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages*PAGEWEIGHT+COVERWEIGHT);
    }
}


/*
1pg = 10 gr
cover = 20 gr
 */