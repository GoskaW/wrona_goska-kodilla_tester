package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem (1995,5000000);
        operatingSystem.turnOn();

        Windows8 windows8 = new Windows8 (2012, 380000);
        operatingSystem.turnOn();
        System.out.println(windows8.getYear());
        System.out.println("Number of users" + windows8.getUsers());

        Windows95 windows95 = new Windows95 (1995, 5000000);
        operatingSystem.turnOff();
        System.out.println(windows95.getYear());
        System.out.println("Number of users" + windows95.getUsers());
    }
}
