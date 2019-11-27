package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> piratesList;

    public Ship() {
        this.piratesList = new ArrayList<>();
    }

    public void addPirate(Pirate pirate) {
        piratesList.add(pirate);
        System.out.println("New pirate on the ship: " + pirate.name);
    }


    public List getPoorPirates() {
        List<String> poorPiratesList = new ArrayList<>();
        for (int i = 0; i < piratesList.size(); i++) {
            if (piratesList.get(i).hasPirateWoodenLeg == true && piratesList.get(i).amountOfGold < 15) {
                poorPiratesList.add(piratesList.get(i).name);
            }
        }
        return poorPiratesList;

    }

    public int getGolds() {
        int sumOfPiratesGold = 0;
        for (int i = 0; i < piratesList.size(); i++) {
            sumOfPiratesGold += piratesList.get(i).amountOfGold;

        }
        return sumOfPiratesGold;
    }

    public void lastDayOnTheShip() {
        for (Pirate pirate : piratesList) {
            pirate.party(pirate);
        }
    }

    public void prepareForBattle() {
        for (int i = 0; i < 5; i++) {
            for (Pirate pirate : piratesList) {
                pirate.work(pirate);
            }
        }
        lastDayOnTheShip();
    }
}







