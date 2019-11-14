import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

//        for (int i = 1; i <= rows ; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print( "*");
//            }
//            System.out.println();
//        }
// Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was


        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int rows = number.nextInt();
        for (int i = 1; i <= rows; i++) {
                for (int j = rows - i; j >= 0; j--) {
                    System.out.print( " ");
                }
            for (int k = 1; k <= i * 2 -1; k ++) {
                System.out.print("*");
            }

            System.out.println();
            }
        }


        }


