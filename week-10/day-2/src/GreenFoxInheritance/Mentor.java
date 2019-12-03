package GreenFoxInheritance;

public class Mentor extends Person {
    private String level;

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public void getGoal() {
        System.out.println("\nEducate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("%s mentor. ",this.level);
    }
}
