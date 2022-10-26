package javaweek8hwhimesh;

public class EvenDigitSum {
    public static int getEvenDigitsum(int  num) {
        int r;
        int evenSum = 0;
        int oddSum = 0;

        if (num > 0 ){
            while (num != 0){
                r = num % 10;
                if (r % 2 == 0){
                    evenSum = evenSum + r;
                }else {
                    oddSum = oddSum + r;
                }
                num = num / 10;
            }
            System.out.println("sum of even number is: " + evenSum);
        }else {
            System.out.println("-1 number is negative");
            return -1;
        }
        return evenSum;
    }

    public static void main(String[] args){
        getEvenDigitsum(123456789);
        getEvenDigitsum(252);
        getEvenDigitsum(-22);
    }
}
