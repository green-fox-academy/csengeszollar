package main.java.music;

public class BassGuitar  extends StringedInstrument{

    public BassGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    public BassGuitar() {
        super("Bass Guitar", 4);
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument that goes ");
        this.sound();
    }
}
