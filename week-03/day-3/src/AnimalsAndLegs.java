import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a number!");

        int chickens = scanner.nextInt();
        System.out.println("Enter a number again!");

        int pigs = scanner.nextInt();
        System.out.println(chickens + " chickens and " + pigs + " pigs have " + (chickens * 2 + pigs * 4) + " legs.");






        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
