package javaweek8hwhimesh;

import java.util.Scanner;

public class Diamond {
    public static void method1() {
        int a = 1, b, size;
        char c = '*';

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines of diamond size: ");
        size = sc.nextInt();
        sc.close();

        while (a <= size) {
            b = 1;
            while (b++ <= size - a) {
                System.out.print(" ");
            }
            b = 1;
            while (b++ <= a * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            a++;
        }
        a = size - 1;
        while (a > 0) {
            b = 1;
            while (b++ <= size - a) {
                System.out.print(" ");
            }
            b = 1;
            while (b++ <= a * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            a--;
        }
    }

    public static void main(String[] args) {
        method1();
    }
}

