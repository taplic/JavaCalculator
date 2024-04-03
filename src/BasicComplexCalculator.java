import java.util.logging.Logger;

public class BasicComplexCalculator implements ComplexCalculator {
    private static final Logger LOGGER = Logger.getLogger(BasicComplexCalculator.class.getName());

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        LOGGER.info("Сложение комплексных чисел: " + a + " и " + b);
        return a.add(b);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        LOGGER.info("Умножение комплексных чисел: " + a + " и " + b);
        return a.multiply(b);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        LOGGER.info("Деление комплексных чисел: " + a + " на " + b);
        return a.divide(b);
    }
}