package GardenApplication;


import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plants> plantList;
    private String name;

    public Garden(String name) {
        this.name = name;
        plantList = new ArrayList<Plants>();
    }

    public void addPlantsToGarden(Plants plants) {
       this.plantList.add(plants);
    }

    public void info () {
        for (int i = 0; i < this.plantList.size() ; i++) {
//            plantList.get(i).info();
        }
        System.out.println();
    }

    public void watering(double wateringAmount){
        List<Plants> thirstyPlants = new ArrayList<>();
        for (int i = 0; i < this.plantList.size(); i++) {
            if (plantList.get(i).doesNeedWater()) {
                thirstyPlants.add(plantList.get(i));
            }

        }
        for (int i = 0; i < thirstyPlants.size(); i++) {

        }


    }





}
