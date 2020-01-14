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
        this.isHealthy = true;
    }

    public boolean isAdoptable() {
        if (this.isHealthy = true){
            return true;
        } else return false;
    }

    public String toString() {
        String info = "";
        if (!this.isHealthy) {
            return info = this.name + " is not healthy (its healing costs: " + this.healCost + "€), and not adoptable\n";
        }else return info = this.name + " is healthy, and adoptable\n";
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

