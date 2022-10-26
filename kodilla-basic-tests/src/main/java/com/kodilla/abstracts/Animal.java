package com.kodilla.abstracts;

public abstract class Animal {
    private int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public abstract void giveVoice();       // dzięki temu, każda klasa dziedzicząca po Animal, będzie musiała wymusić własną implementacje
}                                           // metoda nie ma ciała, brak nawiasów klamrowych
