package SharpieSet;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie() {
        this.inkAmount = 100;
    }

    public Sharpie(String color) {
        this.color = color;
        this.width = 0.7f;
        this.inkAmount = 100;

    }

    @Override
    public String toString() {
        return color;
    }

    public void use() {

        this.inkAmount--;
        //  System.out.println(this.color + " ink amount: " + this.inkAmount);
    }


}
