package Sharpie;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie() {
        this.inkAmount = 100;
    }

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
        this.inkAmount = 100;

    }

    public void use() {
        this.inkAmount--;
    }


}
