package gcukakao.jenkins.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2,3));
    }

    @Test
    public void testSub() {
        assertEquals(-3, calculator.sub(3,6));
    }

    @Test
    public void testMul() {
        assertEquals(10, calculator.mul(2,5));
    }

    @Test
    public void testDiv() {
        assertEquals(6, calculator.div(12,2));
    }

    @Test
    public void testDivByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.div(10, 0));
        assertEquals("0으로 나눌 수 없습니다.", exception.getMessage());
    }

    @Test
    public void testGetMyName() {
        assertEquals("박영두", calculator.getMyName());
    }
}
