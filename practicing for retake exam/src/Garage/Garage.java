package Garage;

import java.util.*;

public class Garage {
    private String address;
    private int capacity;
    private List<Car> cars;

    public Garage() {
        cars = new ArrayList<>();
        capacity = 10;
    }

    public void add(Car car) {
        if (cars.size() < capacity) {
            cars.add(car);
        } else {
            System.err.println("There is no more free place in this garage");
        }
    }

    public int averageCarSpeed() {
        int carsSpeedAmount = 0;
        for (int i = 0; i < cars.size(); i++) {
            carsSpeedAmount += cars.get(i).getSpeed();
        }
        return carsSpeedAmount / cars.size();
    }

    public String getCar(String licensePlate) {
        String carWithPlate = "The car which belongs to the given licenseplate is not parking in this garage";
        HashMap<Car, String> carsLicensePlate = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            carsLicensePlate.put(cars.get(i), cars.get(i).getLicensePlate());
        }
        for (Map.Entry<Car, String> entry : carsLicensePlate.entrySet()) {
            if (entry.getValue().equals(licensePlate)) {
                carWithPlate = entry.getValue() + " = " + entry.getKey().toString();
            }
        }
        return carWithPlate;

    }

    public HashMap getCarColors() {
        HashMap<String, Integer> colorMap = new HashMap<>();
//        for (int i = 0; i < cars.size(); i++) {
//            String carColor = cars.get(i).getColor();
//            if (colorMap.containsKey(carColor)) {
//                colorMap.replace(carColor, colorMap.get(carColor) + 1);
//            } else {
//                colorMap.put(carColor, 1);
//            }
//        }
        for (Car car : cars) {
            String color = car.getColor();
            if (colorMap.containsKey(color)) {
                colorMap.replace(color, colorMap.get(color) + 1);
            } else {
                colorMap.put(color, 1);
            }
        }
        return colorMap;
    }

    public void makeItLoud() {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).honk();
        }
    }

    public int fill(int amountOfFuel) {
        Random rand = new Random();
        while (amountOfFuel > 0) {
            Car car = cars.get(rand.nextInt(cars.size()));
            amountOfFuel = car.fill(amountOfFuel);
        }

        return amountOfFuel;
    }
}
