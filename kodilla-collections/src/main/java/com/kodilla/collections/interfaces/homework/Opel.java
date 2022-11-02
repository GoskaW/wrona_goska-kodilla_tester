package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int speed;

    public Opel (int speed) {
        this.speed = speed;

    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int result = this.speed + 20;
        System.out.println(result);
    }

    @Override
    public void decreaseSpeed() {
        int result = this.speed - 25;
        System.out.println(result);

    }
}
