package org.example;

public class MonthlyPaySlipGenerator {
    public void generatePaySlip(Employee employee) {
        MonthlyPayCalculator calculator = new MonthlyPayCalculator();

        double grossMonthlyIncome = calculator.calculateGrossMonthlyIncome(employee.getAnnualSalary());
        double incomeTax = calculator.calculateIncomeTax(employee.getAnnualSalary());
        double netMonthlyIncome = calculator.calculateNetMonthlyIncome(grossMonthlyIncome, incomeTax);

        System.out.println("Monthly Payslip for: " + employee.getName() + ".");
        System.out.println("Gross Monthly Income: $" + grossMonthlyIncome);
        System.out.println("Monthly Income Tax: $" + incomeTax);
        System.out.println("Net Monthly Income: $" + netMonthlyIncome);
    }
}

