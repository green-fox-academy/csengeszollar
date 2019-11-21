package PetrolStation;

public class Station {
int gasAmount;

public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount++;
    System.out.println("car's gas amount: " + car.gasAmount + " station's gas amount " + this.gasAmount );
    // kell a string a két mennyiség közé, különben csak simán összeadja a két amountot
}

}
