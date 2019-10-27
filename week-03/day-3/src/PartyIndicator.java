import java.util.Scanner;

public class PartyIndicator {

    // Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number of girls at the party: ");
        int girls = number.nextInt();

        System.out.print("Enter the number of boys at the party: ");
        int boys = number.nextInt();

//         boolean girlsBoysRatio = girls == boys;
//         boolean numberOfPeople = girls + boys >= 20;
//         boolean notEqual = girls != boys;
//         boolean isThereAnyGirl = girls > 0;

        if (girls == 0)
            System.out.println("Sausage party");
        else if ((girls + boys) >= 20)
            if (girls == boys)
                System.out.println("The party is excellent!");
            else
                System.out.println("Quite cool party!");
        else
            System.out.println("Average party...");

//        if (girlsBoysRatio && numberOfPeople) {
//            System.out.println("The party is excellent!");
//        } else if (notEqual && numberOfPeople && isThereAnyGirl) {
//            System.out.println("Quite cool party!");
//        } else if (girls + boys <= 20) {
//            System.out.println("Average party...");
//        } else if (girls == 0) {
//            System.out.println("Sausage party");
//        }

    }
}

