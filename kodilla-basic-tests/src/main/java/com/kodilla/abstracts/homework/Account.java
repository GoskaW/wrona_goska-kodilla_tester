package com.kodilla.abstracts.homework;

public class Account extends Job{

    public Account() {

        super(2000, "selling");
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
