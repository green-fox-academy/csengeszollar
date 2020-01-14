package FishTank;

public class Tang extends Fish{

    public Tang(String name) {
        this.setName(name);
        this.setHasMemoryProblem(true);
        this.setColor("blue");
        this.setWeight(1);
    }

    @Override
    public void feed() {
        setWeight(this.getWeight() + 1);

    }
}
