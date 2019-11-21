public class Power {
    public static void main(String[] args) {
        System.out.println(powerFunc(2, 7));

    }
    public static int powerFunc(int base, int n) {
        if (n == 0)
            return 1;
        return base * powerFunc(base, n - 1);
    }
}
