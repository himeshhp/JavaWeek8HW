package javaweek8hwhimesh;

import java.util.Scanner;

public class FibonacciNumber {
    public void fibNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int n2 = sc.nextInt();
        int sum;
        sc.close();

       for (int i = 2; i < 11; i++) {
           sum = n1 +n2;
           System.out.println(" " + sum);
           n1 = n2;
           n2 = sum;
       }
    }

    public static void main(String[] args){
        FibonacciNumber obj = new FibonacciNumber();
        obj.fibNum();
    }
}
