package com.kodilla;

public class Book {
    private String author;
    private String title;


    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    static Book of(String author, String title) {
        Book book = new Book(author, title);
        return book;
    }                                               // czyli w ciele tylko obiekt i return?

  }


                                //






