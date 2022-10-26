package javaweek8hwhimesh;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void minMax(int[] a) {
        int max = 0, min = 0, x = 0;

        while (x < a.length) {
            if (x == 0)
                max = min = a[x];
            else if (a[x] > max) {
                max = a[x];
            } else if (a[x] < min)
                min = a[x];
            x++;
        }
        System.out.println("Maximum number entered is: " + max);
        System.out.println("Minimum number entered is: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers limit");
        int ar = sc.nextInt();

        if (ar < 0)
            System.out.println("invalid number");
        else {
            int[] a = new int[ar];
            int i = 0;
            while (i < a.length) {
                System.out.println("Enter number" + (i + 1) + " : ");
                a[i] = sc.nextInt();
                i++;
            }
            minMax(a);
        }
        sc.close();
    }
}

