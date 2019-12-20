package AircraftCarrier;

public class AircraftF16 extends Aircraft {
    public AircraftF16() {
        super("F16", 0, 8, 30);
    }

    public AircraftF16(String typeOfAircraft, int ammo, int maxAmmo, int baseDamage) {
        super("F16", ammo, 8, 30);
    }

}
