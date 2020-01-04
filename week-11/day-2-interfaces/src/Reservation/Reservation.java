package Reservation;

import java.util.Random;

public class Reservation implements Reservationy {

    private String name;
    
    public Reservation() {
        this.name = "Booking#";
    }

    @Override
    public String getDowBooking() {
        Random rand = new Random();
        String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        String randomDay = "";
        for (int i = 0; i < DOW.length ; i++) {
            randomDay = DOW[rand.nextInt(DOW.length)];
        }
        return randomDay;
    }

    @Override
    public String getCodeBooking() {
        StringBuilder randomCode = new StringBuilder();
        Random rand = new Random();
        String lettersAndNumbersToUse = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        for (int i = 0; i < 8; i++) {
            randomCode.append(lettersAndNumbersToUse.charAt(rand.nextInt(lettersAndNumbersToUse.length())));
        }
        return randomCode.toString();
    }

    public String toString(){
        return String.format("%s %s for %s", name, getCodeBooking(), getDowBooking());
    }
}
