package com.codecool.bookshelf;

import com.codecool.bookshelf.model.books.Book;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Bookshelf {
    List<Book> books = new LinkedList<>();

    public Bookshelf() {}

    public Bookshelf(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(final int year){
        return books.stream().filter(book -> book.getReleaseYear() == year ).collect(Collectors.toList());
    }

    //public List<Book> getAllBooks(){
        //return book;
    //}

    public String getLightestAuthor(){
        return books.stream().min(Comparator.comparing(Book::getWeightInGram)).get().getBookInfo();
    }
/*
    public void printBooks(){
        for (Book book : shelf) {
            System.out.println(book.getBookInfo());
        }
    }

    public String getAuthorOfMostWrittenPages(){
        return shelf.stream().max(Comparator.comparing(Book::getNumberOfPages)).get().getBookInfo();
    }

 */
}
