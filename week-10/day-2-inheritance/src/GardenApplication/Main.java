package GardenApplication;

public class Main {
    public static void main(String[] args) {
        Plants blue = new Flower("blue");
        System.out.println(blue.getCurrentWaterLevel());

        System.out.println(blue.doesNeedWater());

        Garden myGarden = new Garden("myGarden");
        myGarden.addPlantsToGarden(blue);
        myGarden.info();


        }

    }

