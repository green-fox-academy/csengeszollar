import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number! ");

        long a = number.nextLong();
        System.out.print("Please enter an other number! ");

        long b = number.nextLong();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
