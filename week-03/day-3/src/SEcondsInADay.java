public class SEcondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsSoFar = (currentHours * 60 * 60) + (currentMinutes * 60 ) + currentSeconds;

        int secondsADay = 24 * 60 * 60;


        System.out.println("There are " + (secondsADay - secondsSoFar) + " remaining seconds from today");

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}