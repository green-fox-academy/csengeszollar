public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(356));
    }
    public static int sumDigits(int n) {
       if (n == 0) {
           return n;
       } return sumDigits(n / 10) + n % 10;
    }
}
