import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner mile = new Scanner(System.in);
        System.out.println( "Give me a distance!(mile)");

        double mileToKm = mile.nextDouble();
        System.out.println(mileToKm + " mile is: " + mileToKm * 1.609344 + "km");
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}