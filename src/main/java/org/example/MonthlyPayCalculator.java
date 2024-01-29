package org.example;

public class MonthlyPayCalculator {

    private IncomeTaxCalculator taxBracketCalculator;

    public MonthlyPayCalculator() {
        this.taxBracketCalculator = new IncomeTaxCalculator();
    }
    public double calculateGrossMonthlyIncome(double annualSalary) {
        return annualSalary / 12;
    }

    public double calculateIncomeTax(double annualSalary) {


        return taxBracketCalculator.calculateIncomeTax(annualSalary);
    }


    public double calculateNetMonthlyIncome(double grossMonthlyIncome, double incomeTax) {
        return grossMonthlyIncome - incomeTax;
    }




}
