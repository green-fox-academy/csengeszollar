package GreenFoxInheritance;

public class Sponsor extends Person {
    private String company;
    private int hiredStudent;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudent = 0;
    }
    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudent = 0;
    }

    public void hire() {
        hiredStudent++;
    }

    public void getGoal() {
        System.out.println("\nHire brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("who represents %s and hired %d students so far. ", this.company, this.hiredStudent);
    }
}
