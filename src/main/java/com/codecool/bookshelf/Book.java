package com.codecool.bookshelf;

public abstract class Book {
    private String title;
    private String author;
    private int releaseYear;
    private int numberOfPages;
    private int weightInGram;

    public Book (String title, String author, int releaseYear, int numberOfPages, int weightInGram) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.weightInGram = weightInGram;
    }


    public String getBookInfo(String title, String author, int releaseYear) {
        return author + ": " + title + " (" + releaseYear + ")";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getWeightInGram() {
        return weightInGram;
    }
}
