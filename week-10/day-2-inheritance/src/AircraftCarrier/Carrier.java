package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircraftsCarrier;
    private int ammoStorage;
    private int healthPoint;
    private int carriersAircraftAllDamage;

    public Carrier(int ammoStorage, int healthPoint) {
        this.aircraftsCarrier = new ArrayList<>();
        this.healthPoint = healthPoint;
        this.ammoStorage = ammoStorage;

    }

    public List<Aircraft> getAircraftsCarrier() {
        return aircraftsCarrier;
    }

    public int getAmmoStorage() {
        return ammoStorage;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void addNewAircraft(Aircraft aircraft) {
        this.aircraftsCarrier.add(aircraft);
    }

    public int getCarriersAircraftAllDamage() {
        return carriersAircraftAllDamage;
    }

    public int getMissingAmo() {
        int missingAmountOfAmoOfAllAircrafts = 0;
        for (int i = 0; i < aircraftsCarrier.size(); i++) {
            missingAmountOfAmoOfAllAircrafts += aircraftsCarrier.get(i).getMaxAmmo() - aircraftsCarrier.get(i).getCurrentAmo();
        }
        return missingAmountOfAmoOfAllAircrafts;
    }

    public void fillAircrafts() {
        //this.ammoStorage -= missingAmountOfAmoOfAllAircrafts;
        List<Aircraft> firstPriorityAircrafts = new ArrayList<>();
        List<Aircraft> secondPriorityAirCrafts = new ArrayList<>();
        if (this.ammoStorage == 0) {
            System.out.println("Sorry, carrier's amo storage is empty");
        } else if (this.ammoStorage <= this.getMissingAmo()) {

            for (int i = 0; i < aircraftsCarrier.size(); i++) {
                if (aircraftsCarrier.get(i).isPriority() == true) {
                    firstPriorityAircrafts.add(aircraftsCarrier.get(i));
                } else secondPriorityAirCrafts.add(aircraftsCarrier.get(i));
            }
            int firstPriorityMissingAmo = 0;

            for (int i = 0; i < firstPriorityAircrafts.size(); i++) {
                firstPriorityMissingAmo += firstPriorityAircrafts.get(i).getMaxAmmo() - firstPriorityAircrafts.get(i).getCurrentAmo();
            }

            if (this.ammoStorage <= firstPriorityMissingAmo) {
                for (int i = 0; i < firstPriorityAircrafts.size(); i++) {
                    ammoStorage = firstPriorityAircrafts.get(i).refill(ammoStorage);
                    if (ammoStorage <= 0)
                        break;
                }
            } else {
                for (int i = 0; i < firstPriorityAircrafts.size(); i++) {
                    ammoStorage = firstPriorityAircrafts.get(i).refill(ammoStorage);
                }
                for (int i = 0; i < secondPriorityAirCrafts.size(); i++) {
                    ammoStorage = secondPriorityAirCrafts.get(i).refill(ammoStorage);
                    if (ammoStorage <= 0)
                        break;
                }
            }

        } else {
            for (int i = 0; i < aircraftsCarrier.size(); i++) {
                ammoStorage = aircraftsCarrier.get(i).refill(ammoStorage);

            }
        }
    }

    public void fight(Carrier carrier) {
        int carriersAircraftAllDamage = 0;
        for (int i = 0; i < this.aircraftsCarrier.size(); i++) {
            for (int j = 0; j <aircraftsCarrier.get(i).getCurrentAmo() ; j++) {
                aircraftsCarrier.get(i).fight();
                carriersAircraftAllDamage += aircraftsCarrier.get(i).getAllDamage();
            }
        }
        this.healthPoint -= carriersAircraftAllDamage;
    }


    public String getStatus() {
        String status = "";
        String carriersAircraftsStatus = "";
       int carriersAircraftAllDamage = 0;
        for (int i = 0; i < aircraftsCarrier.size(); i++) {
            carriersAircraftsStatus += aircraftsCarrier.get(i).getStatus() + "\n";
            carriersAircraftAllDamage += aircraftsCarrier.get(i).getAllDamage();
        }
        if (this.healthPoint > 0) {
            status = "HP: " + getHealthPoint() + " Aircraft count: " + this.aircraftsCarrier.size() + " Ammo Storage: " + this.getAmmoStorage() + " Total damage: " + carriersAircraftAllDamage + "\n" + "Aircrafts: " + "\n" + carriersAircraftsStatus;
            return status;
        } else
            return "It's dead Jim :(";
    }
}


