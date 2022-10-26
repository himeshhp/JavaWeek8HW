package javaweek8hwhimesh;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public boolean sumUserInputNumber() {
        Scanner sc = new Scanner(System.in);
        int counter = 1, sum = 0;

        while (counter <= 10) {
            System.out.println("enter number #" + counter);
            boolean number=sc.hasNextInt();
            if (number) {
                int num = sc.nextInt();
                sum = sum + num;
                counter++;
            } else {
                System.out.println("invalid number");
                break;
            }
        }
        sc.close();
        System.out.println("Sum of entered numbers: " + sum);
        return false;
    }

    public static void main(String[] args) {
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge();
        obj.sumUserInputNumber();
    }
}
