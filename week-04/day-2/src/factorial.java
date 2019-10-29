public class factorial {
    public static void main(String[] args) {
        int input = 4;
        System.out.println(factorioFunction(input));
    }
    public static int factorioFunction (int input) {
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
