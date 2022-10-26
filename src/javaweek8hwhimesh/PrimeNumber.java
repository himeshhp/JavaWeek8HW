package javaweek8hwhimesh;

import java.util.Scanner;

public class PrimeNumber {

    public static void chkNumber() {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        a = sc.nextInt();
        sc.close();

        if (a >= 1) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    b++;
            }
            if (b == 2) {
                System.out.println("Number is PrimeNumber");
            } else {
                System.out.println("Number is not PrimeNumber");
            }
        }
    }

    public static void main(String[] args) {
        chkNumber();
    }
}