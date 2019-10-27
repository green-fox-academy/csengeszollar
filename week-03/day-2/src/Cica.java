import java.sql.SQLOutput;
import java.util.Scanner;

public class Cica {
    public static void main(String[] args){
    int firstNumber = 1;
    double doubleNumber = 1.5;
    int secondNumber;
    secondNumber = 3;
    boolean isHungry = true;
    String name = "Furkesz";
    char letter = 'a';
    int thirdNumber = firstNumber + secondNumber;
    System.out.println(thirdNumber);
    thirdNumber++;
            System.out.println(thirdNumber);
            thirdNumber = thirdNumber+5;
        System.out.println(thirdNumber);
        thirdNumber += 5;
        System.out.println(thirdNumber);

        boolean isThirdBigger = thirdNumber != firstNumber;
        System.out.println(isThirdBigger);
        boolean isSleepy = false;
        System.out.println(isHungry || isSleepy);

        System.out.println("Hello " + name + "!");
thirdNumber--;
     if (thirdNumber == 15) {
            System.out.println("third number is 15");
        } else if (thirdNumber < 15) {
         System.out.println("third number is lower than 15");
     }  else if (thirdNumber > 15) {
             System.out.println("third number is bigger than 15");
         }

     // Scanner

        System.out.println();
        System.out.println("please write me something here");

        Scanner scanner = new Scanner (System.in);
     String bejovo = scanner.nextLine();
        System.out.println(bejovo);

        System.out.println("Give me a number");
        int givenNumber = scanner.nextInt();
        System.out.println("your number is: " + givenNumber);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }
        System.out.println("While loop");
        int a = 4;
        while (a < 10) {
            System.out.println(a);
            a++;

        }
        System.out.println("do while");
        do {
            a++;
            System.out.println(a);
        } while (a < 10);


        System.out.println("please tell me your name");

        String myName = scanner.nextLine();
        String output;
        if (myName.equals("Furkesz")) {
            output = "Hi Furkesz";
        } else if (myName.equals("Bela")) {
            output = "Nice to meet you Bela";
        } else if (myName.equals("Karoly")) {
            output = "What is up Karoly";
        } else {
            output = "Please leave the room";
        }
        System.out.println("Output from if: " + output);




    }



}
