package javaweek8hwhimesh;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int a = number;
        int rev = 0;
        boolean result = false;

        while (number != 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
            if (a == rev)
                result = true;
        }
        System.out.println (rev + " " + result);
        return false;
    }

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);
    }
}