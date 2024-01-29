import org.example.IncomeTaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxCalculatorTest {
        private IncomeTaxCalculator incomeTaxCalculator;

        @BeforeEach
        void setUp() {
            incomeTaxCalculator = new IncomeTaxCalculator();
        }

        @Test
        public void testCalculateIncomeTax_LowerBracket() {
            double incomeTax = incomeTaxCalculator.calculateIncomeTax(15000);
            assertEquals(0, incomeTax);
        }
}
