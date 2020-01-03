package AircraftCarrier;

public class Main {
    public static void main(String[] args) {
        AircraftF16 F16 = new AircraftF16();
        AirCraftF35 F35 = new AirCraftF35();
        AirCraftF35 F35b = new AirCraftF35();
        Carrier aircraftCarrier1 = new Carrier(2300, 5000);
        Carrier aircraftCarrier2 = new Carrier(2300, 5000);
        aircraftCarrier1.addNewAircraft(F16);
        aircraftCarrier1.addNewAircraft(F35);
        aircraftCarrier1.addNewAircraft(F35b);


//        System.out.println(F16.getStatus());
//        System.out.println(F16.refill(6));
//        System.out.println(F16.getStatus());
//        System.out.println(F16.refill(300));
//        System.out.println(F16.getStatus());
//        System.out.println(F16.fight());
//        System.out.println(aircraftCarrier1.getStatus());
//
//        System.out.println(aircraftCarrier1.getMissingAmo());
        aircraftCarrier1.fillAircrafts();
        System.out.println(aircraftCarrier1.getStatus());
        aircraftCarrier1.fight(aircraftCarrier2);
        System.out.println(aircraftCarrier1.getStatus());
        aircraftCarrier1.fillAircrafts();
        System.out.println(aircraftCarrier1.getStatus());
        aircraftCarrier1.fight(aircraftCarrier2);
        System.out.println(aircraftCarrier2.getStatus());
        aircraftCarrier1.fillAircrafts();
        System.out.println(aircraftCarrier1.getStatus());

        
//
//        System.out.println(F16.getStatus());
//        System.out.println(F16.refill(500));
//        System.out.println(F16.isPriority());
//        System.out.println(F35.isPriority());
//        aircraftCarrier1.fillAircrafts();
//        System.out.println(aircraftCarrier1.getStatus());



    }
}
