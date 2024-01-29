import org.example.MonthlyPayCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonthlyPayCalculatorTest {

//    private MonthlyPayCalculator calculator;
//
//    @BeforeEach
//    void setUp(){
//        calculator = new MonthlyPayCalculator();
//    }

    @Test
    void testCalculateGrossMonthlyIncome() {
        MonthlyPayCalculator calculator = new MonthlyPayCalculator();
        assertEquals(5000, calculator.calculateGrossMonthlyIncome(60000));
    }

    @Test
    void testCalculateIncomeTax() {
        MonthlyPayCalculator calculator = new MonthlyPayCalculator();
        assertEquals(500, calculator.calculateIncomeTax(60000));
    }

    @Test
    void testCalculateNetMonthlyIncome() {
        MonthlyPayCalculator calculator = new MonthlyPayCalculator();
        assertEquals(4500, calculator.calculateNetMonthlyIncome(5000, 500));
    }
}
