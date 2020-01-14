package FishTank;

public class Kong extends Fish {
    public Kong(String name) {
        this.setName(name);
        this.setHasMemoryProblem(false);
        this.setColor("gold");
        this.setWeight(1);
    }

    @Override
    public void feed() {
        setWeight(this.getWeight() + 2);
    }
}
