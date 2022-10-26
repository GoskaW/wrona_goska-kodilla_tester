package com.kodilla.inheritance.homework;

public class Windows8 extends OperatingSystem {
    public Windows8 (int year, int users) {
        super(year, users);
    }

    @Override
    public void turnOn() {
        System.out.println("Witaj w Windows 8");
    }

    @Override
    public void turnOff() {
        System.out.println("Żegnaj");
    }


}
