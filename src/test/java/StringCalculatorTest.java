import org.example.StringCalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StringCalculatorTest {
    @Test
    void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        Assertions.assertEquals(0, result);
    }
    @Test
    void testAddSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        Assertions.assertEquals(1, result);
    }
    @Test
    void testAddTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        Assertions.assertEquals(3, result);
    }


}
