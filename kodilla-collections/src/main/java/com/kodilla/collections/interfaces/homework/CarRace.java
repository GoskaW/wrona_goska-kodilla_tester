package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(120, 45, 23);
        doRace(ford);

        Opel opel = new Opel (150, 60, 18);
        doRace(opel);

        Kia kia = new Kia (100, 55,25);
        doRace(kia);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());

    }
}
