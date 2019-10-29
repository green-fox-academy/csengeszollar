import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int aj[] = new int[] {3, 4, 5, 6, 7};

        int k = aj.length - 1;
        int temp;

        for (int i = 0; i < aj.length / 2; i++) {
            temp = aj[k];
            aj[k] = aj[i];
            aj[i] = temp;
            k --;
        }
        System.out.println(Arrays.toString(aj));
    }
}
