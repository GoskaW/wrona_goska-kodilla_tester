package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Quad quad = new Quad();
        quad.calculateField();
        quad.calculateCircumference();

        Oblong oblong = new Oblong();
        oblong.calculateField();
        oblong.calculateCircumference();

        Rhomb rhomb = new Rhomb ();
        rhomb.calculateField();
        rhomb.calculateCircumference();
    }
}
