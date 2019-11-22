public class GreatestCommonDivisor {
    public static void main(String[] args) {
        gcd(36, 24);

        System.out.println(greatestDivisor(75, 15));


    }

    public static int greatestDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestDivisor(b, a % b);
    }

    public static void gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

}
