package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {

    private double speed;


    public Kia (double speed) {
        this.speed = speed;

    }
    @Override
    public double getSpeed() {
        System.out.println("KIA ma prędkość ");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed -= 20;
    }

    @Override
    public void decreaseSpeed() {

    }
}
