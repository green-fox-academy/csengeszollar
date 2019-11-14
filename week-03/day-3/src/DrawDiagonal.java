import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was


        Scanner number = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int rows = number.nextInt();

        for (int i = 0; i < rows ; i++) {
            System.out.print("%");
            for (int j = 1; j < rows-1; j++) {
                if (i == 0) {
                    System.out.print("%");
                } else if (i == rows - 1) {
                    System.out.print("%");
                } else if (i == j){
                    System.out.print("%");
                }else System.out.print(" ");
            }
            for (int j = rows; j <=rows ; j++) {
                System.out.print("%");
            }
            System.out.println();
        }




    }
}
