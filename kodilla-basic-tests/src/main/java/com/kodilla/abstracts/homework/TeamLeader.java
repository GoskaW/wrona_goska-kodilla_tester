package com.kodilla.abstracts.homework;

public class TeamLeader extends Job {

    public TeamLeader() {
        super(3000, "organize");
    }


    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }

}
