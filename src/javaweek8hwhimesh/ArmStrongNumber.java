package javaweek8hwhimesh;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void armStrNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int r = 0;
        sc.close();

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + (r * r * r);//
        }
        if (temp == sum) {
            System.out.println(sum + " is ArmStrong number");
        } else {
            System.out.println(sum + " is not ArmStrong number");
        }
    }

    public static void main(String[] args) {
        armStrNum();
    }
}
