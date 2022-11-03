package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsilibities() {

        System.out.println(job.getResponsibilities());
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.getSalary();
        manager.getResponsibilities();
        System.out.println(manager.getResponsibilities());

        TeamLeader teamLeader = new TeamLeader();
        teamLeader.getSalary();
        teamLeader.getResponsibilities();
        System.out.println(teamLeader.getResponsibilities());

        Account account = new Account();
        account.getSalary();
        account.getResponsibilities();
        System.out.println(account.getResponsibilities());

    }
}
