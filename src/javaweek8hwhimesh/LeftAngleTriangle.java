package javaweek8hwhimesh;

import java.util.Scanner;

public class LeftAngleTriangle {
    public static void leftAngleTriangle() {
        int a, i;
        char c = '*';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows for triangle ");
        a = sc.nextInt();

        for (i = 0; i < a; i++) {
            for (int j = 2 * (a - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        leftAngleTriangle();
    }
}
