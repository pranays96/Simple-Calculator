package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StringCalculator {
    @Test
    void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        Assertions.assertEquals(0, result);
    }
}
