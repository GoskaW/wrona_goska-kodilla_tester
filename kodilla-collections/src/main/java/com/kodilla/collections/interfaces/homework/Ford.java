package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private double speed;


    public Ford(double speed) {
        this.speed = speed;
        }



    @Override
    public double getSpeed() {
        System.out.println("Ford ma prędkość ");
        return speed;
    }


    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 21;
    }
}


