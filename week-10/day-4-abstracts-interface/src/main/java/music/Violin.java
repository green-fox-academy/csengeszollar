package main.java.music;

public class Violin extends StringedInstrument {
    public Violin(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    public Violin() {
        super("Violin", 4);
    }

    @Override
    public void sound() {
        System.out.println("Schreech");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument that goes ");
        this.sound();
    }
}
