package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }
    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }

    @Override
    public void sound() {
        System.out.println("Twang");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument that goes ");
        this.sound();
    }
}
