package com.codecool.bookshelf;

import java.util.*;
import java.util.stream.Collectors;

public class Bookshelf {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks(int releaseYear) {
        return books.stream().filter(book -> book.getReleaseYear() == releaseYear).collect(Collectors.toList());
    }

    public String getLightestAuthor() {
        return books.stream().min(Comparator.comparing(Book::getWeightInGram)).get().getAuthor();
    }

    
}
