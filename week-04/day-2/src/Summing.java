public class Summing {
    public static void main(String[] args) {
        int given = 4;
        System.out.println(sumFunction(given));
    }

    public static int sumFunction (int given) {
        int sum = 0;
        for (int i = 1; i <= given; i++) {
            sum += i;
        }
        return sum;
    }

}
