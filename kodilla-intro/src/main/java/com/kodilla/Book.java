package com.kodilla;

public class Book {
        private String author;
        private String title;

        public Book(String author, String title){
                this.author = author;
                this.title = title;
        }

         static Book of ("Janina Bąk", "Statystycznie rzecz biorąc.") {
          Book book = new Book();
          Book book = Book.of();
        }

        }

                                // statyczna metoda of przyjmuje dwa argumenty typu string. Jest stworzony obiekt oraz wywołana metoda






