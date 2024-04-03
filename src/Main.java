public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexCalculator calculator = new BasicComplexCalculator();

        ComplexNumber sum = calculator.add(num1, num2);
        System.out.println("Сложение: " + sum);

        ComplexNumber product = calculator.multiply(num1, num2);
        System.out.println("Умножение: " + product);

        ComplexNumber quotient = calculator.divide(num1, num2);
        System.out.println("Деление: " + quotient);
    }
}
