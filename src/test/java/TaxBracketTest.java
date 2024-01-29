import org.example.TaxBracket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxBracketTest {
    private TaxBracket bracket;

    @BeforeEach
    void setUp() {
        bracket = new TaxBracket(20000, 40000, 0.1);
    }

    @Test
    void testBracketCreation() {
        assertEquals(20000, bracket.getLowerLimit());
        assertEquals(40000, bracket.getUpperLimit());
        assertEquals(0.1, bracket.getRate());
    }

    // *** Only need if further testing *** - ask
//    @Test
//    void testGetUpperLimit() {
//        assertEquals(40000, bracket.getUpperLimit());
//
//    }
//
//    @Test
//    void testLowerLimit() {
//        assertEquals(20000, bracket.getLowerLimit());
//    }
//
//    @Test
//    void testGetRate() {
//        assertEquals(0.1, bracket.getRate());
//    }




}
