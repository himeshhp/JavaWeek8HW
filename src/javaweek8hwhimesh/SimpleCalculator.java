package javaweek8hwhimesh;

public class SimpleCalculator {
    double firstNumber, secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
        return firstNumber;
    }

    public double setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
        return secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        double div = firstNumber / secondNumber;
        if (secondNumber == 0) {
            return 0;
        }
        return div;
    }

    public static void main(String[] args) {
        javaweek8hwhimesh.SimpleCalculator calculator = new javaweek8hwhimesh.SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber((4));
        System.out.println(("add= " + calculator.getAdditionResult()));
        System.out.println(("subtract= " + calculator.getSubtractionResult()));
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println(("divide= " + calculator.getDivisionResult()));
    }
}