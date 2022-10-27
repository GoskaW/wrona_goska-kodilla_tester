package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public static String responsibilities;

    public Person(){
        this.firstName = firstName;
        this.age = age;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.yourSalary();
        manager.yourResponsibilities();
        System.out.println(manager.getResponsibilities());

        TeamLeader teamLeader = new TeamLeader();
        teamLeader.yourSalary();
        teamLeader.yourResponsibilities();
        System.out.println(teamLeader.getResponsibilities());

        Account account = new Account();
        account.yourSalary();
        account.yourResponsibilities();
        System.out.println(account.getResponsibilities());

    }

}

