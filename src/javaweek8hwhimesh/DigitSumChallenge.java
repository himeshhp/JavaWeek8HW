package javaweek8hwhimesh;

//program for digit sum
public class DigitSumChallenge {
    public static int sumDigits(int number) {
        int sum = 0, reminder;
        if (number >= 10) {
            while (number > 0) {
                reminder = number % 10;
                sum = sum + reminder;
                number = number / 10;
            }
            System.out.println("sum of the digit : " + sum);
        } else {
            sum = -1;
            System.out.println("invalid value " + sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(1);
    }
}
