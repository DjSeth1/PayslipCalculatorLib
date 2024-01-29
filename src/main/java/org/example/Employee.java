package org.example;

public class Employee {

    private String name;
    private double annualSalary;

    public Employee(String name, double annualSalary) {
        this.name = name;
        this.annualSalary = annualSalary;
    }


    public String getName() {
        return name;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
}