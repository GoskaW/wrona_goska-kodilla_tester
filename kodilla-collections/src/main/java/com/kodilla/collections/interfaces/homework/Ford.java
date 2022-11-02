package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;
    private double accelerate;
    private double brake;

    public Ford(int speed, double accelerate, double brake) {
        this.speed = speed;
        this.accelerate = accelerate;
        this.brake = brake;
    }


    @Override
    public int getSpeed() {
        System.out.println("Ford ma prędkość ");
        return speed;
    }


    @Override
    public void increaseSpeed() {
        speed += accelerate;
    }

    @Override
    public void decreaseSpeed() {
        speed -= brake;
    }
}


