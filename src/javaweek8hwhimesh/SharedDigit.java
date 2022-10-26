package javaweek8hwhimesh;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstA, int firstB) {
        int lastA, lastB;
        if ((firstA >= 10 && firstA <= 99) && (firstB >= 10 && firstB <= 99)) {
            lastA = firstA % 10;
            lastB = firstB % 10;
            firstA /= 10;
            firstB /= 10;

            return ((firstA == lastA) || (firstA == lastB) ||
                    (lastA == firstB) || (lastA == lastB));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
