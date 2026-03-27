package ch.divtec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private final Calculator calculator= new Calculator();

    @Test
    void addNormal(){
        Assertions.assertEquals(4, calculator.add(2,2));
    }
}
