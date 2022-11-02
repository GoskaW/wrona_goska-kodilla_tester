package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford (120);
        doRace(ford);

        Opel opel = new Opel (150);
        doRace(opel);

        Kia kia = new Kia (100);
        doRace(kia);
    }

    private static void doRace(Car car) {

        System.out.println(car.getSpeed());


    }
}
