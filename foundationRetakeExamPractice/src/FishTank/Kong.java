package FishTank;

public class Kong extends Fish {
    public Kong(String name) {
        super(name, 1, "blue");
    }

    @Override
    public void feed() {
        setWeight(this.getWeight() + 2);
    }
}
