package FishTank;

public abstract class Fish {
    private String name;
    private int weight;
    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Fish(){
    }

    public void status() {
        String status = String.format("%s, weight: %dg, color: %s\n", name, weight,color);
        System.out.println(status);
    }

    public abstract void feed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




}
