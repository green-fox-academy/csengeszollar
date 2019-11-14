import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {


        // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        divideByzeroFunction(number);

//        int result = 10 / number;
//        System.out.println(result);

//        try {
//            int result = 10 / number;
//            System.out.println(result);
//        } catch (ArithmeticException e){

//        }
    }

    public static void divideByzeroFunction (int num) {
        //int result = 0;
        try {
            int result = 10 / num;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("fail");
        }

    }
}
