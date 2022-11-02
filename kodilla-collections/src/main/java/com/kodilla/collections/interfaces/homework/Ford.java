package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
        return speed;
    }


    @Override
    public void increaseSpeed() {
        int speed = 20;
        for (int i = 0; i < speed; i++) ;
        speed++;
        speed += speed;

        System.out.println("Zwiększa się o " + speed);
    }

    @Override
    public void decreaseSpeed() {
        int speed = this.speed - 20;
        System.out.println(speed);
    }



}


