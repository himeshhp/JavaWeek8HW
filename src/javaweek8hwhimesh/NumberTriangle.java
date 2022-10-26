package javaweek8hwhimesh;

import java.util.Scanner;

public class NumberTriangle {
    public static void numTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row");
        int row = sc.nextInt();
        sc.close();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        numTriangle();
    }
}
