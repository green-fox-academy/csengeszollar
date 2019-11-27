package Pirates;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pirate Jozsi = new Pirate("Jozsi", true, true);
        Pirate Beci = new Pirate("Beci", true, false);
        Pirate Renato = new Pirate("Renato", false, false);
        Pirate Jancsi = new Pirate("Jancsi", false, false);

        Ship unsinkable = new Ship();

        unsinkable.addPirate(Jozsi);
        unsinkable.addPirate(Beci);
        unsinkable.addPirate(Renato);
        unsinkable.addPirate(Jancsi);

        // Test:
        unsinkable.prepareForBattle();
        unsinkable.getPoorPirates();

        // Verify:
        System.out.println();
        System.out.println("Pirates' gold after last day: " + unsinkable.getGolds());

        System.out.println();
        System.out.println(Jozsi.toString());
        System.out.println(Beci.toString());
        System.out.println(Renato.toString());
        System.out.println(Jancsi.toString());
    }

}
