package main.java.animals;

public abstract class Animal {


    private String name;
    private int age;
    private String gender;
    private boolean isFurry;
    private int numberOfLegs;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String gender, boolean isFurry) {
        this.name = name;
        this.age = age;
        this.gender = "male";
        this.isFurry = true;
    }

    public Animal(String name, int age, String gender, boolean isFurry, int numberOfLegs) {
        this.name = name;
        this.age = age;
        this.gender = "male";
        this.isFurry = true;
        this.numberOfLegs = numberOfLegs;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isFurry() {
        return isFurry;
    }

    public void setFurry(boolean furry) {
        isFurry = furry;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String breed();

    public void feed() {

    }

}
