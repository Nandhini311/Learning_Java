public class SimpleCalculatorMain {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(60.00);
        calculator.setSecondNumber(70.00);
        System.out.println(calculator.getAdditionResult());
    }
}
