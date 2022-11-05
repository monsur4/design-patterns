package com.mon.designpatterns.structural.proxypattern.java;

public class ITEmployee implements IEmployee{
    private double salary;

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void hike(double amount) {
        salary += amount;
    }

    @Override
    public void setSalary(double amount) {
        salary = amount;
    }
}
