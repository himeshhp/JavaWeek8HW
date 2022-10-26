package javaweek8hwhimesh;

public class FirstLastSum {
    public static void sumFirstAndLastDigit(int num) {
        int firstDigit = num;
        int lastDigit = num % 10;
        int sum = firstDigit + lastDigit;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
            sum = firstDigit + lastDigit;
        }
        if (firstDigit < 0) {
            sum = -1;
        }
        System.out.println("first digit: " + firstDigit + " last digit: " + lastDigit + " sum: " + sum);
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }
}
