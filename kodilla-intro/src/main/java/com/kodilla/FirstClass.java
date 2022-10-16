package com.kodilla;

public class FirstClass {
    public static void main(String[] args) {
            Notebook notebook = new Notebook(600, 1000, 2010);
            System.out.println(notebook.weight + notebook.price); // to sumuje dwa parametry
            System.out.println(notebook.weight + " " + notebook.price); // to wyrzuca parametry osobno
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkYear();


            Notebook heavyNotebook = new Notebook(2000, 1500, 2000);
            System.out.println("heavyNotebook.weight: " + heavyNotebook.weight);
            System.out.println("heavyNotebook.price: " + heavyNotebook.price);
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.checkYear();

            Notebook oldNotebook = new Notebook(1600, 500, 2005);
            System.out.println("oldNotebook.weight: " + oldNotebook.weight);
            System.out.println("oldNotebook.price: " + oldNotebook.price);
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.checkYear();
        }
       }


