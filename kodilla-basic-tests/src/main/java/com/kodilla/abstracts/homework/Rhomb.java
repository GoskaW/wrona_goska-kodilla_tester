package com.kodilla.abstracts.homework;

public class Rhomb extends Shape{

    private double side;
    private double height;

    public Rhomb (){
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateField() {
        return side * height;
    }

    @Override
    public double calculateCircumference() {
        return 4 * side;
    }
}
