package Farm;

public class Animal {

    int hungerValue;
    int thirstValue;
    String name;



    public Animal(String name) {
        this.hungerValue = 50;
        this.thirstValue = 50;
        this.name = name;


    }

    public void eat() {
        this.hungerValue--;
    }

    public void drink() {
        this.thirstValue--;
    }

    public void play() {
        this.hungerValue++;
        this.thirstValue++;
    }

    @Override
    public String toString() {
        String result = "";
        return name;
    }





}
