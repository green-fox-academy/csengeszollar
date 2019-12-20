package AircraftCarrier;

public class Aircraft {

    private String typeOfAircraft;
    private int currentAmo;
    private int maxAmmo;
    private int baseDamage;
    private int allDamage;


    public Aircraft(String typeOfAircraft) {
        this.currentAmo = 0;
        this.typeOfAircraft = typeOfAircraft;
    }

    public Aircraft(String typeOfAircraft, int currentAmo, int maxAmmo, int baseDamage) {
        this.typeOfAircraft = typeOfAircraft;
        this.currentAmo = 0;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
    }

    public int fight() {
        int damage = this.baseDamage * this.currentAmo;
        this.currentAmo = 0;
        this.allDamage += damage;
        return damage;
    }

    public int refill(int refillAmount) {
        int remainingAmmo;
        int missingAmoAmount = maxAmmo - currentAmo;
        if ((missingAmoAmount > 0) && (refillAmount >= missingAmoAmount)) {
            this.currentAmo += missingAmoAmount;
            remainingAmmo = refillAmount - missingAmoAmount;
            return remainingAmmo;
        } else if ((missingAmoAmount > 0) && (refillAmount <= missingAmoAmount)) {
            this.currentAmo += refillAmount;
            remainingAmmo = 0;
            return remainingAmmo;
        } else
            return remainingAmmo = refillAmount;
    }

    public String getStatus() {
        String status = "Type " + getTypeOfAircraft() + ", Ammo: " + getCurrentAmo() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + this.allDamage;
        return status;
    }

    public boolean isPriority() {
        if (getTypeOfAircraft() == "F35")
            return true;
        else
            return false;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }


    public int getCurrentAmo() {
        return currentAmo;
    }


    public int getMaxAmmo() {
        return maxAmmo;
    }


    public int getBaseDamage() {
        return baseDamage;
    }


    public int getAllDamage() {
        return allDamage;
    }
}
