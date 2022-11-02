package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {

    private int speed;

    public Kia (int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        int result = this.speed + 40;
        System.out.println(result);
    }

    @Override
    public void decreaseSpeed() {
        int result = this.speed -20;
        System.out.println(result);
    }
}
