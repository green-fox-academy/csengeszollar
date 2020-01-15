package FishTank;

public class Tang extends Fish{
    boolean hasAMemoryProblem;

    public Tang(String name) {
        super(name, 1, "gold");
        hasAMemoryProblem = true;
    }

    @Override
    public void status() {
        String status = String.format("%s, weight: %dg, color: %s, short-term memory loss:%b\n", getName(), getWeight(),getColor(), hasAMemoryProblem);
        System.out.println(status);
    }

    @Override
    public void feed() {
        setWeight(this.getWeight() + 1);

    }
}
