import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNumber = 14;
        boolean notEnd = true;
        Scanner number = new Scanner(System.in);

        while(notEnd) {
            System.out.println("Try to guess the stored number: ");
            int inputNumber = number.nextInt();
            if (inputNumber < storedNumber) {
                System.out.println("The stored number is higher");
            } else if (inputNumber > storedNumber) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + storedNumber);
                notEnd = false;
            }
        }


    }


}
