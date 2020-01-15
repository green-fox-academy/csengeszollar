package AnimalProtection;

public class Animal {
    private String ownerName;
    private String name;
    private boolean isHealthy;
    private int healCost;

    public Animal(){
    }

    public Animal(String name) {
        this.name = name;
    }

    public void heal() {
        isHealthy = true;
    }

    public boolean isAdoptable() {
        if (isHealthy = true){
            return true;
        } else return false;
    }

    public String toString() {
        String info = "";
        if (!isHealthy) {
            return info = name + " is not healthy (its healing costs: " + healCost + "€), and not adoptable\n";
        }else return info = name + " is healthy, and adoptable\n";
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getHealCost() {
        return healCost;
    }

    public void setHealCost(int healCost) {
        this.healCost = healCost;
    }
}

