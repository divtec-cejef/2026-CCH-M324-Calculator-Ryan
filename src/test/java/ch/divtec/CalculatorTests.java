package ch.divtec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private final Calculator calculator= new Calculator();

    @Test
    void addNormal(){
        Assertions.assertEquals(4, calculator.add(2,2));
    }

    @Test
    void addNegative(){
        Assertions.assertEquals(-1, calculator.add(2,-3));
    }

    @Test
    void subtractNormal(){
        Assertions.assertEquals(1, calculator.subtract(3,2));
    }


}



