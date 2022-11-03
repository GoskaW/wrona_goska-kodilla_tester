package com.kodilla.abstracts.homework;

public class Manager extends Job {

        public Manager() {

        super(3500, "managing");
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