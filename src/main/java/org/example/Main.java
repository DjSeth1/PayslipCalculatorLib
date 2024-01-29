package org.example;



public class Main {
    public static void main(String[] args) {

        Employee mary = new Employee("Mary Song", 60000);

        MonthlyPaySlipGenerator paySlipGenerator = new MonthlyPaySlipGenerator();
        paySlipGenerator.generatePaySlip(mary);



    }
}