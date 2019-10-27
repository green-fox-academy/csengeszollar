import java.util.Scanner;

public class OddEven {

// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println( "Enter a number please!");

        int a = number.nextInt();

        if (a % 2 == 0) {
            System.out.println("YaaaaY, the number is even!");
        } else {
            System.out.println("YaaaY, the number is odd!");
        }

    }
}
