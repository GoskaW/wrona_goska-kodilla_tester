package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {

    private int speed;
    private double accelerate;
    private double brake;

    public Kia (int speed, double accelerate, double brake) {
        this.speed = speed;
        this.accelerate = accelerate;
        this.brake = brake;
    }
    @Override
    public int getSpeed() {
        System.out.println("KIA ma prędkość ");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed -= brake;
    }

    @Override
    public void decreaseSpeed() {

    }
}
