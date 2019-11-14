import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int rows = number.nextInt();

        for (int i = 1; i <= rows ; i++) {
            System.out.print("%");
            for (int j = 1; j < rows-1 ; j++) {
                if (i == 1) {
                    System.out.print("%");
                } else if (i == rows) {
                    System.out.print("%");
                }else System.out.print(" ");
            }
            for (int j = rows; j <=rows ; j++) {
                System.out.print("%");
            }
           System.out.println();
        }



//        for (int i = 1; i <= rows; i++) {
//            System.out.println("%");
//
//        }










    }
}
