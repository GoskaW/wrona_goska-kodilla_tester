package com.kodilla.abstracts.homework;

public class Quad extends Shape{

    private double sideA;

    public Quad(){
        this.sideA = sideA;
    }

    @Override
    public double calculateField() {
        return sideA * sideA;
    }

    @Override
    public double calculateCircumference() {
        return 4 * sideA;
    }
}
