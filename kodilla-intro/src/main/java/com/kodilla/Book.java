package com.kodilla;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }


    static Book of() {
        Book book = new Book("Janina Bąk", "Statystycznie rzecz biorąc.");
        return;
    }
                // poprawiłam obiekt, ale nie wiem jak to wyciągnąć. Return nie zwraca, bo brakuje mu wartości. próbowałam getterami. Poddaje sie, pokaż mi proszę jak to powinno wyglądać.


}


                                //






