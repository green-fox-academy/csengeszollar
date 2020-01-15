package FishTank;

public class Clownfish extends Fish {
    String stripeColor;

    public Clownfish(String name){
       super(name, 1, "orange");
        stripeColor = "white";
    }

    @Override
    public void status() {
        String status = String.format("%s, weight: %dg, color: %s with %s stripes\n", getName(), getWeight(),getColor(), stripeColor);
        System.out.println(status);
    }

    @Override
    public void feed() {
        this.setWeight(this.getWeight()+1);
    }

}
