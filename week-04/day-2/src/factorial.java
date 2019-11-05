public class factorial {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(factorioFunction(a));
    }
    public static int factorioFunction (int input) {
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
