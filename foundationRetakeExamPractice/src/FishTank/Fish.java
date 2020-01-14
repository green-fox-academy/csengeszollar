package FishTank;

public abstract class Fish {
    private String name;
    private int weight;
    private String color;
    private boolean hasMemoryProblem;

    public Fish(String name){
        this.name = name;
    }

    public Fish(){
    }

    public void status() {
        String status = String.format("%s, weight: %dg, color: %s, short-term memory loss: %b\n", name, weight,color, hasMemoryProblem);
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

    public boolean isHasMemoryProblem() {
        return hasMemoryProblem;
    }

    public void setHasMemoryProblem(boolean hasMemoryProblem) {
        this.hasMemoryProblem = hasMemoryProblem;
    }


}
