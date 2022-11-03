package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private double speed;


    public Opel (double speed) {
        this.speed = speed;


    }
    @Override
    public double getSpeed() {
        System.out.println("Opel ma prędkość ");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 35;

    }
}
