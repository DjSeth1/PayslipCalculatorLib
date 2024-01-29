package org.example;

import java.util.ArrayList;

public class TaxBracket {
    private double lowerLimit;
    private double upperLimit;
    private double rate;


    public TaxBracket(double lowerLimit, double upperLimit, double rate) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.rate = rate;

    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public double getRate() {
        return rate;
    }

    public double getLowerLimit() {
        return lowerLimit;
    }

    public static ArrayList<TaxBracket> getTaxBrackets() {
        ArrayList<TaxBracket> brackets = new ArrayList<TaxBracket>();

        brackets.add(new TaxBracket(0, 20000, 0.0));
        brackets.add(new TaxBracket(20000, 40000 ,0.1));
        brackets.add(new TaxBracket(40000, 80000, 0.2));
        brackets.add(new TaxBracket(80000, 180000, 0.3));
        brackets.add(new TaxBracket(180000, Double.POSITIVE_INFINITY, 0.4));

        return brackets;
    }


}

