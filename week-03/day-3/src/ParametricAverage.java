import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int givenNumber = number.nextInt();

        double sum = 0.0;
        for (int i = 0; i < givenNumber; i++) {
            System.out.print("Please enter a number: ");
            sum += number.nextInt();
        }
        System.out.println("Sum = " + sum + ", Average: " + sum / givenNumber);
        
    }
}
