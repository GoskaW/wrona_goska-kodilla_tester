package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public String job;

    public Person(){
        this.firstName = firstName;
        this.age = age;
        this.job =job;
    }


    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.yourSalary();
        manager.yourResponsibilities();

        TeamLeader teamLeader = new TeamLeader();
        teamLeader.yourSalary();
        teamLeader.yourResponsibilities();
        System.out.println(teamLeader.getResponsibilities());

        Account account = new Account();
        account.yourSalary();
        account.yourResponsibilities();
        System.out.println(account.getResponsibilities());
    }
        public void showReponsibilities() {
            System.out.println(Manager.responsibilities);
        }

    }

