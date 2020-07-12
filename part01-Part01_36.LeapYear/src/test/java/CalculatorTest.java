import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    
    @Test
    public void calculatorInitialValueZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.getValue());
    }
    
    @Test
    public void valueFiveWhenFiveAdded() {
        Calculator calculator = new Calculator();
        calculator.sum(5);
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        Calculator calculator = new Calculator();
        calculator.substract(2);
        assertEquals(-2, calculator.getValue());
    }    
    
}
