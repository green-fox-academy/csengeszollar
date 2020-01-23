package Garage;

public class CarsInTheGarageMain {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Toyota toyota = new Toyota("TUV329");
        Suzuki suzi = new Suzuki("blue", 60, "BHG980");
        Porsche porsche = new Porsche("blue", "IAJ122");

        garage.add(toyota);
        garage.add(suzi);
        garage.add(porsche);

        System.out.println(garage.getCarColors());
        garage.makeItLoud();
        System.out.println(garage.getCar("TUU329"));
        garage.fill(200);
    }
}
