package com.kodilla.inheritance.homework;

public class Windows95 extends OperatingSystem{
    public Windows95 (int year, int users){
        super(year, users);


        }
    @Override
    public void turnOn() {
        System.out.println("Witaj w Windows 95");
    }

    @Override
    public void turnOff() {
        System.out.println("Żegnaj");
    }
}
