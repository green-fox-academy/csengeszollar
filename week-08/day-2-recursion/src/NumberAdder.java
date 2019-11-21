public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(recurSum(3));
    }
    public static int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recurSum(n - 1);
    }
}
