package javaweek8hwhimesh;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void rightTriangle() {
        int a, i, j;
        char ch = '@';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of triangle");
        a = sc.nextInt();
        sc.close();

        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightTriangle();
    }
}