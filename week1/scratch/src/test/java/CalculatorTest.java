import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void shouldAdd() {
        var result = calculator.add(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldMultiply() {
        var result = calculator.multiply(100, 200);
        assertThat(result).isEqualTo(20_000);
    }

    @Test
    public void shouldSubtract() {
        var result = calculator.subtract(100, 92);
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void shouldDivide() {
        var result = calculator.divide(90, 9);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void shouldHandleDivideByZero() {
        var result = calculator.divide(100, 0);
        assertThat(result).isEqualTo(-1);
    }
}