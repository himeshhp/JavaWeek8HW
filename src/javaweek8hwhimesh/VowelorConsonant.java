package javaweek8hwhimesh;

import java.util.Scanner;

public class VowelorConsonant {
    public void method1() {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet");
        ch = sc.next().charAt(0);
        sc.close();

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' || ch == 'A' ||
                ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Input letter is VOWEL");
        } else if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z')) {
            System.out.println("Input letter is CONSONANT");
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        VowelorConsonant obj = new VowelorConsonant();
        obj.method1();
    }
}
