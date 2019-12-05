package GardenApplication;

public class Plants {
    private double currentWaterLevel;
    private String color;
   private double absorptionRate;
   private double thirstyLevel;



    public Plants(String color) {
        this.currentWaterLevel = 0;
        this.color = color;
    }


    public double getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    public void setAbsorptionRate(double absorptionRateLevel) {
        this.absorptionRate = absorptionRate;
    }

    public void setThirstyLevel(double thirstyLevel) {
        this.thirstyLevel = thirstyLevel;
    }

    public boolean doesNeedWater() {
        return getCurrentWaterLevel() < thirstyLevel;
    }



}

