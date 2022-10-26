package com.kodilla.abstracts.homework;

public class Oblong extends Shape{

    private double sidA;
    private double sidB;

    public Oblong() {
        this.sidA = sidA;
        this.sidB = sidB;
    }
    @Override
    public double calculateField() {
        return sidA * sidB;
    }

    @Override
    public double calculateCircumference() {
        return 2 * sidA + 2 * sidB;
    }
}
