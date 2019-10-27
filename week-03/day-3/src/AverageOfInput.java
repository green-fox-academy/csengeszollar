import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number!");
        int first = scanner.nextInt();

        System.out.println("Enter a number again!");
        int second = scanner.nextInt();

        System.out.println("Enter a number again!");
        int third = scanner.nextInt();

        System.out.println("Enter a number again!");
        int fourth = scanner.nextInt();

        System.out.println("Enter a number again!");
        int fifth = scanner.nextInt();

        int sum = first + second + third + fourth + fifth;
        double average = sum / 5.0;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);







        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
    }



}
