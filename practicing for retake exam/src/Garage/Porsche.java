package Garage;

public class Porsche extends Car {

    public Porsche(String color, String licensePlate) {
        super(color, 60, licensePlate);

    }

    public int turbo() {
       return getSpeed() / 100 * 125;
    }

    @Override
    public void honk() {
        System.out.println("Tu-turu-turu");
    }
}
