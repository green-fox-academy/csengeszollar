package FishTank;

public class Clownfish extends Fish {
    String stripeColor;

    public Clownfish(String name){
        this.setName(name);
        this.setHasMemoryProblem(false);
        this.setWeight(1);
        this.stripeColor = "white";
        this.setColor("orange with " + this.stripeColor + " stripes");
    }

    @Override
    public void feed() {
        this.setWeight(this.getWeight()+1);
    }

}
