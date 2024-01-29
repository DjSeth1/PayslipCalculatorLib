package org.example;

import java.util.ArrayList;

public class IncomeTaxCalculator {

    private ArrayList<TaxBracket> brackets;

    public IncomeTaxCalculator() {
        brackets = TaxBracket.getTaxBrackets();
    }



    public double calculateIncomeTax(double annualSalary) {
        double annualIncomeTax = 0;
        double remainingIncome = annualSalary;


        for (TaxBracket bracket : brackets) {
            if (remainingIncome <= 0) {
                break;
            }

            double lowerLimit = bracket.getLowerLimit();
            double upperLimit = bracket.getUpperLimit();

            double taxableAmountInBracket = Math.min(
                    remainingIncome, upperLimit - lowerLimit
            );

            annualIncomeTax += taxableAmountInBracket * bracket.getRate();
            remainingIncome -= taxableAmountInBracket;
        }
        return annualIncomeTax /12;

    }


}
