package com.kodilla.inheritance.homework;

public class OperatingSystem {
        public int year;
        public int users;

    public void turnOn() {
        System.out.println("turned on");
    }
    public void turnOff() {
        System.out.println("turned off");
    }

    public OperatingSystem (int year, int users){
        this.year = year;
        this.users = users;

    }
    public int getYear () {
        return year;
    }
    public int getUsers () {
        return users;
    }
    public void displayNumberOfUsers() {
        System.out.println("Number of users: " + users);
    }

}
